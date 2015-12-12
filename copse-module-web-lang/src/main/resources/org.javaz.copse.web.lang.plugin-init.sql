INSERT INTO copse_generic_factory(
            id, factory_class, name, type)
    VALUES (3000, 'org.javaz.copse.web.lang.LangDescriptorFactory', 'LangDescriptorFactory', 2),
    (3001, 'org.javaz.copse.web.lang.LangHandlerFactory', 'LangHandlerFactory', 3);

INSERT INTO copse_entity_descriptor_type(
            id, default_action, factory_id, title)
    VALUES (3000, 'l', 3000, 'LangDescriptorType');

INSERT INTO copse_entity_descriptor(
            id, title, type_id)
    VALUES (3000, 'LangDescriptor', 3000);

INSERT INTO copse_menu_item(
            id, entity_id, order_value, parent_menu_id, title)
    VALUES (3000, 3000, 0, null, 'Lang');

INSERT INTO copse_action_handler_descriptor(
            id, applicable_action_list, config, entity_descriptor_type_id,
            entity_id, factory_id, order_value)
    VALUES (3000, '.l.', '', 3000,
            null, 3001, 1);
