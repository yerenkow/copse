INSERT INTO copse_generic_factory(
            id, factory_class, name, type)
    VALUES (2000, 'org.javaz.copse.web.menu.MenuDescriptorFactory', 'MenuDescriptorFactory', 2),
    (2001, 'org.javaz.copse.web.menu.MenuHandlerFactory', 'MenuHandlerFactory', 3);

INSERT INTO copse_entity_descriptor_type(
            id, default_action, factory_id, title)
    VALUES (2000, 'l', 2000, 'MenuDescriptorType');

INSERT INTO copse_entity_descriptor(
            id, title, type_id)
    VALUES (2000, 'MenuDescriptor', 2000);

INSERT INTO copse_menu_item(
            id, entity_id, order_value, parent_menu_id, title)
    VALUES (2000, 2000, 0, null, 'Menu');

INSERT INTO copse_action_handler_descriptor(
            id, applicable_action_list, config, entity_descriptor_type_id,
            entity_id, factory_id, order_value)
    VALUES (2000, '.l.', '', 2000,
            null, 2001, 1);
