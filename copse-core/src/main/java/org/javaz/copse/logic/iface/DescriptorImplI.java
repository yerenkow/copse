package org.javaz.copse.logic.iface;

import org.javaz.copse.model.iface.*;

import java.util.*;
import java.io.Serializable;


public interface DescriptorImplI  {
    public java.lang.Integer getId();
    public void setId(java.lang.Integer id);


    public java.lang.String getPermissionFlagFromAction(ParameterProviderI provider);
}
