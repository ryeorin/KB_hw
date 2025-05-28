use sqldb;

CREATE TABLE stdtbl ( 
stdName    VARCHAR(10) NOT NULL PRIMARY KEY, 
addr CHAR(4) NOT NULL
);

create table clubtbl(
clubName varchar(10) not null primary key,
roomNo char(4) not null
);

create table stdclubtbl(
num int AUTO_INCREMENT NOT NULL PRIMARY KEY,
stdName varchar(10) NOT NULL,
clubName VARCHAR(10) NOT NULL,
FOREIGN KEY(stdName) REFERENCES stdtbl(stdName),
FOREIGN KEY(clubName) REFERENCES clubtbl(clubName)
);

insert into stdtbl values('김범수','경남'),('성시경','서울'),('조용필','경기'),('은지원','경북'),('바비킴','서울');
insert into clubtbl values('수영','101호'),('바둑','102호'),('축구','103호'),('봉사','104호');
insert into stdclubtbl 
values(null,'김범수','바둑'),(null,'김범수','축구'),(null,'조용필','축구'),(null,'은지원','축구'),(null,'은지원','봉사'),(null,'바비킴','봉사');

select *
from stdclubtbl;

select *
from stdtbl;

select *
from clubtbl;


-- 학생 테이블, 동아리 테이블, 학생 동아리 테이블을 이용해서 학생을 기준으로 학생 이름/지역/가입한 동아리/동아리방을 출력하세요.
select S.stdName,S.addr, SC.clubName, C.roomNo
from stdtbl S
inner join stdclubtbl SC
on S.stdName = SC.stdName
inner join clubtbl C
on SC.clubName=C.clubName
order by S.stdName;

-- 동아리를 기준으로 가입한 학생의 목록을 출력하세요.
select SC.clubName, C.roomNo, S.stdName, S.addr
from stdtbl S
inner join stdclubtbl SC
on S.stdName = SC.stdName
inner join clubtbl C
on SC.clubName=C.clubName
order by C.clubName;



USE sqldb;
CREATE TABLE empTbl(emp CHAR(3), manager CHAR(3), empTel VARCHAR(8));
INSERT INTO empTbl VALUES('나사장', NULL, '0000');
INSERT INTO empTbl VALUES('김재무', '나사장', '2222');
INSERT INTO empTbl VALUES('김부장', '김재무', '2222-1');
INSERT INTO empTbl VALUES('이부장', '김재무', '2222-2');
INSERT INTO empTbl VALUES('우대리', '이부장', '2222-2-1');
INSERT INTO empTbl VALUES('지사원', '이부장', '2222-2-2');
INSERT INTO empTbl VALUES('이영업', '나사장', '1111');
INSERT INTO empTbl VALUES('한과장', '이영업', '1111-1');
INSERT INTO empTbl VALUES('최정보', '나사장', '3333');
INSERT INTO empTbl VALUES('윤차장', '최정보', '3333-1');
INSERT INTO empTbl VALUES('이주임', '윤차장', '3333-1-1');

select *
from empTbl;

-- 우대리 상관의 연락처 확인
select A.emp As '부하직원', B.emp as '직속상관', B.empTel as '직속상관연락처'
from empTbl A
inner join empTbl B
on A.manager = B.emp
where A.emp="우대리";

-- 

use employees;

select * from dept_emp;
select * from dept_manager;
select * from departments;
select * from salaries;
select * from titles;
select * from employees;

select E.emp_no, E.first_name,E.last_name,T.title
from employees E
join titles T
on E.emp_no=T.emp_no
where T.to_date ='9999-01-01';

-- 현재 재직 중인 직원 정보를 출력하세요
select e.*, t.title, s.salary
from titles t
inner join employees e
on t.emp_no = e.emp_no
inner join salaries s
on t.emp_no=s.emp_no
where t.to_date='9999-01-01'
and s.to_date='9999-01-01';

-- 현재 재직중인 직원의 정보를 출력하세요.
select e.emp_no, e.first_name,e.last_name, d.dept_name
from departments d
inner join dept_emp de
on d.dept_no = de.dept_no
inner join employees e
on de.emp_no = e.emp_no
where de.to_date='9999-01-01'
order by e.emp_no;


select* from departments;
select * from dept_emp;

-- 부서별 재직중인 직원의 수를 출력하세요.
select d.dept_no, d.dept_name, count(*)
from departments d
inner join dept_emp de
on d.dept_no=de.dept_no
inner join employees e
on de.emp_no=e.emp_no
where de.to_date='9999-01-01'
group by d.dept_no
order by d.dept_no;

select* from employees;
select* from departments;
select * from dept_emp;
-- 직원 번호가 10209인 직원의 부서 이동 히스토리를 출력하세요.
select e.emp_no, e.first_name, e.last_name, de.from_date,de.to_date
from departments d
inner join dept_emp de
on d.dept_no= de.dept_no
inner join employees e
on de.emp_no=e.emp_no
where e.emp_no='10209';