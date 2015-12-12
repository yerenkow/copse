package org.javaz.copse.web.table;

import org.javaz.copse.logic.iface.ParameterProviderI;
import org.javaz.copse.logic.impl.AbstractDescriptorImpl;
import org.javaz.copse.model.iface.DataBaseI;
import org.javaz.copse.model.iface.EntityDescriptorI;
import org.javaz.copse.web.fields.iface.FieldI;

import javax.activation.MimeTypeParameterList;
import java.util.ArrayList;

/**
 */
public class TableDescriptor extends AbstractDescriptorImpl {

    private ArrayList<FieldI> listFields = new ArrayList<FieldI>();
    private ArrayList<FieldI> manageFields = new ArrayList<FieldI>();
    private ArrayList<FieldI> filterFields = new ArrayList<FieldI>();
    private String tableName;
    private String joinTables;
    private ArrayList listConditions;
    private String additionalWhere;
    private String deleteField;
    private ArrayList allLinkedTables;
    private Comparable entityId;
    private String linkedChildEntityColumnId;
    private DataBaseI dataBase;

    public TableDescriptor() {
    }

    @Override
    public AbstractDescriptorImpl createNewInstance() {
        return new TableDescriptor();
    }

    public TableDescriptor(EntityDescriptorI other) {
        setId(other.getId());
    }

    @Override
    public String getPermissionFlagFromAction(ParameterProviderI provider) {
        return "r";
    }

    public ArrayList<FieldI> getListFields() {
        return listFields;
    }

    public void setListFields(ArrayList<FieldI> listFields) {
        this.listFields = listFields;
    }

    public ArrayList<FieldI> getManageFields() {
        return manageFields;
    }

    public void setManageFields(ArrayList<FieldI> manageFields) {
        this.manageFields = manageFields;
    }

    public ArrayList<FieldI> getFilterFields() {
        return filterFields;
    }

    public void setFilterFields(ArrayList<FieldI> filterFields) {
        this.filterFields = filterFields;
    }

    public boolean isSortableColumn(int i) {
        return true;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getJoinTables() {
        return joinTables;
    }

    public void setJoinTables(String joinTables) {
        this.joinTables = joinTables;
    }

    public ArrayList getListConditions() {
        return listConditions;
    }

    public void setListConditions(ArrayList listConditions) {
        this.listConditions = listConditions;
    }

    public String getAdditionalWhere() {
        return additionalWhere;
    }

    public void setAdditionalWhere(String additionalWhere) {
        this.additionalWhere = additionalWhere;
    }

    public String getDeleteField() {
        return deleteField;
    }

    public void setDeleteField(String deleteField) {
        this.deleteField = deleteField;
    }

    public ArrayList getAllLinkedTables() {
        return allLinkedTables;
    }

    public void setAllLinkedTables(ArrayList allLinkedTables) {
        this.allLinkedTables = allLinkedTables;
    }

    public Comparable getEntityId() {
        return entityId;
    }

    public void setEntityId(Comparable entityId) {
        this.entityId = entityId;
    }

    public String getLinkedChildEntityColumnId() {
        return linkedChildEntityColumnId;
    }

    public void setLinkedChildEntityColumnId(String linkedChildEntityColumnId) {
        this.linkedChildEntityColumnId = linkedChildEntityColumnId;
    }

    public void setDataBase(DataBaseI dataBase) {
        this.dataBase = dataBase;
    }

    public DataBaseI getDataBase() {
        return dataBase;
    }
}
