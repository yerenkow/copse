package org.javaz.copse.web.fields.iface;

import org.javaz.jdbc.base.*;
import java.util.*;
import java.io.Serializable;


public interface TagLinkI extends MapConvertibleI  {
    public java.lang.Integer getId();
    public void setId(java.lang.Integer id);

    public java.lang.Integer getCategoryId();
    public void setCategoryId(java.lang.Integer categoryId);

    public java.lang.Integer getRecordId();
    public void setRecordId(java.lang.Integer recordId);

    public java.lang.Integer getTagId();
    public void setTagId(java.lang.Integer tagId);


    public Map<String, String> toStringMap();

}
