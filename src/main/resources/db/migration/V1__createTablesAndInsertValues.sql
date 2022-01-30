CREATE TABLE product_types(
                              id serial NOT NUll,
                              type varchar (100) NOT NULL,
                              PRIMARY KEY (id)
);


CREATE TABLE products(
                         id serial NOT NULL ,
                         name varchar (100) NOT NULL,
                         image varchar (200) NOT NULL,
                         amount int NOT NULL,
                         description varchar (250),
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
) values ('sushi', 'https://foodetective-production.s3.amazonaws.com/uploads/picture/photo/b407c617-dbe2-4001-a0bc-ae0a6f8cd6f6/photo.jpeg', '21', 'delicious', '200', '1'),
         ('pizza', 'https://i2-prod.mirror.co.uk/incoming/article23462305.ece/ALTERNATES/s615/0_Dominos_Absolute_Banger.jpg', '30', 'delicious', '245', '1'),
         ('chicken', 'https://www.seriouseats.com/thmb/t82X6N4ZwGkFZmWPuCjwT-osL3g=/1500x844/smart/filters:no_upscale()/20210714-potato-starch-fried-chicken-vicky-wasik-seriouseats-20-17e193a6bf274bba9091810a0b18ef89.jpg', '5', 'delicious', '390', '1'),
         ('pen', 'https://static.coolgift.com/media/cache/sylius_shop_product_large_thumbnail/product/Multi-Tool-Pen-Yellow-2.jpg', '30', 'red', '12', '5'),
         ('pencil', 'https://wtamu.edu/~cbaird/sq/images/img_2217.jpg', '65', 'solid', '21', '5'),
         ('ruler', 'https://thehabitat.mblycdn.com/th/resized/2020/11/768x300/shutterstock_1272729733-1_1536x600_acf_cropped.jpg', '13', 'long', '50', '5'),
         ('note', 'https://i.redd.it/m010290vp7761.jpg', '25', 'black', '500', '5'),
         ('gloves', 'https://www.cladco.co.uk/media/catalog/product/cache/6a932d837235002c953e2dfa33c36ec0/g/l/gloves.jpg', '12', 'blue', '23', '2'),
         ('broom', 'https://cdn11.bigcommerce.com/s-3c8l9ljcjn/images/stencil/1280x1280/products/22444/34835/Detail_34M0801_gardenBroom_square__07745.1616092904.jpg?c=1', '26', 'solid', '21', '2'),
         ('shovel', 'https://i.insider.com/606b5b51856cd700198a336c?width=1000&format=jpeg&auto=webp', '18', 'best quality', '50', '2'),
         ('napkin', 'https://cdnimg.webstaurantstore.com//images/products/large/25059/2110698.jpg', '89', 'yeah', '50', '2'),
         ('skis', 'https://wayempire.com/wp-content/uploads/2018/11/%D0%BB%D1%8B%D0%B6%D0%B8-min.jpg', '20', 'Whatever your style, find a ski to suit your needs and can challenge you to push your limits', '600', '3'),
         ('skates', 'https://i.cbc.ca/1.6219816.1634841618!/fileImage/httpImage/roller-skates.jpg', '9', 'Roller Skating is classed as an effective aerobic exercise that helps to strengthen the heart and improve muscle strength and endurance', '280', '3'),
         ('iPad', 'https://www.ixbt.com/img/r30/00/02/41/40/IMG7141.jpg', '13', 'The iPad is a tablet computer developed by Apple. It is smaller than a typical laptop, but significantly larger than the average smartphone.', '1300', '4'),
         ('Refrigerator', 'https://images.samsung.com/is/image/samsung/assets/ie/p6_grp01/p6_initial_refrigerators/MO_Family_Hub_720x850.jpg?$720_850_JPG$', '13', 'A refrigerator is a machine used for keeping things cold. It is sometimes called a fridge or an icebox. It is normally maintained at 4-5 degree Celsius for household use', '2300', '4'),
         ('Sofa', 'https://sc04.alicdn.com/kf/Hc285dddd8773499993de9d220313c949l.jpg', '3', 'a long upholstered seat usually with arms and a back and often convertible into a bed', '340', '6'),
         ('Table', 'https://www.homestratosphere.com/wp-content/uploads/2014/12/traditionaltable1.jpeg', '2', 'kitchen table - a table in the kitchen. table - a piece of furniture having a smooth flat top that is usually supported by one or more vertical legs', '120', '6'),
         ('Suit', 'https://i.pinimg.com/originals/01/22/bc/0122bcbaf709a71ed7a49e0a569dda70.jpg', '1', 'a set of outer clothes made of the same fabric and designed to be worn together, typically consisting of a jacket and trousers or a jacket and skirt', '2399', '7'),
         ('Dress', 'https://img1.kpopmap.com/2020/03/dress-blackpink-rose-2.jpg', '3', 'A dress (also known as a frock or a gown) is a garment traditionally worn by women or girls consisting of a skirt with an attached bodice', '140', '7'),
         ('Highlighter', 'https://ae01.alicdn.com/kf/H191cb70467d046e19a256154f6d163a74/SACE-LADY-Wholesale-Highlighter-Palette-Makeup-Contour-Powder-Matte-Face-Bronzer-Make-Up-Pallete-Dropshipping-Cosmetics.jpg_Q90.jpg_.webp', '34', 'A highlighter is a type of writing device used to mark attention to sections of text by marking them with a vivid, translucent colour', '14', '8'),
         ('Foundation', 'https://static.thcdn.com/images/large/original//productimg/1600/1600/12645942-1144786208769318.jpg', '2', 'Broadly speaking, a foundation is a nonprofit corporation or a charitable trust that makes grants to organizations, institutions, or individuals for charitable purposes', '25', '8'),
         ('Jasmine', 'https://i.pinimg.com/736x/f2/90/68/f29068fd173fefb0d47c542026e3265a--carolina-jasmine-winter-jasmine.jpg', '24', 'The white, yellow, or rarely pink flowers are tubular with a flaring, lobed, pinwheel-like form; some double-flowered varieties have been developed', '56', '9'),
         ('Rose', 'https://cdn.britannica.com/96/174596-050-449E7354/Double-Delight-tea-rose-flowers-season.jpg', '1', '. A deep red rose can be used to show regret and sorrow.', '14', '9');