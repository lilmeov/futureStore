CREATE TABLE product_types(
                              id serial NOT NUll,
                              type varchar (100) NOT NULL,
                              PRIMARY KEY (id)
);


CREATE TABLE products(
                         id serial NOT NULL ,
                         name varchar (100) NOT NULL,
                         image varchar (125) NOT NULL,
                         amount int NOT NULL,
                         description varchar (128),
                         price float NOT NULL ,
                         type_id INT NOT NULL ,
                         PRIMARY KEY (id),
                         CONSTRAINT fk_product_type
                             FOREIGN KEY (type_id)
                                 REFERENCES product_types(id)
);

insert into product_types(
    type
) values ('food'),
         ('household'),
         ('sport'),
         ('tech'),
         ('stationery'),
         ('furniture'),
         ('clothes'),
         ('cosmetics'),
         ('plants');

insert into products(
    name, image, amount, description, price, type_id
) values ('sushi', 'sushi.jpg', '21', 'delicious', '200', '1'),
         ('pizza', 'pizza.jpg', '30', 'delicious', '245', '1'),
         ('chicken', 'chicken.jpg', '5', 'delicious', '390', '1'),
         ('pen', 'pen.jpg', '30', 'red', '12', '5'),
         ('pencil', 'pencil.jpg', '65', 'solid', '21', '5'),
         ('ruler', 'ruler.jpg', '13', 'long', '50', '5'),
         ('note', 'note.jpg', '25', 'black', '500', '5'),
         ('gloves', 'gloves.jpg', '12', 'blue', '23', '2'),
         ('broom', 'broom.jpg', '26', 'solid', '21', '2'),
         ('shovel', 'shovel.jpg', '18', 'best quality', '50', '2'),
         ('napkin', 'napkin.jpg', '89', 'yeah', '50', '2');