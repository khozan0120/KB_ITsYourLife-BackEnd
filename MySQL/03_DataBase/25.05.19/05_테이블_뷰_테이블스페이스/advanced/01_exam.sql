-- 기존에 테이블이 존재하면 삭제
drop database if exists useTBL;
drop database if exists butTBL;

-- tabledb 사용
use tabledb;
-- userTBL만들기
create table useTBL
(
    userID    char(8) not null primary key,
    name      char(8) not null,
    birthyear int     not null
);
-- butTBL생성
create table butTBL
(
    num int not null primary key auto_increment,
    userID char(8) not null,
    prodName char(6) not null,
    FOREIGN KEY (userID) references useTBL(userID)
);
-- alter를 이용해 userID를 외래키로 수정.
-- 기존 buyTBL,userTBL 삭제
drop database if exists useTBl;
drop database if exists butTBl;

-- userTBL테이블 정의
create table useTBL
(
    userID char(8) not null  primary key,
    name varchar(10) not null,
    birthyear int not null,
    email char(30) unique
);

drop database if exists useTBL;

create table useTBL
(
    userID char(8) not null  primary key,
    name varchar(10),
    birthYear int check ( birthYear >= 1900 and birthYear <= 2023 ),
    mobile char(3) not null
);

drop database if exists useTBL;

create table useTBL
(
    userID char(8) not null  primary key,
    name varchar(10) not null,
    birthYear int not null  default -1,
    addr char(2) not null  default 'Seoul',
    mobile1 char(3),
    mobile2 char(8) ,
    height smallint   default  170,
    mDate date
);

--  기본값 추가를 확인할 수 있는 데이터 추가
INSERT INTO useTBL(userID, name,birthYear,addr,mobile1,mobile2,height,mDate)
values ()

-- mobile1 컬럼을 삭제
delete
from useTBL
where mobile1;

-- name 컬러명을 uName으로 변경
-- 기본키를 제거함




--



