package org.javaz.copse.logic.impl;

import org.javaz.copse.logic.iface.*;
import org.javaz.copse.model.helper.*;
import org.javaz.copse.model.iface.*;
import org.javaz.jdbc.base.GenericMapConvertibleDAO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 */
public class JdbcDataProvider extends AbstractDataProvider {

    private GenericMapConvertibleDAO dao;
    private EntityDescriptorHelper entityDescriptorHelper = new EntityDescriptorHelper();
    private EntityDescriptorTypeHelper entityDescriptorTypeHelper = new EntityDescriptorTypeHelper();
    private GenericFactoryHelper genericFactoryHelper = new GenericFactoryHelper();
    private MenuItemHelper menuItemHelper = new MenuItemHelper();
    private PluginHelper pluginHelper = new PluginHelper();
    private ActionButtonHelper actionButtonHelper = new ActionButtonHelper();
    private ActionHandlerDescriptorHelper actionHandlerDescriptorHelper = new ActionHandlerDescriptorHelper();
    private PermissionCheckerHelper permissionCheckerHelper = new PermissionCheckerHelper();
    private DataBaseHelper dataBaseHelper = new DataBaseHelper();

    private UserHelper userHelper = new UserHelper();

    private FactoryTool factoryTool = new FactoryTool();

    @Override
    public AbstractDataProvider createNewInstance() {
        return new JdbcDataProvider();
    }

    @Override
    public void init(DataBaseI db) {
        dao = new GenericMapConvertibleDAO(db.getUrl());
    }

    @Override
    public EntityDescriptorI getEntityDescriptor(Comparable id) {
        return dao.findById(id, entityDescriptorHelper);
    }

    @Override
    public DescriptorImplI getDescriptorImpl(Comparable id) {
        EntityDescriptorI descriptor = getEntityDescriptor(id);
        Integer typeId = descriptor.getTypeId();
        EntityDescriptorTypeI descriptorTypeI = dao.findById(typeId, entityDescriptorTypeHelper);
        GenericFactoryI factoryI = dao.findById(descriptorTypeI.getFactoryId(), genericFactoryHelper);

        try {
            return factoryTool.createInstance(factoryI.getFactoryClass(), id, this);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public MenuItemI getMenuItem(Comparable id) {
        return dao.findById(id, menuItemHelper);
    }

    @Override
    public List<org.javaz.copse.model.iface.MenuItemI> getAllMenuItemByPermission(UserProfileI profile, String permissionFlag) {
        //todo filter them by permission flags
        return dao.all(menuItemHelper);
    }

    @Override
    public List getAllLanguages() {
        return null;
    }

    @Override
    public List getPluginsForEntity(Comparable entityId) {
        return dao.findByConditions(" where entity_id = ? ", createParams(entityId), pluginHelper);
    }

    @Override
    public List getButtonsForEntity(Comparable entityId) {
        HashMap<Integer, Object> params = new HashMap<Integer, Object>();
        return dao.findByConditions(" where entity_id = ? ", createParams(entityId), actionButtonHelper);
    }

    private HashMap<Integer, Object> createParams(Object param1) {
        HashMap<Integer, Object> params = new HashMap<Integer, Object>();
        params.put(1, param1);
        return params;
    }

    @Override
    public UserI getUser(String oauthId) {
        List<UserI> users = dao.findByConditions(" where oauth_id = ? ", createParams(oauthId), userHelper);
        if (!users.isEmpty()) {
            return users.iterator().next();
        }
        return null;
    }

    @Override
    public UserProfileI changeUserProfile(UserProfileI profile, Integer otherId) {
        return null;
    }

    @Override
    public UserProfileI authorizeProfile(String oauthId, ParameterProviderI provider) {
        UserI user = getUser(oauthId);
        if (user == null) {
            return null;
        }
        UserProfile userProfile = new UserProfile(user);
        UserProfileSessionManager.storeProfile(provider, userProfile);
        return userProfile;
    }

    @Override
    public HashMap getOtherUserIdGrants(UserProfileI profile) {
        return null;
    }

    @Override
    public List<PermissionCheckerImplI> getPermissionCheckerImpls(Comparable entityId) {
        EntityDescriptorI entityDescriptor = getEntityDescriptor(entityId);
        List<PermissionCheckerI> checkerIList = dao.findByConditions(" where entity_descriptor_type_id = ? ",
                createParams(entityDescriptor.getTypeId()), permissionCheckerHelper);
        ArrayList<PermissionCheckerImplI> list = new ArrayList<PermissionCheckerImplI>();
        for (PermissionCheckerI checkerI : checkerIList) {
            GenericFactoryI factoryI = dao.findById(checkerI.getFactoryId(), genericFactoryHelper);
            try {
                list.add(factoryTool.<PermissionCheckerImplI>createInstance(factoryI.getFactoryClass(),
                        checkerI.getId(), this));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    @Override
    public boolean checkPermission(UserProfileI profileI, Comparable entityId, String flag) {
        List<PermissionCheckerImplI> impls = getPermissionCheckerImpls(entityId);
        for (PermissionCheckerImplI impl : impls) {
            Boolean check = impl.checkPermissions(profileI, entityId, flag);
            if (!check) {
                return false;
            }
        }
        return true;
    }

    public DataBaseI getDataBase(Comparable id) {
        return dao.findById(id, dataBaseHelper);
    }

    @Override
    public List<HandlerI> getHandlersForEntity(Comparable entityId, String action) {
        EntityDescriptorI descriptor = getEntityDescriptor(entityId);
        HashMap<Integer, Object> params = createParams(entityId);
        params.put(2, descriptor.getTypeId());
        params.put(3, "%." + action + ".%");
        List<ActionHandlerDescriptorI> actionHandlerDescriptorIs = dao.findByConditions(
                " where (entity_id = ? or entity_descriptor_type_id = ?) and applicable_action_list like ? ", params,
                actionHandlerDescriptorHelper);


        ArrayList<HandlerI> handlerIs = new ArrayList<HandlerI>(actionHandlerDescriptorIs.size());
        for (ActionHandlerDescriptorI handlerDescriptorI : actionHandlerDescriptorIs) {
            GenericFactoryI factoryI = dao.findById(handlerDescriptorI.getFactoryId(), genericFactoryHelper);

            HandlerI instance = null;
            try {
                instance = factoryTool.createInstance(factoryI.getFactoryClass(), handlerDescriptorI.getId(), this);
                instance.init(handlerDescriptorI.getConfig());
                handlerIs.add(instance);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return handlerIs;
    }

    public GenericMapConvertibleDAO getDao() {
        return dao;
    }
}
