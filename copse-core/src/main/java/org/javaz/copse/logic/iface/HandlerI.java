package org.javaz.copse.logic.iface;

import org.javaz.copse.model.iface.*;

import java.util.*;
import java.io.Serializable;


public interface HandlerI<T extends DescriptorImplI>  {
    public DataProviderI getData();
    public void setData(DataProviderI data);


    public void init(String config);
    public AnswerDataI handleRequest(String action, MenuItemI menuItem, UserProfileI profile,
                                     T descriptor, ParameterProviderI provider);
}
