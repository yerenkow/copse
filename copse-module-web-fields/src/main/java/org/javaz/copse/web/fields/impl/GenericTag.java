
package org.javaz.copse.web.fields.impl;

import org.javaz.copse.web.fields.iface.*;

import java.util.*;
import java.sql.*;
import java.io.Serializable;

public  class GenericTag implements GenericTagI {
    public static final String F_ID = "id";
    public static final String F_CATEGORY_ID = "category_id";
    public static final String F_TITLE = "title";

    private java.lang.Integer id;
    private java.lang.Integer categoryId;
    private java.lang.String title;

    public GenericTag () {
    }

    public GenericTag createNewInstance() {
        return new GenericTag();
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
    public java.lang.Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(java.lang.Integer categoryId) {
        this.categoryId = categoryId;
    }
    public java.lang.String getTitle() {
        return title;
    }

    public void setTitle(java.lang.String title) {
        this.title = title;
    }

    public Object clone() throws CloneNotSupportedException {
        GenericTag clone = createNewInstance();
        clone.setId(getId());
        clone.setCategoryId(getCategoryId());
        clone.setTitle(getTitle());
        return clone;
    }

    public Map<String, String> toStringMap() {
        Map<String, String> h = new HashMap<String, String>();
        if(id != null) { h.put(F_ID, "" + getId()); }
        if(categoryId != null) { h.put(F_CATEGORY_ID, "" + getCategoryId()); }
        if(title != null) { h.put(F_TITLE, "" + getTitle()); }
        return h;
    }

}
