show databases;

use employees;

show tables;

select * from employees;

select * from titles;

select first_name from employees;

select first_name,last_name,gender from employees;

select first_name,gender, hire_date from employees;

select * from usertbl;

select *
from usertbl
where name="김경호";

select *
from usertbl
where birthYear>=1970 and height>=182;

select *
from usertbl
where height>=180 and height <=183;

select *
from usertbl
where addr="경남" or addr="전남" or addr="경북";

select *
from usertbl
where name like "김%";

select name,height
from usertbl
where height > (select height from usertbl where name="김경호");

select *
from usertbl
order by mDate;

select *
from usertbl
order by mDate desc;

select *
from usertbl
order by height desc, name desc;

select addr distint
from usertbl;

use world;

select *
from city;

select *
from city
where CountryCode="KOR"
order by Population desc;

select CountryCode, Population
from city
order by CountryCode, Population Desc;

select count(*)
from city
where CountryCode="KOR";

select *
from city
where CountryCode in ("KOR","CHN","JPN");

select *
from city
where CountryCode="KOR" and Population>=1000000;

select *
from city
where CountryCode="KOR"
order by Population
limit 10;

select *
from city
where CountryCode="KOR" and Population>=1000000 and Population <=5000000;