
package org.javaz.copse.logic.impl;

import org.javaz.copse.logic.iface.*;
import org.javaz.copse.model.iface.*;

import java.util.*;

public  class AnswerData implements AnswerDataI {
    private java.util.HashMap data;

    public AnswerData(HashMap data) {
        this.data = data;
    }

    public AnswerData () {
    }

    public AnswerData createNewInstance() {
        return new AnswerData();
    }

    public java.util.HashMap getData() {
        return data;
    }

    public void setData(java.util.HashMap data) {
        this.data = data;
    }

    public Object clone() throws CloneNotSupportedException {
        AnswerData clone = createNewInstance();
        clone.setData(getData());
        return clone;
    }

}
