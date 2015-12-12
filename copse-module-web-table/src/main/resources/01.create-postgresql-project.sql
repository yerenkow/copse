begin;
    CREATE SEQUENCE copse_saved_filter_id_sequence;
    CREATE TABLE copse_saved_filter
    (
        id integer,
        created_when timestamp without time zone,
        entity_id integer,
        group_id integer,
        is_default boolean,
        order_value integer,
        title character varying(250),
        user_id integer,
        value character varying(250),

        CONSTRAINT pk_copse_saved_filter PRIMARY KEY (id)
    );
    ALTER TABLE copse_saved_filter ALTER COLUMN id SET NOT NULL;
    ALTER TABLE copse_saved_filter ALTER COLUMN id SET DEFAULT nextval('copse_saved_filter_id_sequence'::regclass);

    CREATE SEQUENCE copse_sql_condition_id_sequence;
    CREATE TABLE copse_sql_condition
    (
        id integer,
        entity_id integer,
        java_type character varying(250),
        key character varying(250),
        order_value integer,
        type integer,
        value character varying(250),

        CONSTRAINT pk_copse_sql_condition PRIMARY KEY (id)
    );
    ALTER TABLE copse_sql_condition ALTER COLUMN id SET NOT NULL;
    ALTER TABLE copse_sql_condition ALTER COLUMN id SET DEFAULT nextval('copse_sql_condition_id_sequence'::regclass);

    CREATE SEQUENCE copse_table_entity_descriptor_id_sequence;
    CREATE TABLE copse_table_entity_descriptor
    (
        id integer,
        additional_where character varying(250),
        db_id integer,
        delete_field character varying(250),
        descriptor_id integer,
        flags character varying(250),
        join_tables character varying(250),
        linked_child_entity_column_id character varying(250),
        linked_order_field character varying(250),
        linked_parent_entity_id integer,
        order_value integer,
        table_name character varying(250),
        title character varying(250),
        type_id integer,

        CONSTRAINT pk_copse_table_entity_descriptor PRIMARY KEY (id)
    );
    ALTER TABLE copse_table_entity_descriptor ALTER COLUMN id SET NOT NULL;
    ALTER TABLE copse_table_entity_descriptor ALTER COLUMN id SET DEFAULT nextval('copse_table_entity_descriptor_id_sequence'::regclass);

rollback;