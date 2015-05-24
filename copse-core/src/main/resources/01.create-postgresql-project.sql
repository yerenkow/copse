begin;
    CREATE SEQUENCE copse_action_button_id_sequence;
    CREATE TABLE copse_action_button
    (
        id integer,
        action character varying(250),
        applicable_action_list character varying(250),
        entity_descriptor_type_id integer,
        entity_id integer,
        js_code character varying(250),
        order_value integer,
        render_action_list character varying(250),
        required_permissions character varying(250),
        selection_type integer,
        title character varying(250),

            CONSTRAINT pk_copse_action_button PRIMARY KEY (id)
    );
            ALTER TABLE copse_action_button ALTER COLUMN id SET NOT NULL;
            ALTER TABLE copse_action_button ALTER COLUMN id SET DEFAULT nextval('copse_action_button_id_sequence'::regclass);

    CREATE SEQUENCE copse_action_handler_descriptor_id_sequence;
    CREATE TABLE copse_action_handler_descriptor
    (
        id integer,
        applicable_action_list character varying(250),
        config character varying(250),
        entity_descriptor_type_id integer,
        entity_id integer,
        factory_id integer,
        order_value integer,

            CONSTRAINT pk_copse_action_handler_descriptor PRIMARY KEY (id)
    );
            ALTER TABLE copse_action_handler_descriptor ALTER COLUMN id SET NOT NULL;
            ALTER TABLE copse_action_handler_descriptor ALTER COLUMN id SET DEFAULT nextval('copse_action_handler_descriptor_id_sequence'::regclass);

    CREATE SEQUENCE copse_data_base_id_sequence;
    CREATE TABLE copse_data_base
    (
        id integer,
        config character varying(250),
        factory_id integer,
        login character varying(250),
        name character varying(250),
        password character varying(250),
        url character varying(250),

            CONSTRAINT pk_copse_data_base PRIMARY KEY (id)
    );
            ALTER TABLE copse_data_base ALTER COLUMN id SET NOT NULL;
            ALTER TABLE copse_data_base ALTER COLUMN id SET DEFAULT nextval('copse_data_base_id_sequence'::regclass);

    CREATE SEQUENCE copse_entity_descriptor_id_sequence;
    CREATE TABLE copse_entity_descriptor
    (
        id integer,
        title character varying(250),
        type_id integer,

            CONSTRAINT pk_copse_entity_descriptor PRIMARY KEY (id)
    );
            ALTER TABLE copse_entity_descriptor ALTER COLUMN id SET NOT NULL;
            ALTER TABLE copse_entity_descriptor ALTER COLUMN id SET DEFAULT nextval('copse_entity_descriptor_id_sequence'::regclass);

    CREATE SEQUENCE copse_entity_descriptor_type_id_sequence;
    CREATE TABLE copse_entity_descriptor_type
    (
        id integer,
        default_action character varying(250),
        factory_id integer,
        title character varying(250),

            CONSTRAINT pk_copse_entity_descriptor_type PRIMARY KEY (id)
    );
            ALTER TABLE copse_entity_descriptor_type ALTER COLUMN id SET NOT NULL;
            ALTER TABLE copse_entity_descriptor_type ALTER COLUMN id SET DEFAULT nextval('copse_entity_descriptor_type_id_sequence'::regclass);

    CREATE SEQUENCE copse_generic_factory_id_sequence;
    CREATE TABLE copse_generic_factory
    (
        id integer,
        factory_class character varying(250),
        name character varying(250),
        type integer,

            CONSTRAINT pk_copse_generic_factory PRIMARY KEY (id)
    );
            ALTER TABLE copse_generic_factory ALTER COLUMN id SET NOT NULL;
            ALTER TABLE copse_generic_factory ALTER COLUMN id SET DEFAULT nextval('copse_generic_factory_id_sequence'::regclass);

    CREATE SEQUENCE copse_group_id_sequence;
    CREATE TABLE copse_group
    (
        id integer,
        code character varying(250),
        comments character varying(250),
        enabled boolean,
        parent_group_id integer,
        title character varying(250),

            CONSTRAINT pk_copse_group PRIMARY KEY (id)
    );
            ALTER TABLE copse_group ALTER COLUMN id SET NOT NULL;
            ALTER TABLE copse_group ALTER COLUMN id SET DEFAULT nextval('copse_group_id_sequence'::regclass);

    CREATE SEQUENCE copse_language_id_sequence;
    CREATE TABLE copse_language
    (
        id integer,
        title character varying(250),

            CONSTRAINT pk_copse_language PRIMARY KEY (id)
    );
            ALTER TABLE copse_language ALTER COLUMN id SET NOT NULL;
            ALTER TABLE copse_language ALTER COLUMN id SET DEFAULT nextval('copse_language_id_sequence'::regclass);

    CREATE SEQUENCE copse_menu_item_id_sequence;
    CREATE TABLE copse_menu_item
    (
        id integer,
        entity_id integer,
        order_value integer,
        parent_menu_id integer,
        title character varying(250),

            CONSTRAINT pk_copse_menu_item PRIMARY KEY (id)
    );
            ALTER TABLE copse_menu_item ALTER COLUMN id SET NOT NULL;
            ALTER TABLE copse_menu_item ALTER COLUMN id SET DEFAULT nextval('copse_menu_item_id_sequence'::regclass);

    CREATE SEQUENCE copse_permission_id_sequence;
    CREATE TABLE copse_permission
    (
        id integer,
        deny boolean,
        entity_id integer,
        group_id integer,
        permission_flags character varying(250),
        user_id integer,

            CONSTRAINT pk_copse_permission PRIMARY KEY (id)
    );
            ALTER TABLE copse_permission ALTER COLUMN id SET NOT NULL;
            ALTER TABLE copse_permission ALTER COLUMN id SET DEFAULT nextval('copse_permission_id_sequence'::regclass);

    CREATE SEQUENCE copse_permission_checker_id_sequence;
    CREATE TABLE copse_permission_checker
    (
        id integer,
        entity_descriptor_type_id integer,
        entity_id integer,
        factory_id integer,

            CONSTRAINT pk_copse_permission_checker PRIMARY KEY (id)
    );
            ALTER TABLE copse_permission_checker ALTER COLUMN id SET NOT NULL;
            ALTER TABLE copse_permission_checker ALTER COLUMN id SET DEFAULT nextval('copse_permission_checker_id_sequence'::regclass);

    CREATE SEQUENCE copse_plugin_id_sequence;
    CREATE TABLE copse_plugin
    (
        id integer,
        class_name character varying(250),
        config character varying(250),
        entity_id integer,
        order_value integer,

            CONSTRAINT pk_copse_plugin PRIMARY KEY (id)
    );
            ALTER TABLE copse_plugin ALTER COLUMN id SET NOT NULL;
            ALTER TABLE copse_plugin ALTER COLUMN id SET DEFAULT nextval('copse_plugin_id_sequence'::regclass);

    CREATE SEQUENCE copse_simple_record_id_sequence;
    CREATE TABLE copse_simple_record
    (
        id integer,
        order_value integer,
        string_key character varying(250),
        string_value character varying(250),
        string_value2 character varying(250),
        type integer,

            CONSTRAINT pk_copse_simple_record PRIMARY KEY (id)
    );
            ALTER TABLE copse_simple_record ALTER COLUMN id SET NOT NULL;
            ALTER TABLE copse_simple_record ALTER COLUMN id SET DEFAULT nextval('copse_simple_record_id_sequence'::regclass);

    CREATE SEQUENCE copse_time_binding_id_sequence;
    CREATE TABLE copse_time_binding
    (
        id integer,
        enabled boolean,
        from_time timestamp without time zone,
        record_id integer,
        till_time timestamp without time zone,
        type integer,

            CONSTRAINT pk_copse_time_binding PRIMARY KEY (id)
    );
            ALTER TABLE copse_time_binding ALTER COLUMN id SET NOT NULL;
            ALTER TABLE copse_time_binding ALTER COLUMN id SET DEFAULT nextval('copse_time_binding_id_sequence'::regclass);

    CREATE SEQUENCE copse_user_id_sequence;
    CREATE TABLE copse_user
    (
        id integer,
        comments character varying(250),
        enabled boolean,
        name character varying(250),
        oauth_id character varying(250),
        parent_id integer,

            CONSTRAINT pk_copse_user PRIMARY KEY (id)
    );
            ALTER TABLE copse_user ALTER COLUMN id SET NOT NULL;
            ALTER TABLE copse_user ALTER COLUMN id SET DEFAULT nextval('copse_user_id_sequence'::regclass);

    CREATE SEQUENCE copse_user_to_group_id_sequence;
    CREATE TABLE copse_user_to_group
    (
        id integer,
        group_id integer,
        user_id integer,

            CONSTRAINT pk_copse_user_to_group PRIMARY KEY (id)
    );
            ALTER TABLE copse_user_to_group ALTER COLUMN id SET NOT NULL;
            ALTER TABLE copse_user_to_group ALTER COLUMN id SET DEFAULT nextval('copse_user_to_group_id_sequence'::regclass);

    CREATE SEQUENCE copse_user_to_user_grant_id_sequence;
    CREATE TABLE copse_user_to_user_grant
    (
        id integer,
        child_user_id integer,
        comments character varying(250),
        created_when timestamp without time zone,
        enabled boolean,
        parent_user_id integer,

            CONSTRAINT pk_copse_user_to_user_grant PRIMARY KEY (id)
    );
            ALTER TABLE copse_user_to_user_grant ALTER COLUMN id SET NOT NULL;
            ALTER TABLE copse_user_to_user_grant ALTER COLUMN id SET DEFAULT nextval('copse_user_to_user_grant_id_sequence'::regclass);

rollback;