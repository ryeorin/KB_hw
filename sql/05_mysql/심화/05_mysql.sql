USE sqldb;

create table usertbl
(userID char(8) not null primary key,
name varchar(10) not null,
birthyear int not null
);

create table buytbl
(
num int auto_increment not null primary key,
userID char(8) not null,
prodName char(6) not null
);

alter table buytbl 
add constraint FK_usertbl_buytbl
foreign key(userID)
references usertbl(userID);

SET SQL_SAFE_UPDATES = 0;

-- 기존 buytbl, usertbl을 삭제하세요.
use tabledb;
drop table if exists buytbl,usertbl;

create table usertbl
(userID char(8) not null primary key,
name varchar(10) not null,
birthyear int not null,
email char(30) null unique
);

drop table if exists usertbl;
create table usertbl
(userID char(8) not null primary key,
name varchar(10),
birthyear int check (birthyear>=1900 and birthyear <=2023),
mobile char(3) not null,
constraint ck_name check (name is not null)
);

drop table if exists usertbl;
create table usertbl
(userID char(8) not null primary key,
name varchar(10) not null,
birthyear int not null default-1,
addr char(2) not null default '서울',
mobile1 char(3) null,
mobile2 char(8) null,
height smallint null default 170,
mDate date null
);

select * from usertbl;

-- usertbl에 대해서 다음 조건을 처리하도록 수정하세요.
-- mobile1 컬럼을 삭제함
alter table usertbl
drop column mobile1;

-- name 컬럼명을 uName으로 변경함
alter table usertbl
change column name uName varchar(20) null;

-- 기본키를 제거함
alter table usertbl
drop primary key;

use employees;

-- 직원 정보를 출력하는 Employees_info view를 작성하세요.
create or replace view employees_info
as
select e.*,
t.title,t.from_date t_from, t.to_date t_to,
s.salary, s.from_date s_from, s.to_date s_to
from employees e
inner join titles t
on e.emp_no=t.emp_no
inner join salaries s
on e.emp_no=s.emp_no;


-- 뷰에서 재직자의 현재 정보만 출력하세요.
select *
from employees_info
where s_to='9999-01-01';

-- 부서 정보를 출력하는 emp_dept_info view를 작성하세요.
create or replace view emp_dept_info
as
select e.emp_no,d.dept_no,d.dept_name,de.from_date,de.to_date
from departments d
inner join dept_emp de
on d.dept_no=de.dept_no
inner join employees e
on de.emp_no=e.emp_no;

-- emp_dept_info 현재 재직자의 부서 정보 출력
select * from emp_dept_info
where to_date='9999-01-01';




