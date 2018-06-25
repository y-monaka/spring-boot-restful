
create table if not exists books (
  id int primary key,
  name varchar(255),
  author varchar(255),
  isbn varchar(255),
  category_id int,
  created_at date,
  updated_at date
);

delete from books;
insert into books
VALUES( 1 , 'ジョジョの奇妙な冒険1巻' ,'荒木飛呂彦', '9784344031159', 1 , NOW() , NOW()),
( 2 , 'キングダム47巻' ,'原泰久', '9784088907017', 2 , NOW() , NOW()),
( 3 , '暗いところで待ち合わせ' ,'乙一', '9784101235059', 3 , NOW() , NOW());
