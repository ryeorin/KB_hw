use sqldb;

select * from buytbl;

select userID as "사용자 아이디", sum(amount) as "총 구매 개수"
from buytbl
group by userID;

select userID as "사용자 아이디", sum(amount*price) as "총 구매액"
from buytbl
group by userID;

select avg(amount) as "평균 구매 개수"
from buytbl
group by userID;

select *
from usertbl;

select name,height
from usertbl
where height=(select max(height) from usertbl)
or height =(select min(height) from usertbl);

select count(mobile1) as "휴대폰이 있는 사용자"
from usertbl;

select userID as "사용자", sum(price*amount)as "총구매액"
from buytbl
group by userID;

select userID as "사용자", sum(price*amount)as "총구매액"
from buytbl
group by userID
having sum(price*amount)>1000;


--

use world;

select *
from city;

select sum(Population) as "인구수 총합"
from city
where CountryCode="KOR";


select min(Population) as "최소값"
from city
where CountryCode="KOR";

select avg(Population)
from city
where CountryCode="KOR";

select max(Population) as "최대값"
from city
where CountryCode="KOR";

select*
from country;

-- country 테이블 각 레코드의Name 칼럼의 글자수를 표시하시오.
select char_length(Name)
from country;

-- country 테이블의 나라명을 앞 세글자만 대문자로 표시하시오.
select upper(mid(Name,1,3))
from country;

-- country테이블의 나라명(Name 칼럼)을 앞 세글자만 대문자로 표시하시오.
select name as 이름, round(lifeexpectancy,1) as 기대수명
from country;


-- employees database 수행
use employees;

-- employees db에서 각 부서별 관리자 출력하세요.
select *
from dept_manager
where to_date="9999-01-01";

-- 부서번호d005 부서의 현재 관리자 정보를 출력하세요
select *
from employees
where emp_no= (select emp_no from dept_manager where to_date="9999-01-01" and dept_no ='d005');

select * from employees;
-- employees 테이블에서 페이지네이션으로 페이지를 추출하려고 한다.
-- 입사일 내림차순으로 정렬
select *
from employees
order by hire_date desc
limit 20;

-- employees 재직자의 총 수 to_date
select count(emp_no)
from dept_emp
where to_date="9999-01-01";

select* from salaries;
-- employees 재직자 평균 급여
select avg(salary)
from salaries
where to_date='9999-01-01';


-- 재직자 전체 평균 급여 보다 급여를 더 많이 받는 재직자를 출력하세요.
select *
from salaries
where to_date="9999-01-01" and salary > 
(select avg(salary) from salaries where to_date="9999-01-01");

-- employees db에서 각 부서별 재직자의 수를 구하시오.
select dept_no, count(*)
from dept_emp
where to_date="9999-01-01"
group by dept_no
order by dept_no;

