create table users (
    id serial NOT NULL,
    name varchar (50) NOT NULL,
    email varchar (100) NOT NULL,
    password varchar (50) NOT NULL,
    PRIMARY KEY (id)
);

insert into users(name, email, password) values ('Azamat', 'azamat@gmail.com', '121234'),
                                                ('Alina', 'alin12@gmail.com', 'qwerty');