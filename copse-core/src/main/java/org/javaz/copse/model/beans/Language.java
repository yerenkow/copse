
package org.javaz.copse.model.beans;

import org.javaz.copse.model.iface.*;

import java.util.*;
import java.sql.*;
import java.io.Serializable;

public  class Language implements LanguageI {
    public static final String F_ID = "id";
    public static final String F_TITLE = "title";

    private java.lang.Integer id;
    private java.lang.String title;

    public Language () {
    }

    public Language createNewInstance() {
        return new Language();
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
    public java.lang.String getTitle() {
        return title;
    }

    public void setTitle(java.lang.String title) {
        this.title = title;
    }

    public Object clone() throws CloneNotSupportedException {
        Language clone = createNewInstance();
        clone.setId(getId());
        clone.setTitle(getTitle());
        return clone;
    }

    public Map<String, String> toStringMap() {
        Map<String, String> h = new HashMap<String, String>();
        if(id != null) { h.put(F_ID, "" + getId()); }
        if(title != null) { h.put(F_TITLE, "" + getTitle()); }
        return h;
    }

}
