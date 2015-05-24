package org.javaz.copse.model.iface;

import org.javaz.jdbc.base.*;
import java.util.*;
import java.io.Serializable;


public interface ActionButtonI extends MapConvertibleI  {
    public java.lang.Integer getId();
    public void setId(java.lang.Integer id);

    public java.lang.String getAction();
    public void setAction(java.lang.String action);

    public java.lang.String getApplicableActionList();
    public void setApplicableActionList(java.lang.String applicableActionList);

    public java.lang.Integer getEntityDescriptorTypeId();
    public void setEntityDescriptorTypeId(java.lang.Integer entityDescriptorTypeId);

    public java.lang.Integer getEntityId();
    public void setEntityId(java.lang.Integer entityId);

    public java.lang.String getJsCode();
    public void setJsCode(java.lang.String jsCode);

    public java.lang.Integer getOrderValue();
    public void setOrderValue(java.lang.Integer orderValue);

    public java.lang.String getRenderActionList();
    public void setRenderActionList(java.lang.String renderActionList);

    public java.lang.String getRequiredPermissions();
    public void setRequiredPermissions(java.lang.String requiredPermissions);

    public java.lang.Integer getSelectionType();
    public void setSelectionType(java.lang.Integer selectionType);

    public java.lang.String getTitle();
    public void setTitle(java.lang.String title);


    public Map<String, String> toStringMap();

}
