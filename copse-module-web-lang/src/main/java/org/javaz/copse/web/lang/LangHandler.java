package org.javaz.copse.web.lang;

import org.javaz.copse.logic.iface.AnswerDataI;
import org.javaz.copse.logic.iface.DescriptorImplI;
import org.javaz.copse.logic.iface.ParameterProviderI;
import org.javaz.copse.logic.iface.UserProfileI;
import org.javaz.copse.logic.impl.AbstractHandler;
import org.javaz.copse.logic.impl.AnswerData;
import org.javaz.copse.model.iface.MenuItemI;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * This handler provides language keys to FE, could be deprecated and removed in near future
 */
public class LangHandler extends AbstractHandler<LangDescriptor> {

    @Override
    public AbstractHandler createNewInstance() {
        return new LangHandler();
    }

    @Override
    public void init(String config) {
        // nothing to do here
    }

    @Override
    public AnswerDataI handleRequest(String action, MenuItemI langItem,
                                     UserProfileI profile,
                                     LangDescriptor descriptor,
                                     ParameterProviderI provider) {
        AnswerData answerData = new AnswerData();
        HashMap data = new HashMap();
        data.put("result", "1");
        data.put("obj", new ArrayList());
        answerData.setData(data);
        return answerData;

    }
}
