/*
-- Spring autoconfiguration knows we are using the in memory DB H2 and knows JPA is in the classpath and knows the @Entity is defined.
-- it triggers the schema update(hibernate feature) which automatically creates the schema by the schema update.
create table person
(
    id integer not null,
    name varchar(255) not null,
    location varchar(255),
    birth_date timestamp,
    primary key(id)
);
*/

INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE)
VALUES(10001, 'Ranga', 'Hyderabad',  current_timestamp());
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE)
VALUES(10002, 'James', 'New York',  current_timestamp());
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE)
VALUES(10003, 'Peter', 'Amsterdam',  current_timestamp());
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE)
VALUES(10004, 'Peter', 'Brazil',  current_timestamp());
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE)
VALUES(10005, 'Felipe', 'Brazil',  current_timestamp());
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE)
VALUES(10006, 'Fernanda', 'Brazil',  current_timestamp());
