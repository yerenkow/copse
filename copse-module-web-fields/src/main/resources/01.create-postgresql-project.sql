begin;
    CREATE SEQUENCE copse_field_id_sequence;
    CREATE TABLE copse_field
    (
        id integer,
        column_number integer,
        default_value character varying(250),
        field_name character varying(250),
        field_role integer,
        field_type_id integer,
        help character varying(250),
        html_overridden_label character varying(250),
        html_overridden_name character varying(250),
        java_type character varying(250),
        nullable boolean,
        numeric boolean,
        options character varying(250),
        order_value integer,
        owner_id integer,
        page_id integer,
        readonly boolean,
        required boolean,
        size character varying(250),
        sortable boolean,
        sql_type character varying(250),
        type integer,
        use_in_sql boolean,

        CONSTRAINT pk_copse_field PRIMARY KEY (id)
    );
    ALTER TABLE copse_field ALTER COLUMN id SET NOT NULL;
    ALTER TABLE copse_field ALTER COLUMN id SET DEFAULT nextval('copse_field_id_sequence'::regclass);

    CREATE SEQUENCE copse_field_type_id_sequence;
    CREATE TABLE copse_field_type
    (
        id integer,
        field_type character varying(250),
        type integer,

        CONSTRAINT pk_copse_field_type PRIMARY KEY (id)
    );
    ALTER TABLE copse_field_type ALTER COLUMN id SET NOT NULL;
    ALTER TABLE copse_field_type ALTER COLUMN id SET DEFAULT nextval('copse_field_type_id_sequence'::regclass);

    CREATE SEQUENCE copse_generic_tag_id_sequence;
    CREATE TABLE copse_generic_tag
    (
        id integer,
        category_id integer,
        title character varying(250),

        CONSTRAINT pk_copse_generic_tag PRIMARY KEY (id)
    );
    ALTER TABLE copse_generic_tag ALTER COLUMN id SET NOT NULL;
    ALTER TABLE copse_generic_tag ALTER COLUMN id SET DEFAULT nextval('copse_generic_tag_id_sequence'::regclass);

    CREATE SEQUENCE copse_tag_link_id_sequence;
    CREATE TABLE copse_tag_link
    (
        id integer,
        category_id integer,
        record_id integer,
        tag_id integer,

        CONSTRAINT pk_copse_tag_link PRIMARY KEY (id)
    );
    ALTER TABLE copse_tag_link ALTER COLUMN id SET NOT NULL;
    ALTER TABLE copse_tag_link ALTER COLUMN id SET DEFAULT nextval('copse_tag_link_id_sequence'::regclass);

rollback;