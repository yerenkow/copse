package org.javaz.copse.web.table.iface;

import org.javaz.jdbc.base.*;
import java.util.*;
import java.io.Serializable;
import org.javaz.copse.logic.iface.DescriptorImplI;



public interface TableEntityDescriptorI extends MapConvertibleI , DescriptorImplI {
    public java.lang.Integer getId();
    public void setId(java.lang.Integer id);

    public java.lang.String getAdditionalWhere();
    public void setAdditionalWhere(java.lang.String additionalWhere);

    public java.lang.Integer getDbId();
    public void setDbId(java.lang.Integer dbId);

    public java.lang.String getDeleteField();
    public void setDeleteField(java.lang.String deleteField);

    public java.lang.Integer getDescriptorId();
    public void setDescriptorId(java.lang.Integer descriptorId);

    public java.lang.String getFlags();
    public void setFlags(java.lang.String flags);

    public java.lang.String getJoinTables();
    public void setJoinTables(java.lang.String joinTables);

    public java.lang.String getLinkedChildEntityColumnId();
    public void setLinkedChildEntityColumnId(java.lang.String linkedChildEntityColumnId);

    public java.lang.String getLinkedOrderField();
    public void setLinkedOrderField(java.lang.String linkedOrderField);

    public java.lang.Integer getLinkedParentEntityId();
    public void setLinkedParentEntityId(java.lang.Integer linkedParentEntityId);

    public java.lang.Integer getOrderValue();
    public void setOrderValue(java.lang.Integer orderValue);

    public java.lang.String getTableName();
    public void setTableName(java.lang.String tableName);

    public java.lang.String getTitle();
    public void setTitle(java.lang.String title);

    public java.lang.Integer getTypeId();
    public void setTypeId(java.lang.Integer typeId);


    public Map<String, String> toStringMap();

}
