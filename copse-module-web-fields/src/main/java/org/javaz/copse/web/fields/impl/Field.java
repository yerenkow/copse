package org.javaz.copse.web.fields.impl;

import java.util.HashMap;

/**
 */
public class Field extends AbstractField {
    @Override
    public AbstractField createNewInstance() {
        return new Field();
    }

    @Override
    public void initExtendedOptions() {

    }

    @Override
    public String getExtendedOption(String key) {
        return null;
    }

    @Override
    public HashMap toHashMapSpecial(String view) {
        return null;
    }
}
