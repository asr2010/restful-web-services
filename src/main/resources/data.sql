insert into user_details(id,birth_date,name)
values
(10001, current_date(), 'Arpit'),
(10002, current_date(), 'Shekhar'),
(10003, current_date(), 'Raj');

insert into post(id, description, user_id)
values
(20001, 'Post 1', 10001),
(20002, 'Post 2', 10001),
(20003, 'Post 3', 10002),
(20004, 'Post 4', 10002);
