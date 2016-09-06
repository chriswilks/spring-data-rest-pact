
-- Dave Jones
insert into customers(id, firstname, lastname, email) values (1, 'Dave', 'Jones', 'd.jones@email.com')
insert into orders(id, customer_id, description, total) values (1, 1, 'Toiletries', '5.00')

-- Joe Bloggs
insert into customers(id, firstname, lastname, email) values (2, 'Joe', 'Bloggs', 'j.bloggs@email.com')
insert into orders(id, customer_id, description, total) values (2, 2, 'Groceries', '12.00')

-- Gordon Freeman
insert into customers(id, firstname, lastname, email) values (3, 'Gordon', 'Freeman', 'g.freeman@email.com')
insert into orders(id, customer_id, description, total) values (3, 3, 'Car Parts', '87.00')
