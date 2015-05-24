package org.javaz.copse.model.iface;

import org.javaz.jdbc.base.*;
import java.util.*;
import java.io.Serializable;


public interface TimeBindingI extends MapConvertibleI  {
    public java.lang.Integer getId();
    public void setId(java.lang.Integer id);

    public java.lang.Boolean getEnabled();
    public void setEnabled(java.lang.Boolean enabled);

    public java.sql.Timestamp getFromTime();
    public void setFromTime(java.sql.Timestamp fromTime);

    public java.lang.Integer getRecordId();
    public void setRecordId(java.lang.Integer recordId);

    public java.sql.Timestamp getTillTime();
    public void setTillTime(java.sql.Timestamp tillTime);

    public java.lang.Integer getType();
    public void setType(java.lang.Integer type);


    public Map<String, String> toStringMap();

}
