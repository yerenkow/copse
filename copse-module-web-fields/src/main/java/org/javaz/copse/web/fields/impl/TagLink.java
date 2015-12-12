
package org.javaz.copse.web.fields.impl;

import org.javaz.copse.web.fields.iface.*;

import java.util.*;
import java.sql.*;
import java.io.Serializable;

public  class TagLink implements TagLinkI {
    public static final String F_ID = "id";
    public static final String F_CATEGORY_ID = "category_id";
    public static final String F_RECORD_ID = "record_id";
    public static final String F_TAG_ID = "tag_id";

    private java.lang.Integer id;
    private java.lang.Integer categoryId;
    private java.lang.Integer recordId;
    private java.lang.Integer tagId;

    public TagLink () {
    }

    public TagLink createNewInstance() {
        return new TagLink();
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
    public java.lang.Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(java.lang.Integer recordId) {
        this.recordId = recordId;
    }
    public java.lang.Integer getTagId() {
        return tagId;
    }

    public void setTagId(java.lang.Integer tagId) {
        this.tagId = tagId;
    }

    public Object clone() throws CloneNotSupportedException {
        TagLink clone = createNewInstance();
        clone.setId(getId());
        clone.setCategoryId(getCategoryId());
        clone.setRecordId(getRecordId());
        clone.setTagId(getTagId());
        return clone;
    }

    public Map<String, String> toStringMap() {
        Map<String, String> h = new HashMap<String, String>();
        if(id != null) { h.put(F_ID, "" + getId()); }
        if(categoryId != null) { h.put(F_CATEGORY_ID, "" + getCategoryId()); }
        if(recordId != null) { h.put(F_RECORD_ID, "" + getRecordId()); }
        if(tagId != null) { h.put(F_TAG_ID, "" + getTagId()); }
        return h;
    }

}
