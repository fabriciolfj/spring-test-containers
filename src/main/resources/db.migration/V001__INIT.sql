CREATE TABLE city (
    id    bigserial primary key,
    name  varchar(255) not null,
    country varchar(255) not null,
    pop integer not null
);