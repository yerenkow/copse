package org.javaz.copse.logic.impl;

import org.javaz.copse.model.iface.UserI;

import java.util.List;

/**
 */
public class UserProfile extends AbstractUserProfile {

    public UserProfile() {
        super();
    }

    public UserProfile(UserI user) {
        super();
        setId(user.getId());
        setEmail(user.getOauthId());
        setOriginalId(user.getId());
    }

    @Override
    public AbstractUserProfile createNewInstance() {
        return new UserProfile();
    }

    @Override
    public List getGroupIds() {
        return null;
    }

    @Override
    public String getFlag(String key) {
        return null;
    }

    @Override
    public void setFlag(String key, String value) {

    }
}
