use sqldb;

select *
from usertbl;

select *
from buytbl;

select *
from usertbl
inner join buytbl
on buytbl.userID = usertbl.userID;

-- 사용자별로 구매 이력 출력 <사용자 테이블을 조인으로 가져옴>
select *
from buytbl
inner join usertbl
on buytbl.userID = usertbl.userID
where buytbl.userID="JYP";

-- 위 아래 차이는 열이 들어오는 순서로 차이가 있는데 어떤걸 긁어 와서 inner join 되는지가 달라지는듯
select *
from usertbl
inner join buytbl
on buytbl.userID=usertbl.userID
where buytbl.userID="JYP";

-- sqldb 데이터베이스에서 다음 조건을 처리하세요.
select U.userID, name, B.prodName, U.addr, concat(U.mobile1,U.mobile2) as '연락처'
from usertbl U 
left join buytbl B
on U.userID = B.userID
order by U.userID;

-- sqldb 사용자를 모두 조회하되 전화가 없는 사람은 제외하고 출력하세요.
select name, concat(mobile1, mobile2) as '전화번호'
from usertbl
where name not in (select name from usertbl where mobile1 is null);

-- sqldb 사용자를 모두 조회하되 전화가 없는 사람만 출력하세요.
select name, concat(mobile1, mobile2) As '전화번호'
from usertbl
where name in (select name from usertbl where mobile1 is null);


