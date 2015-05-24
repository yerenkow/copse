package org.javaz.copse.model.iface;

import org.javaz.jdbc.base.*;
import java.util.*;
import java.io.Serializable;


public interface UserToGroupI extends MapConvertibleI  {
    public java.lang.Integer getId();
    public void setId(java.lang.Integer id);

    public java.lang.Integer getGroupId();
    public void setGroupId(java.lang.Integer groupId);

    public java.lang.Integer getUserId();
    public void setUserId(java.lang.Integer userId);


    public Map<String, String> toStringMap();

}
