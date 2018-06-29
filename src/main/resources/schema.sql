drop SEQUENCE if exists id_gen;

create SEQUENCE id_gen
    INCREMENT 1
    MINVALUE 0
    MAXVALUE 999
    START 0
    CACHE 1
    CYCLE;

create table if not exists books (
  id int primary key,
  name varchar(255),
  author varchar(255),
  isbn varchar(255)
);

delete from books;

insert into books
values
    (  1000, 'ジョジョの奇妙な冒険1巻' ,'荒木飛呂彦', '9784344031159'),
    ( 1001 , 'キングダム47巻' ,'原泰久', '9784088907017'),
    ( 1002 , '暗いところで待ち合わせ' ,'乙一', '9784101235059');
