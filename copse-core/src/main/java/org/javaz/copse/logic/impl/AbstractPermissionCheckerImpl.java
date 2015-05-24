
package org.javaz.copse.logic.impl;

import org.javaz.copse.logic.iface.*;
import org.javaz.copse.model.iface.*;

import java.util.*;

public abstract class AbstractPermissionCheckerImpl implements PermissionCheckerImplI {

    public AbstractPermissionCheckerImpl () {
    }

    public abstract AbstractPermissionCheckerImpl createNewInstance();


    public Object clone() throws CloneNotSupportedException {
        AbstractPermissionCheckerImpl clone = createNewInstance();
        return clone;
    }

    public abstract java.lang.Boolean checkPermissions(org.javaz.copse.logic.iface.UserProfileI profile, Integer entityId, String permissionFlag);
}
