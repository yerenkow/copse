package org.javaz.copse.model.iface;

import org.javaz.jdbc.base.*;
import java.util.*;
import java.io.Serializable;


public interface UserI extends MapConvertibleI  {
    public java.lang.Integer getId();
    public void setId(java.lang.Integer id);

    public java.lang.String getComments();
    public void setComments(java.lang.String comments);

    public java.lang.Boolean getEnabled();
    public void setEnabled(java.lang.Boolean enabled);

    public java.lang.String getName();
    public void setName(java.lang.String name);

    public java.lang.String getOauthId();
    public void setOauthId(java.lang.String oauthId);

    public java.lang.Integer getParentId();
    public void setParentId(java.lang.Integer parentId);


    public Map<String, String> toStringMap();

}
