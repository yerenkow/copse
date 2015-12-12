package org.javaz.copse.web.fields.consts;

/**
 */
public enum FieldConsts {
    TYPE_TEXT_FIELD(1),
    TYPE_TEXT_AREA(2),
    TYPE_SELECT_DB(3),
    TYPE_SELECT_LIST(4),
    TYPE_Y_N_SELECT(5),
    TYPE_DATE(6),
    TYPE_DATE_TIME(7),
    TYPE_BIT_MASK(8);

    private int type;

    FieldConsts(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }
}
