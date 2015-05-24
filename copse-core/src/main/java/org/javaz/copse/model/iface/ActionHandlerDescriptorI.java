package org.javaz.copse.model.iface;

import org.javaz.jdbc.base.*;
import java.util.*;
import java.io.Serializable;


public interface ActionHandlerDescriptorI extends MapConvertibleI  {
    public java.lang.Integer getId();
    public void setId(java.lang.Integer id);

    public java.lang.String getApplicableActionList();
    public void setApplicableActionList(java.lang.String applicableActionList);

    public java.lang.String getConfig();
    public void setConfig(java.lang.String config);

    public java.lang.Integer getEntityDescriptorTypeId();
    public void setEntityDescriptorTypeId(java.lang.Integer entityDescriptorTypeId);

    public java.lang.Integer getEntityId();
    public void setEntityId(java.lang.Integer entityId);

    public java.lang.Integer getFactoryId();
    public void setFactoryId(java.lang.Integer factoryId);

    public java.lang.Integer getOrderValue();
    public void setOrderValue(java.lang.Integer orderValue);


    public Map<String, String> toStringMap();

}
