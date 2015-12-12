package org.javaz.copse.logic.impl;

import org.javaz.copse.logic.iface.ParameterProviderI;
import org.javaz.copse.logic.iface.UserProfileI;

/**
 * Static point of accessing User Profiles stored in session
 */
public class UserProfileSessionManager {

    public static UserProfileI getProfile(ParameterProviderI provider) {
        return (UserProfileI) provider.getAttributeFromSession(UserProfileI.class.getName());
    }

    public static void storeProfile(ParameterProviderI provider, UserProfileI userProfileI) {
        provider.setAttributeInSession(UserProfileI.class.getName(), userProfileI);
    }
}
