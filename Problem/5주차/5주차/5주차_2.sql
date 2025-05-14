-- 배포된 sqldb.sql 파일을 이용하여 sqldb데이터베이스를 구축하세요
use sqldb;

-- usertbl 테이블에서 이름이 '김경호'인 행을 출력하세요.
    select *
    from usertbl
    where  name like '김경호';

-- usertbl 테이블에서 생년이 1970 이상이고 키가 182이상인 데이터를 출력하세요.
select *
from usertbl
where birthYear >= 1970 and height >= 182;

-- usertbl 테이블에서 키가 180~183 범위인 데이터를 출력하세요.
select *
from usertbl
where height >= 180 and height <= 183;

-- usertbl 테이블에서 주소가 '경남' 또는 '전남' 또는 '경북'인 데이터를 출력하세요.
select *
from usertbl
where addr like '경남' or '전북' or '경북';

-- usertbl 테이블에서 이름이 '김'으로 시작하는 데이터를 출력하세요
select *
from usertbl
where  name like '김%';


-- usertbl 에서 김경호 보다 큰 사람들의 이름과 키를 출력하세요.
select
    name,
    height
from usertbl
where height > 177;

-- usertbl을 mdata의 오름 차순으로 정렬하여 출력하세요.
    select mDate
    from usertbl
    ORDER BY mDate;

-- usertbl을 mdata의 내림 차순으로 정렬하여 출력하세요.
select mDate
from usertbl
ORDER BY mDate desc ;

-- usertbl을 height의 내림차순으로 정렬하고,
-- 동률인 경우 name의 내림차순으로 정렬하여 출력하세요.
select height, name
from usertbl
ORDER BY
    height,
    name desc ;

-- usertbl의 주소지를 중복없이 오름 차순으로 출력하시오.
select
    distinct addr
from usertbl
ORDER BY  addr;
