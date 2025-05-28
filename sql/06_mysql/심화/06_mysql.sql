use sqldb;
-- sqldb에서 usertbl 테이블에서 다음 내용들을 확인하세요.
select * from usertbl;

show index from usertbl;

-- addr컬럼에 대해 idx_usertbl_addr 이름으로 인덱스 만들고, 인덱스 목록을 확인하세요.
create index idx_usertbl_addr
on usertbl(addr);

show index from usertbl;

-- 인덱스 크기 확인
show table status like 'usertbl'; -- index_length 0

-- anlyze table문으로 먼저 테이블 분석/처리해줘야 함
analyze table usertbl;
show table status like 'usertbl'; -- index_length 바뀜


-- usertbl에 대해 다음 처리
-- birthYear 컬럼에 대해 idx_usertbl_birthYear 이름 인덱스 만들기
create index idx_usertbl_birthYear
on usertbl(birthYear);

create index idx_usertbl_name
on usertbl(name);

show index from usertbl;

-- name 컬럼에 대한 보조 인덱스를 삭제하세요.
drop index idx_usertbl_name
on usertbl;

-- name, birthYear 컬럼 조합으로 인덱스 생성
create index idx_usertbl_name_birthYear
on usertbl(name,birthYear);

show index from usertbl;

drop index idx_usertbl_name_birthYear
on usertbl;

-- 데이터베이스 및 사용자 생성하고, 해당 db에 대해 모든 권한 부여하세요.
create database scoula_db;

create user 'scoula'@'%' identified by '1234';
grant all privileges on scoula_db.* to 'scoula'@'%';
flush privileges;





