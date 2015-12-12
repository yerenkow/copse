INSERT INTO copse_generic_factory(
            id, factory_class, name, type)
    VALUES (4000, 'org.javaz.copse.web.entities.EntitiesDescriptorFactory', 'EntitiesDescriptorFactory', 2),
    (4001, 'org.javaz.copse.web.entities.EntitiesHandlerFactory', 'EntitiesHandlerFactory', 3);

INSERT INTO copse_entity_descriptor_type(
            id, default_action, factory_id, title)
    VALUES (4000, 'l', 4000, 'EntitiesDescriptorType');

INSERT INTO copse_entity_descriptor(
            id, title, type_id)
    VALUES (4000, 'EntitiesDescriptor', 4000);

INSERT INTO copse_menu_item(
            id, entity_id, order_value, parent_menu_id, title)
    VALUES (4000, 4000, 0, null, 'Entities');

INSERT INTO copse_action_handler_descriptor(
            id, applicable_action_list, config, entity_descriptor_type_id,
            entity_id, factory_id, order_value)
    VALUES (4000, '.l.', '', 4000,
            null, 4001, 1);
