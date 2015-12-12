package org.javaz.copse.web.menu;

import org.javaz.copse.logic.iface.AnswerDataI;
import org.javaz.copse.logic.iface.DescriptorImplI;
import org.javaz.copse.logic.iface.ParameterProviderI;
import org.javaz.copse.logic.iface.UserProfileI;
import org.javaz.copse.logic.impl.AbstractHandler;
import org.javaz.copse.logic.impl.AnswerData;
import org.javaz.copse.model.beans.MenuItem;
import org.javaz.copse.model.iface.MenuItemI;

import java.util.*;

/**
 * This handler provides meta info about known Menu Items to FE
 */
public class MenuHandler extends AbstractHandler<MenuDescriptor> {

    @Override
    public AbstractHandler createNewInstance() {
        return new MenuHandler();
    }

    @Override
    public void init(String config) {
        // nothing to do here
    }

    @Override
    public AnswerDataI handleRequest(String action, MenuItemI menuItem,
                                     UserProfileI profile,
                                     MenuDescriptor descriptor,
                                     ParameterProviderI provider) {
        List<MenuItemI> menuItems = getData().getAllMenuItemByPermission(profile, "r");
        AnswerData answerData = new AnswerData();
        HashMap data = new HashMap();
        Map<String, List<Map>> byParent = new HashMap<String, List<Map>>();
        ArrayList<Map> list = new ArrayList<Map>();
        for (MenuItemI item : menuItems) {
            String parentMenuId = "" + item.getParentMenuId();
            if (byParent.get(parentMenuId) == null) {
                byParent.put(parentMenuId, new ArrayList<Map>());
            }
            Map<String, Object> e = (Map) item.toStringMap();
            e.put("q", e.get("id"));
            e.put("name", e.get("title"));
            e.put("action", "l");
            e.put("sub_menu_list", new ArrayList());
            e.put("entity_id", "" + e.get("id"));
            byParent.get(parentMenuId).add(e);
        }
        List<Map> maps = byParent.get("null");
        for (Iterator<Map> iterator = maps.iterator(); iterator.hasNext(); ) {
            Map item = iterator.next();
            if (byParent.containsKey(item.get("id"))) {
                item.put("sub_menu_list", byParent.get(item.get("id")));
                list.add(item);
            }
        }

        data.put("obj", list);
        data.put("result", 1);
        answerData.setData(data);
        return answerData;

    }
}
