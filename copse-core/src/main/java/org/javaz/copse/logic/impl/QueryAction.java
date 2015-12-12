package org.javaz.copse.logic.impl;

import org.javaz.copse.logic.iface.QueryActionI;

import java.util.ArrayList;
import java.util.List;

/**
 */
public class QueryAction implements QueryActionI {


    private List<Aliased> selection;
    private Aliased fromMainTable;
    private String additionalTables;
    private String additionalWhere;
    private ArrayList<Condition> conditions;
    private Integer limit;
    private Integer offset;

    public List<Aliased> getSelection() {
        return selection;
    }

    public void setSelection(List<Aliased> selection) {
        this.selection = selection;
    }

    public void setFromMainTable(Aliased fromMainTable) {
        this.fromMainTable = fromMainTable;
    }

    public Aliased getFromMainTable() {
        return fromMainTable;
    }

    public String getAdditionalTables() {
        return additionalTables;
    }

    public void setAdditionalTables(String additionalTables) {
        this.additionalTables = additionalTables;
    }

    public void setAdditionalWhere(String additionalWhere) {
        this.additionalWhere = additionalWhere;
    }

    public String getAdditionalWhere() {
        return additionalWhere;
    }

    public void setConditions(ArrayList<Condition> conditions) {
        this.conditions = conditions;
    }

    public ArrayList<Condition> getConditions() {
        return conditions;
    }

    public void setLimitOffset(Integer limit, Integer offset) {
        this.limit = limit;
        this.offset = offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }
}
