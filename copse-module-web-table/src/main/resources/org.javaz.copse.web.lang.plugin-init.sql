INSERT INTO copse_generic_factory(
            id, factory_class, name, type)
    VALUES (5000, 'org.javaz.copse.web.table.TableDescriptorFactory', 'TableDescriptorFactory', 2),
    (5001, 'org.javaz.copse.web.table.TableHandlerFactory', 'TableHandlerFactory', 3);

INSERT INTO copse_entity_descriptor_type(
            id, default_action, factory_id, title)
    VALUES (5000, 'l', 5000, 'TableDescriptorType');

-- part below must be reworked to allow editing of meta data itself


INSERT INTO copse_entity_descriptor(
            id, title, type_id)
    VALUES (5000, 'MenuItems', 5000);

INSERT INTO copse_menu_item(
            id, entity_id, order_value, parent_menu_id, title)
    VALUES (1, null, 0, null, 'Administration'),
    (5000, 5000, 0, 1, 'MenuItems');

INSERT INTO copse_action_handler_descriptor(
            id, applicable_action_list, config, entity_descriptor_type_id,
            entity_id, factory_id, order_value)
    VALUES (5000, '.l.', '', 5000,
            null, 5001, 1);

INSERT INTO copse_table_entity_descriptor(
            id, additional_where, db_id, delete_field, descriptor_id, flags,
            join_tables, linked_child_entity_column_id, linked_order_field,
            linked_parent_entity_id, order_value, table_name, title, type_id)
    VALUES (5000, '', 1, null, 5000, '',
            '', null, null,
            null, null, 'copse_menu_item', 'MenuItems', null);

INSERT INTO copse_field(
            id, column_number, default_value, field_name, field_role, field_type_id,
            help, html_overridden_label, html_overridden_name, java_type,
            nullable, "numeric", options, order_value, owner_id, page_id,
            readonly, required, size, sortable, sql_type, type, use_in_sql)
    VALUES (5000, null, null, 'title', 1, 1,
            null, null, null, 'java.lang.String',
            false, false, '', null, 5000, null,
            false, true, 80, true, 'text', 1, true);

