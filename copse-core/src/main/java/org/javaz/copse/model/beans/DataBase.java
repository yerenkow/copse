
package org.javaz.copse.model.beans;

import org.javaz.copse.model.iface.*;

import java.util.*;
import java.sql.*;
import java.io.Serializable;

public  class DataBase implements DataBaseI {
    public static final String F_ID = "id";
    public static final String F_CONFIG = "config";
    public static final String F_FACTORY_ID = "factory_id";
    public static final String F_LOGIN = "login";
    public static final String F_NAME = "name";
    public static final String F_PASSWORD = "password";
    public static final String F_URL = "url";

    private java.lang.Integer id;
    private java.lang.String config;
    private java.lang.Integer factoryId;
    private java.lang.String login;
    private java.lang.String name;
    private java.lang.String password;
    private java.lang.String url;

    public DataBase () {
    }

    public DataBase createNewInstance() {
        return new DataBase();
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
    public java.lang.String getConfig() {
        return config;
    }

    public void setConfig(java.lang.String config) {
        this.config = config;
    }
    public java.lang.Integer getFactoryId() {
        return factoryId;
    }

    public void setFactoryId(java.lang.Integer factoryId) {
        this.factoryId = factoryId;
    }
    public java.lang.String getLogin() {
        return login;
    }

    public void setLogin(java.lang.String login) {
        this.login = login;
    }
    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }
    public java.lang.String getPassword() {
        return password;
    }

    public void setPassword(java.lang.String password) {
        this.password = password;
    }
    public java.lang.String getUrl() {
        return url;
    }

    public void setUrl(java.lang.String url) {
        this.url = url;
    }

    public Object clone() throws CloneNotSupportedException {
        DataBase clone = createNewInstance();
        clone.setId(getId());
        clone.setConfig(getConfig());
        clone.setFactoryId(getFactoryId());
        clone.setLogin(getLogin());
        clone.setName(getName());
        clone.setPassword(getPassword());
        clone.setUrl(getUrl());
        return clone;
    }

    public Map<String, String> toStringMap() {
        Map<String, String> h = new HashMap<String, String>();
        if(id != null) { h.put(F_ID, "" + getId()); }
        if(config != null) { h.put(F_CONFIG, "" + getConfig()); }
        if(factoryId != null) { h.put(F_FACTORY_ID, "" + getFactoryId()); }
        if(login != null) { h.put(F_LOGIN, "" + getLogin()); }
        if(name != null) { h.put(F_NAME, "" + getName()); }
        if(password != null) { h.put(F_PASSWORD, "" + getPassword()); }
        if(url != null) { h.put(F_URL, "" + getUrl()); }
        return h;
    }

}
