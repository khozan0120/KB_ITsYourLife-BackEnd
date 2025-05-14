-- SELECT
-- 특정 테이블에서 원하는 데이터를 조회 할 수 있다.

select -- 조회해줘
    *       -- 모든 컬럼을
from -- buytbl에서
    buytbl;

select
    userID,
    groupName
from
    buytbl;

select (5  + 5);


--현재 시간 출력
select  now();
-- 컬럼에 별칭사용 빈칸을 사용하고 싶으면 '''으로 묶어주기
select concat('Hozan', ' 안녕', 'KB') as '인 사';

-- usertbl의 name, mobile1, mobile2 를 출력
-- mobile1, mobile2는 붙어서 전화번호 라는 컬럼으로 조회되어야함

select
    name,
    concat(usertbl.mobile1,usertbl.mobile2)
from usertbl;