package org.javaz.copse.logic.iface;

import java.util.List;

/**
 */
public interface QueryActionI {

    public static int CONDITION_TYPE_GTE = 1;
    public static int CONDITION_TYPE_EQ = 2;
    public static int CONDITION_TYPE_LTE = 3;
    public static int CONDITION_TYPE_IN = 4;
    public static int CONDITION_TYPE_NULL = 5;
    public static int CONDITION_TYPE_NOT_NULL = 6;
    public static int CONDITION_TYPE_BITMASK = 7;

    public static int CONDITION_TYPE_MODE_CONTAINS_LC = 8;
    public static int CONDITION_TYPE_MODE_EQUALS_LC = 9;
    public static int CONDITION_TYPE_MODE_STARTS_LC = 10;
    public static int CONDITION_TYPE_MODE_ENDS_LC = 11;
    public static int CONDITION_TYPE_MODE_NOT_CONTAINS_LC = 12;
    public static int CONDITION_TYPE_MODE_CONTAINS = 13;
    public static int CONDITION_TYPE_MODE_EQUALS = 14;
    public static int CONDITION_TYPE_MODE_STARTS = 15;
    public static int CONDITION_TYPE_MODE_ENDS = 16;
    public static int CONDITION_TYPE_MODE_NOT_CONTAINS = 17;

    void setSelection(List<Aliased> columnNames);
    List<Aliased> getSelection();

    class Aliased {

        private String name;
        private String alias;

        public Aliased(String name, String alias) {
            this.name = name;
            this.alias = alias;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAlias() {
            return alias;
        }

        public void setAlias(String alias) {
            this.alias = alias;
        }
    }

    class Condition {
        private Aliased aliased;
        private int conditionType;
        private Object value;

        public Condition(Aliased aliased, int conditionType, Object value) {
            this.aliased = aliased;
            this.conditionType = conditionType;
            this.value = value;
        }

        public Aliased getAliased() {
            return aliased;
        }

        public void setAliased(Aliased aliased) {
            this.aliased = aliased;
        }

        public int getConditionType() {
            return conditionType;
        }

        public void setConditionType(int conditionType) {
            this.conditionType = conditionType;
        }

        public Object getValue() {
            return value;
        }

        public void setValue(Object value) {
            this.value = value;
        }
    }
}
