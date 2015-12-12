package org.javaz.copse.web.entities;

import org.javaz.copse.logic.iface.AnswerDataI;
import org.javaz.copse.logic.iface.DescriptorImplI;
import org.javaz.copse.logic.iface.ParameterProviderI;
import org.javaz.copse.logic.iface.UserProfileI;
import org.javaz.copse.logic.impl.AbstractHandler;
import org.javaz.copse.logic.impl.AnswerData;
import org.javaz.copse.model.iface.MenuItemI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This handler provides meta info about known Entities to FE
 */
public class EntitiesHandler extends AbstractHandler<EntitiesDescriptor> {

    @Override
    public AbstractHandler createNewInstance() {
        return new EntitiesHandler();
    }

    @Override
    public void init(String config) {
        // nothing to do here
    }

    @Override
    public AnswerDataI handleRequest(String action, MenuItemI menuItem,
                                     UserProfileI profile,
                                     EntitiesDescriptor descriptor,
                                     ParameterProviderI provider) {
        List<MenuItemI> entitiesItems = getData().getAllMenuItemByPermission(profile, "r");
        AnswerData answerData = new AnswerData();
        HashMap data = new HashMap();
        ArrayList<Map> list = new ArrayList<Map>();
        HashMap map = new HashMap();
        for (MenuItemI item : entitiesItems) {
            // todo
            HashMap entity = new HashMap();
            entity.put("objName", "Table");
            entity.put("fields", new ArrayList());
            entity.put("listFields", new ArrayList());
            entity.put("filterFields", new ArrayList());
            entity.put("linkedTables", new HashMap());
            entity.put("scriptUrl", "scripts/modules/table_entity.js");
            map.put(item.getEntityId(), entity);
        }
        data.put("obj", map);
        data.put("result", 1);
        answerData.setData(data);
        return answerData;

    }
}
