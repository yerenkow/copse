package org.javaz.copse.model.iface;

import org.javaz.jdbc.base.*;
import java.util.*;
import java.io.Serializable;


public interface GroupI extends MapConvertibleI  {
    public java.lang.Integer getId();
    public void setId(java.lang.Integer id);

    public java.lang.String getCode();
    public void setCode(java.lang.String code);

    public java.lang.String getComments();
    public void setComments(java.lang.String comments);

    public java.lang.Boolean getEnabled();
    public void setEnabled(java.lang.Boolean enabled);

    public java.lang.Integer getParentGroupId();
    public void setParentGroupId(java.lang.Integer parentGroupId);

    public java.lang.String getTitle();
    public void setTitle(java.lang.String title);


    public Map<String, String> toStringMap();

}
