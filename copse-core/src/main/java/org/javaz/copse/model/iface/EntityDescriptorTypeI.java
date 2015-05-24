package org.javaz.copse.model.iface;

import org.javaz.jdbc.base.*;
import java.util.*;
import java.io.Serializable;


public interface EntityDescriptorTypeI extends MapConvertibleI  {
    public java.lang.Integer getId();
    public void setId(java.lang.Integer id);

    public java.lang.String getDefaultAction();
    public void setDefaultAction(java.lang.String defaultAction);

    public java.lang.Integer getFactoryId();
    public void setFactoryId(java.lang.Integer factoryId);

    public java.lang.String getTitle();
    public void setTitle(java.lang.String title);


    public Map<String, String> toStringMap();

}
