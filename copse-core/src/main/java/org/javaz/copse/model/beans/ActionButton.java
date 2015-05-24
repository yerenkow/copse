
package org.javaz.copse.model.beans;

import org.javaz.copse.model.iface.*;

import java.util.*;
import java.sql.*;
import java.io.Serializable;

public  class ActionButton implements ActionButtonI {
    public static final String F_ID = "id";
    public static final String F_ACTION = "action";
    public static final String F_APPLICABLE_ACTION_LIST = "applicable_action_list";
    public static final String F_ENTITY_DESCRIPTOR_TYPE_ID = "entity_descriptor_type_id";
    public static final String F_ENTITY_ID = "entity_id";
    public static final String F_JS_CODE = "js_code";
    public static final String F_ORDER_VALUE = "order_value";
    public static final String F_RENDER_ACTION_LIST = "render_action_list";
    public static final String F_REQUIRED_PERMISSIONS = "required_permissions";
    public static final String F_SELECTION_TYPE = "selection_type";
    public static final String F_TITLE = "title";

    private java.lang.Integer id;
    private java.lang.String action;
    private java.lang.String applicableActionList;
    private java.lang.Integer entityDescriptorTypeId;
    private java.lang.Integer entityId;
    private java.lang.String jsCode;
    private java.lang.Integer orderValue;
    private java.lang.String renderActionList;
    private java.lang.String requiredPermissions;
    private java.lang.Integer selectionType;
    private java.lang.String title;

    public ActionButton () {
    }

    public ActionButton createNewInstance() {
        return new ActionButton();
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
    public java.lang.String getAction() {
        return action;
    }

    public void setAction(java.lang.String action) {
        this.action = action;
    }
    public java.lang.String getApplicableActionList() {
        return applicableActionList;
    }

    public void setApplicableActionList(java.lang.String applicableActionList) {
        this.applicableActionList = applicableActionList;
    }
    public java.lang.Integer getEntityDescriptorTypeId() {
        return entityDescriptorTypeId;
    }

    public void setEntityDescriptorTypeId(java.lang.Integer entityDescriptorTypeId) {
        this.entityDescriptorTypeId = entityDescriptorTypeId;
    }
    public java.lang.Integer getEntityId() {
        return entityId;
    }

    public void setEntityId(java.lang.Integer entityId) {
        this.entityId = entityId;
    }
    public java.lang.String getJsCode() {
        return jsCode;
    }

    public void setJsCode(java.lang.String jsCode) {
        this.jsCode = jsCode;
    }
    public java.lang.Integer getOrderValue() {
        return orderValue;
    }

    public void setOrderValue(java.lang.Integer orderValue) {
        this.orderValue = orderValue;
    }
    public java.lang.String getRenderActionList() {
        return renderActionList;
    }

    public void setRenderActionList(java.lang.String renderActionList) {
        this.renderActionList = renderActionList;
    }
    public java.lang.String getRequiredPermissions() {
        return requiredPermissions;
    }

    public void setRequiredPermissions(java.lang.String requiredPermissions) {
        this.requiredPermissions = requiredPermissions;
    }
    public java.lang.Integer getSelectionType() {
        return selectionType;
    }

    public void setSelectionType(java.lang.Integer selectionType) {
        this.selectionType = selectionType;
    }
    public java.lang.String getTitle() {
        return title;
    }

    public void setTitle(java.lang.String title) {
        this.title = title;
    }

    public Object clone() throws CloneNotSupportedException {
        ActionButton clone = createNewInstance();
        clone.setId(getId());
        clone.setAction(getAction());
        clone.setApplicableActionList(getApplicableActionList());
        clone.setEntityDescriptorTypeId(getEntityDescriptorTypeId());
        clone.setEntityId(getEntityId());
        clone.setJsCode(getJsCode());
        clone.setOrderValue(getOrderValue());
        clone.setRenderActionList(getRenderActionList());
        clone.setRequiredPermissions(getRequiredPermissions());
        clone.setSelectionType(getSelectionType());
        clone.setTitle(getTitle());
        return clone;
    }

    public Map<String, String> toStringMap() {
        Map<String, String> h = new HashMap<String, String>();
        if(id != null) { h.put(F_ID, "" + getId()); }
        if(action != null) { h.put(F_ACTION, "" + getAction()); }
        if(applicableActionList != null) { h.put(F_APPLICABLE_ACTION_LIST, "" + getApplicableActionList()); }
        if(entityDescriptorTypeId != null) { h.put(F_ENTITY_DESCRIPTOR_TYPE_ID, "" + getEntityDescriptorTypeId()); }
        if(entityId != null) { h.put(F_ENTITY_ID, "" + getEntityId()); }
        if(jsCode != null) { h.put(F_JS_CODE, "" + getJsCode()); }
        if(orderValue != null) { h.put(F_ORDER_VALUE, "" + getOrderValue()); }
        if(renderActionList != null) { h.put(F_RENDER_ACTION_LIST, "" + getRenderActionList()); }
        if(requiredPermissions != null) { h.put(F_REQUIRED_PERMISSIONS, "" + getRequiredPermissions()); }
        if(selectionType != null) { h.put(F_SELECTION_TYPE, "" + getSelectionType()); }
        if(title != null) { h.put(F_TITLE, "" + getTitle()); }
        return h;
    }

}
