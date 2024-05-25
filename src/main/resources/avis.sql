CREATE DATABASE avis_utilisateur;

CREATE TABLE CLIENT (

    ID INTEGER primary key not null AUTO_INCREMENT,
    EMAIL varchar(50) UNIQUE
);

CREATE TABLE AVIS (
       ID INTEGER primary key not null AUTO_INCREMENT,
       TEXT  varchar(50),
       Type varchar(10) ,
       CLIENT_ID integer,
       CONSTRAINT client_fk FOREIGN key CLIENT_ID REFERENCES CLIENT(ID)


)