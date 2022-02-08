create table product_user (
    id serial primary key ,
    product_id int references products (id) ON UPDATE CASCADE ON DELETE CASCADE,
    user_id int references users (id) ON UPDATE CASCADE
)