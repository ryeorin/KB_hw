create schema shopdb;

show DATABASES;

use shopdb;

use sakila;

select * from actor;

use world;
select * from city;

use employees;
select * from departments;

--
create table membertbl(
memberID int,
memberName char(20),
memberAddress char(10)
);

alter table membertbl modify column memberID char(8);

show tables;

select * from membertbl;
select * from productTBL;

SET SQL_SAFE_UPDATES = 0;


insert into membertbl values ('apple','박길동','1223'); 
insert into membertbl values ('summer','박길동','송파구');
insert into membertbl values('Dang','당탕이','경기 부천시 중동');
insert into membertbl values('Jee','지운이','서울 은평구 증산동');
insert into membertbl values('Han','한주연','인천 남구 주안동');
insert into membertbl values('Sang','상길이','경기 성남시분당구');
insert into membertbl values('amy','에이미','서울 송파구');
delete from membertbl where memberName='에이미';


select * from productTBL;
insert into productTBL values('컴퓨터',10,'2021-01-01','삼성',17);
insert into productTBL values('세탁기',20,'2022-09-01','LG',3);
insert into productTBL values('냉장고',5,'2023-02-01','대우',22);

select memberName,memberAddress from membertbl; 

select * from membertbl where memberName="지운이";


select * from tbl_board;

insert into tbl_board values(1,'가','안녕','김','2025-05-13','2025-05-13');
INSERT INTO tbl_board VALUES (2, '나', '반가워', '이', '2025-05-12', '2025-05-13');
INSERT INTO tbl_board VALUES (3, '다', '좋은 아침', '박', '2025-05-11', '2025-05-13');
INSERT INTO tbl_board VALUES (4, '라', '점심 먹었니?', '최', '2025-05-10', '2025-05-13');
INSERT INTO tbl_board VALUES (5, '마', '잘 지내?', '정', '2025-05-08', '2025-05-13');
INSERT INTO tbl_board VALUES (6, '바', '저녁 먹자', '오', '2025-05-01', '2025-05-13');
INSERT INTO tbl_board VALUES (7, '사', '졸려', '강', '2025-05-02', '2025-05-13');
INSERT INTO tbl_board VALUES (8, '아', '운동하자', '윤', '2025-05-03', '2025-05-13');
INSERT INTO tbl_board VALUES (9, '자', '공부해', '장', '2025-05-04', '2025-05-13');
INSERT INTO tbl_board VALUES (10, '차', '잘자', '한', '2025-05-06', '2025-05-13');


select no,title,writer from tbl_board;

select * from tbl_board where writer="김";

