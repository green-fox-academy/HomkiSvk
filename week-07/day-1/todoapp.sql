create database if not exists todoapp;

use todoapp;

drop table if exists todos;
drop table if exists users;

create table if not exists users
(
    id         INT auto_increment primary key,
    first_name varchar(30),
    last_name  varchar(30)
);

create table if not exists todos
(
    tId         INT auto_increment primary key,
    name        varchar(20),
    description text,
    dueDate     date,
    done        boolean,
    owner       INT
);

alter table todos
    add foreign key (owner) references users (id);

insert into users(first_name, last_name)
VALUES ('Janko', 'Hrasko'),
       ('Ferko', 'Mrkvicka'),
       ('Alenka', 'Skakava');

insert into todos (name, description, dueDate, done, owner)
VALUES ('Walk the dog', 'go outside with the dog', current_date, false, 1),
       ('Buy milk', 'go to the shop for milk', current_date, false, 1),
       ('Do homework', 'do that math homework', current_date, false, 1),
       ('Walk the dog', 'go outside with the dog', current_date, false, 2),
       ('Do homework', 'do that english one', current_date, false, 2),
       ('Walk the dog', 'go outside with the dog', current_date, false, 3),
       ('Buy a ham and cheese', 'buy that in lidl', current_date, false, 3);