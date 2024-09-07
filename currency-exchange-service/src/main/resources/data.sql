CREATE TABLE IF NOT EXISTS currency_exchange (
   id BIGINT PRIMARY KEY,
   currency_from VARCHAR(3),
   currency_to VARCHAR(3),
   conversion_multiple DECIMAL(19, 4),
   environment VARCHAR(255)
);

insert into currency_exchange
(id,currency_from,currency_to,conversion_multiple,environment)
values(10001,'USD','INR',65,'');
insert into currency_exchange
(id,currency_from,currency_to,conversion_multiple,environment)
values(10002,'EUR','INR',75,'');
insert into currency_exchange
(id,currency_from,currency_to,conversion_multiple,environment)
values(10003,'AUD','INR',25,'');