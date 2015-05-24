
package org.javaz.copse.model.beans;

import org.javaz.copse.model.iface.*;

import java.util.*;
import java.sql.*;
import java.io.Serializable;

public  class TimeBinding implements TimeBindingI {
    public static final String F_ID = "id";
    public static final String F_ENABLED = "enabled";
    public static final String F_FROM_TIME = "from_time";
    public static final String F_RECORD_ID = "record_id";
    public static final String F_TILL_TIME = "till_time";
    public static final String F_TYPE = "type";

    private java.lang.Integer id;
    private java.lang.Boolean enabled;
    private java.sql.Timestamp fromTime;
    private java.lang.Integer recordId;
    private java.sql.Timestamp tillTime;
    private java.lang.Integer type;

    public TimeBinding () {
    }

    public TimeBinding createNewInstance() {
        return new TimeBinding();
    }

    public java.lang.Integer getId() {
        return id;
    }

    public void setId(java.lang.Integer id) {
        this.id = id;
    }
    public Comparable getPrimaryKey() {
        return id;
    }

    public void setGeneratedPrimaryKey(Comparable key) {
        this.id = ((java.lang.Number) key).intValue();
    }
    public java.lang.Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(java.lang.Boolean enabled) {
        this.enabled = enabled;
    }
    public java.sql.Timestamp getFromTime() {
        return fromTime;
    }

    public void setFromTime(java.sql.Timestamp fromTime) {
        this.fromTime = fromTime;
    }
    public java.lang.Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(java.lang.Integer recordId) {
        this.recordId = recordId;
    }
    public java.sql.Timestamp getTillTime() {
        return tillTime;
    }

    public void setTillTime(java.sql.Timestamp tillTime) {
        this.tillTime = tillTime;
    }
    public java.lang.Integer getType() {
        return type;
    }

    public void setType(java.lang.Integer type) {
        this.type = type;
    }

    public Object clone() throws CloneNotSupportedException {
        TimeBinding clone = createNewInstance();
        clone.setId(getId());
        clone.setEnabled(getEnabled());
        clone.setFromTime(getFromTime());
        clone.setRecordId(getRecordId());
        clone.setTillTime(getTillTime());
        clone.setType(getType());
        return clone;
    }

    public Map<String, String> toStringMap() {
        Map<String, String> h = new HashMap<String, String>();
        if(id != null) { h.put(F_ID, "" + getId()); }
        if(enabled != null) { h.put(F_ENABLED, "" + getEnabled()); }
        if(fromTime != null) { h.put(F_FROM_TIME, "" + getFromTime()); }
        if(recordId != null) { h.put(F_RECORD_ID, "" + getRecordId()); }
        if(tillTime != null) { h.put(F_TILL_TIME, "" + getTillTime()); }
        if(type != null) { h.put(F_TYPE, "" + getType()); }
        return h;
    }

}
