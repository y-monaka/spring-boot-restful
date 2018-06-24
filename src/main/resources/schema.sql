create table if  not exists users (
  id int primary key,
  name varchar(255),
  age int,
  sex int
);

delete from users;
insert into users
VALUES( 1 , '田中' , 26 , 1),
( 2 , '鈴木' , 40 , 1),
( 3 , '佐藤' , 20 , 1),
( 4 , '山口' , 30 , 0);