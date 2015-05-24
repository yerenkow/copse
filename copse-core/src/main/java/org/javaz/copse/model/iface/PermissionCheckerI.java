package org.javaz.copse.model.iface;

import org.javaz.jdbc.base.*;
import java.util.*;
import java.io.Serializable;


public interface PermissionCheckerI extends MapConvertibleI  {
    public java.lang.Integer getId();
    public void setId(java.lang.Integer id);

    public java.lang.Integer getEntityDescriptorTypeId();
    public void setEntityDescriptorTypeId(java.lang.Integer entityDescriptorTypeId);

    public java.lang.Integer getEntityId();
    public void setEntityId(java.lang.Integer entityId);

    public java.lang.Integer getFactoryId();
    public void setFactoryId(java.lang.Integer factoryId);


    public Map<String, String> toStringMap();

}
