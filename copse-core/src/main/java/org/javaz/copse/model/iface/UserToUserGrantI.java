package org.javaz.copse.model.iface;

import org.javaz.jdbc.base.*;
import java.util.*;
import java.io.Serializable;


public interface UserToUserGrantI extends MapConvertibleI  {
    public java.lang.Integer getId();
    public void setId(java.lang.Integer id);

    public java.lang.Integer getChildUserId();
    public void setChildUserId(java.lang.Integer childUserId);

    public java.lang.String getComments();
    public void setComments(java.lang.String comments);

    public java.sql.Timestamp getCreatedWhen();
    public void setCreatedWhen(java.sql.Timestamp createdWhen);

    public java.lang.Boolean getEnabled();
    public void setEnabled(java.lang.Boolean enabled);

    public java.lang.Integer getParentUserId();
    public void setParentUserId(java.lang.Integer parentUserId);


    public Map<String, String> toStringMap();

}
