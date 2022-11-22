CREATE TABLE address (
    id bigserial NOT NULL PRIMARY KEY,
    street text NOT NULL,
    cp_ce text,
    co text,
    city_part text,
    city text NOT NULL,
    zip_code decimal NOT NULL
);

CREATE TABLE client (
     id bigserial NOT NULL PRIMARY KEY,
     client_id text NOT NULL,
     first_name text NOT NULL,
     last_name text NOT NULL,
     date_of_birth date NOT NULL,
     phone text,
     email text,
     address_id bigint NOT NULL,

     CONSTRAINT address_fk_in_client
     FOREIGN KEY (address_id) REFERENCES address (id)
);

CREATE TABLE energy_data (
     id bigserial NOT NULL PRIMARY KEY,
     date date NOT NULL,
     supplier_id text NOT NULL,
     gdpr_agreement_provided date NOT NULL,
     client_id bigint NOT NULL,

     CONSTRAINT client_fk_in_energy_data
     FOREIGN KEY (client_id) REFERENCES client (id)
);

CREATE TABLE point_of_delivery (
    id bigserial NOT NULL PRIMARY KEY,
    ean_or_eic decimal NOT NULL,
    flat_number text,
    is_main boolean NOT NULL,
    tariff text,
    heating text,
    address_id bigint NOT NULL,
    commodity text NOT NULL,

    CONSTRAINT address_fk_in_point_of_delivery
    FOREIGN KEY (address_id) REFERENCES address (id)
);

CREATE TABLE statement (
    id bigserial NOT NULL PRIMARY KEY,
    date date NOT NULL,
    consumption_amount decimal NOT NULL,
    advances decimal NOT NULL,
    total decimal NOT NULL,
    balance decimal NOT NULL
);

CREATE TABLE simulation (
    id bigserial NOT NULL PRIMARY KEY,
    date date,
    consumption decimal,
    total decimal,
    balance decimal
);

CREATE TABLE commodity_data (
     id bigserial NOT NULL PRIMARY KEY,
     effective_date date NOT NULL,
     fixation_from date,
     fixation_to date,
     debt decimal,
     advances_for_6_months decimal,
     point_of_delivery_id bigint NOT NULL,
     statement_id bigint NOT NULL,
     simulation_id bigint,
     energy_data_id bigint,

     CONSTRAINT point_of_delivery_fk_in_commodity_data
     FOREIGN KEY (point_of_delivery_id) REFERENCES point_of_delivery (id),
     CONSTRAINT statement_fk_in_commodity_data
     FOREIGN KEY (statement_id) REFERENCES statement (id),
     CONSTRAINT simulation_fk_in_commodity_data
     FOREIGN KEY (simulation_id) REFERENCES simulation (id),
     CONSTRAINT energy_data_fk_in_commodity_data
     FOREIGN KEY (energy_data_id) REFERENCES energy_data (id)
);

CREATE TABLE payment (
     id bigserial NOT NULL PRIMARY KEY,
     month decimal NOT NULL,
     year decimal NOT NULL,
     amount decimal NOT NULL,
     commodity_data_id bigint,

     CONSTRAINT commodity_data_id_fk_in_payment
     FOREIGN KEY (commodity_data_id) REFERENCES commodity_data (id)
);