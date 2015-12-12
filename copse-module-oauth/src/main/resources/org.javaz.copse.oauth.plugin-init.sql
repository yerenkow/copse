INSERT INTO copse_generic_factory(
            id, factory_class, name, type)
    VALUES (1000, 'org.javaz.copse.oauth.OauthDescriptorFactory', 'OauthDescriptorFactory', 2),
    (1001, 'org.javaz.copse.oauth.OauthHandlerFactory', 'OauthHandlerFactory', 3);

INSERT INTO copse_entity_descriptor_type(
            id, default_action, factory_id, title)
    VALUES (1000, 'os', 1000, 'OauthDescriptorType');

INSERT INTO copse_entity_descriptor(
            id, title, type_id)
    VALUES (1000, 'OauthDescriptor', 1000);

INSERT INTO copse_menu_item(
            id, entity_id, order_value, parent_menu_id, title)
    VALUES (1000, 1000, 0, null, 'Oauth Auth');

INSERT INTO copse_action_handler_descriptor(
            id, applicable_action_list, config, entity_descriptor_type_id,
            entity_id, factory_id, order_value)
    VALUES (1000, '.os.oc.', '{"OAUTH_CLIENT_ID":"", "OAUTH_SECRET":""}', 1000,
            null, 1001, 1);
