package org.javaz.copse.logic.iface;

import org.javaz.copse.model.iface.*;

import java.util.*;
import java.io.Serializable;


public interface UserProfileI  {
    public java.lang.Integer getId();
    public void setId(java.lang.Integer id);

    public java.lang.String getEmail();
    public void setEmail(java.lang.String email);

    public java.util.HashMap getFlags();
    public void setFlags(java.util.HashMap flags);

    public java.util.ArrayList getGroups();
    public void setGroups(java.util.ArrayList groups);

    public java.lang.Integer getOriginalId();
    public void setOriginalId(java.lang.Integer originalId);

    public java.lang.Integer getParentId();
    public void setParentId(java.lang.Integer parentId);


    public List getGroupIds();
    public java.lang.String getFlag(String key);
    public void setFlag(String key, String value);
}
