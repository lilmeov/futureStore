create table users (
    id serial NOT NULL,
    username varchar (50) NOT NULL,
    email varchar (100) NOT NULL,
    password varchar (250) NOT NULL,
    enabled boolean NOT NULL,
    role varchar (20) NOT NULL,
    PRIMARY KEY (id)
);

insert into users(username, email, password, enabled, role) values ('Azamat', 'azamat@gmail.com', '121234', true, 'ADMIN'),
                                                ('Alina', 'alin12@gmail.com', 'qwerty', false, 'USER');