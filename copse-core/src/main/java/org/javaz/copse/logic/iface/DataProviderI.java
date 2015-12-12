package org.javaz.copse.logic.iface;

import org.javaz.copse.model.iface.*;
import org.javaz.jdbc.base.GenericMapConvertibleDAO;

import java.util.*;
import java.io.Serializable;


public interface DataProviderI  {

    void init(org.javaz.copse.model.iface.DataBaseI db);
    org.javaz.copse.model.iface.EntityDescriptorI getEntityDescriptor(Comparable id);
    DescriptorImplI getDescriptorImpl(Comparable id);
    org.javaz.copse.model.iface.MenuItemI getMenuItem(Comparable id);
    List<MenuItemI> getAllMenuItemByPermission(UserProfileI profile, String permissionFlag);
    List getAllLanguages();
    List getPluginsForEntity(Comparable entityId);
    List getButtonsForEntity(Comparable entityId);
    List<HandlerI> getHandlersForEntity(Comparable entityId, String action);
    UserI getUser(String oauthId);
    UserProfileI changeUserProfile(UserProfileI profile, Integer otherId);
    java.util.HashMap getOtherUserIdGrants(UserProfileI profile);
    UserProfileI authorizeProfile(String oauthId, ParameterProviderI provider);
    List<PermissionCheckerImplI> getPermissionCheckerImpls(Comparable entityId);
    boolean checkPermission(UserProfileI profileI, Comparable entityId, String flag);
    DataBaseI getDataBase(Comparable id);
    GenericMapConvertibleDAO getDao();
}
