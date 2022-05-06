CREATE TABLE roles (
id serial PRIMARY KEY,
name VARCHAR (100) NOT NULL
);

CREATE TABLE users (
id serial PRIMARY KEY,
login VARCHAR(100) NOT NULL,
password VARCHAR (100) NOT NULL,
role_id INTEGER REFERENCES roles (id)
);

CREATE UNIQUE INDEX users_login_uindex ON users (login);

INSERT INTO roles (name) VALUES ('ROLE_ADMIN'), ('ROLE_USER');

