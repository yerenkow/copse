package org.javaz.copse.logic.iface;

import org.javaz.copse.model.iface.*;

import java.util.*;
import java.io.Serializable;


public interface DataProviderI  {

    public void init(org.javaz.copse.model.iface.DataBaseI db);
    public org.javaz.copse.model.iface.EntityDescriptorI getEntityDescriptor(Comparable id);
    public DescriptorImplI getDescriptorImpl(Comparable id);
    public org.javaz.copse.model.iface.MenuItemI getMenuItem(Comparable id);
    public List<MenuItemI> getAllMenuItemByPermission(UserProfileI profile, String permissionFlag);
    public List getAllLanguages();
    public List getPluginsForEntity(Comparable entityId);
    public List getButtonsForEntity(Comparable entityId);
    public List<HandlerI> getHandlersForEntity(Comparable entityId, String action);
    public UserI getUser(String oauthId);
    public UserProfileI changeUserProfile(UserProfileI profile, Integer otherId);
    public java.util.HashMap getOtherUserIdGrants(UserProfileI profile);
    public UserProfileI getProfile(ParameterProviderI provider);
    public UserProfileI authorizeProfile(String oauthId, ParameterProviderI provider);
    public List<PermissionCheckerImplI> getPermissionCheckerImpls(Comparable entityId);
    public DataBaseI getDataBase(Comparable id);
}
