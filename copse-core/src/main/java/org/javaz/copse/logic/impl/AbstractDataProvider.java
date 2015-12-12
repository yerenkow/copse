
package org.javaz.copse.logic.impl;

import org.javaz.copse.logic.iface.*;
import org.javaz.copse.model.iface.*;

import java.util.*;

public abstract class AbstractDataProvider implements DataProviderI {

    public AbstractDataProvider () {
    }

    public abstract AbstractDataProvider createNewInstance();


    public Object clone() throws CloneNotSupportedException {
        AbstractDataProvider clone = createNewInstance();
        return clone;
    }

    public abstract void init(org.javaz.copse.model.iface.DataBaseI db);
    public abstract org.javaz.copse.model.iface.EntityDescriptorI getEntityDescriptor(Comparable id);
    public abstract DescriptorImplI getDescriptorImpl(Comparable id);
    public abstract org.javaz.copse.model.iface.MenuItemI getMenuItem(Comparable id);
    public abstract List<MenuItemI> getAllMenuItemByPermission(UserProfileI profile, String permissionFlag);
    public abstract List getAllLanguages();
    public abstract List getPluginsForEntity(Comparable entityId);
    public abstract List getButtonsForEntity(Comparable entityId);
    public abstract List<HandlerI> getHandlersForEntity(Comparable entityId, String action);
    public abstract UserI getUser(String oauthId);
    public abstract UserProfileI changeUserProfile(UserProfileI profile, Integer otherId);
    public abstract java.util.HashMap getOtherUserIdGrants(UserProfileI profile);
    public abstract UserProfileI authorizeProfile(String oauthId, ParameterProviderI provider);
    public abstract List<PermissionCheckerImplI> getPermissionCheckerImpls(Comparable entityId);
    public abstract DataBaseI getDataBase(Comparable id);
    public abstract boolean checkPermission(UserProfileI profileI, Comparable entityId, String flag);
}
