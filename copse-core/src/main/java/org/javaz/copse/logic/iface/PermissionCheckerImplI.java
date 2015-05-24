package org.javaz.copse.logic.iface;

import org.javaz.copse.model.iface.*;

import java.util.*;
import java.io.Serializable;


public interface PermissionCheckerImplI  {

    public java.lang.Boolean checkPermissions(org.javaz.copse.logic.iface.UserProfileI profile, Integer entityId, String permissionFlag);
}
