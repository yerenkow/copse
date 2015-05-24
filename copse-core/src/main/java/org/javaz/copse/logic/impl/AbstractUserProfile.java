
package org.javaz.copse.logic.impl;

import org.javaz.copse.logic.iface.*;
import org.javaz.copse.model.iface.*;

import java.util.*;

public abstract class AbstractUserProfile implements UserProfileI {
    private java.lang.Integer id;
    private java.lang.String email;
    private java.util.HashMap flags;
    private java.util.ArrayList groups;
    private java.lang.Integer originalId;
    private java.lang.Integer parentId;

    public AbstractUserProfile () {
    }

    public abstract AbstractUserProfile createNewInstance();

    public java.lang.Integer getId() {
        return id;
    }

    public void setId(java.lang.Integer id) {
        this.id = id;
    }
    public java.lang.String getEmail() {
        return email;
    }

    public void setEmail(java.lang.String email) {
        this.email = email;
    }
    public java.util.HashMap getFlags() {
        return flags;
    }

    public void setFlags(java.util.HashMap flags) {
        this.flags = flags;
    }
    public java.util.ArrayList getGroups() {
        return groups;
    }

    public void setGroups(java.util.ArrayList groups) {
        this.groups = groups;
    }
    public java.lang.Integer getOriginalId() {
        return originalId;
    }

    public void setOriginalId(java.lang.Integer originalId) {
        this.originalId = originalId;
    }
    public java.lang.Integer getParentId() {
        return parentId;
    }

    public void setParentId(java.lang.Integer parentId) {
        this.parentId = parentId;
    }

    public Object clone() throws CloneNotSupportedException {
        AbstractUserProfile clone = createNewInstance();
        clone.setId(getId());
        clone.setEmail(getEmail());
        clone.setFlags(getFlags());
        clone.setGroups(getGroups());
        clone.setOriginalId(getOriginalId());
        clone.setParentId(getParentId());
        return clone;
    }

    public abstract List getGroupIds();
    public abstract java.lang.String getFlag(String key);
    public abstract void setFlag(String key, String value);
}
