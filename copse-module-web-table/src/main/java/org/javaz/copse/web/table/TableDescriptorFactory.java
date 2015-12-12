package org.javaz.copse.web.table;

import org.javaz.copse.logic.iface.DataProviderI;
import org.javaz.copse.logic.iface.GenericFactoryInstanceI;
import org.javaz.copse.model.iface.DataBaseI;
import org.javaz.copse.model.iface.EntityDescriptorI;
import org.javaz.copse.web.fields.iface.FieldI;
import org.javaz.copse.web.table.helper.TableEntityDescriptorHelper;
import org.javaz.copse.web.table.iface.TableEntityDescriptorI;
import org.javaz.copse.web.table.impl.TableEntityDescriptor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 */
public class TableDescriptorFactory implements GenericFactoryInstanceI<TableDescriptor> {

    public TableEntityDescriptorHelper tableEntityDescriptorHelper = new TableEntityDescriptorHelper();

    public TableDescriptor createInstance(Comparable id, DataProviderI data) {

        EntityDescriptorI entityDescriptor = data.getEntityDescriptor(id);

        List<TableEntityDescriptorI> list =
                data.getDao().findByConditions(" where " + TableEntityDescriptor.F_DESCRIPTOR_ID + " = ?",
                Collections.<Integer, Object>singletonMap(1, id), tableEntityDescriptorHelper);

        if (list.isEmpty()) {
            return null;
        }
        TableEntityDescriptorI next = list.iterator().next();

        TableDescriptor descriptor = new TableDescriptor();
        // todo load properly
        descriptor.setId(next.getId());
        descriptor.setListFields(new ArrayList<FieldI>());
        descriptor.setManageFields(new ArrayList<FieldI>());
        descriptor.setDataBase(data.getDataBase(next.getDbId()));

        return descriptor;
    }
}
