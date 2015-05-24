-- Simple Factories

INSERT INTO copse_generic_factory(
            id, factory_class, name, type)
    VALUES (1, 'org.javaz.copse.logic.factories.DataBaseFactory', 'DataBaseFactory', 1);


-- Copse DB itself, should be synced with web.xml!!!

INSERT INTO copse_data_base(
            id, config, factory_id, login, name, password, url)
    VALUES (1, '', 1, null, null, null, 'java:/CopseDS');




