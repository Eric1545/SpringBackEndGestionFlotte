\c postgres;

drop database gest_flotte_avion;

create database gest_flotte_avion;

\c gest_flotte_avion;


create table users(
                      id serial primary key ,
                      login varchar(25),
                      pwd varchar(255)
);

CREATE TABLE avion(
    id serial primary key ,
    matricule varchar(10),
    image varchar(50)
);

CREATE TABLE kilometrage(
    id SERIAL PRIMARY KEY ,
    idavion INT NOT NULL ,
    date_dep DATE NOT NULL DEFAULT NOW(),
    deb_km FLOAT NOT NULL ,
    fin_km FLOAT NOT NULL ,
    FOREIGN KEY(idavion) REFERENCES avion(id)
);

CREATE TABLE assurance(
    id SERIAL PRIMARY KEY ,
    nom_assurance VARCHAR(20) NOT NULL
);

CREATE TABLE assurance_avion(
    id serial primary key ,
    idassurance INT NOT NULL ,
    idavion INT NOT NULL ,
    date_fin DATE NOT NULL ,
    FOREIGN KEY (idassurance) REFERENCES assurance(id),
    FOREIGN KEY (idavion) REFERENCES avion(id)
);

CREATE TABLE entretien(
    id SERIAL primary key ,
    type_entretien VARCHAR(20)
);

CREATE TABLE entretien_avion(
    id SERIAL NOT NULL ,
    idavion INT NOT NULL ,
    identretien INT NOT NULL ,
    date_entretien DATE NOT NULL DEFAULT NOW(),
    FOREIGN KEY (idavion) REFERENCES avion(id),
    FOREIGN KEY (identretien) REFERENCES entretien(id)
);
