/*
JOIN
- 두개 이상의 테이블을 관련있는 컬럼을 통해서 결합하는데 사용
- 반드시 연관있는 컬럼이 존재해야함
*/

/*
sqldb 데이터베이스에서다음조건을처리하세요.
○ 사용자별로구매이력을출력함
○ 모든컬럼을출력함
○ 구매이력이없는정보는출력하지않음
앞의결과에서userID가 'JYP'인 데이터만출력하세요.
*/

select
    *
from buytbl b
    inner join usertbl u
--             join usertbl.u  -- inner를 빼고 써도 같은결과 값이 나온다.
    on b.userID = u.userID
    -- using  (userID);
    -- USING : 컬럼명이 같을 경우 컬럼에 대한 조건을 작성해서 join  가능
where b.userID = 'JYP';


/*
sqldb 데이터베이스에서다음조건을처리하세요.
○ 각사용자별로구매이력을출력하세요.
○ 연결컬럼은userID로함
○ 결과를userID를 기준으로오름차순으로정렬함
○ 구매이력이없는사용자도출력하세요.
○ userID, name, prodName, addr, 연락처를 다음과 같이 출력함
*/

select  u.userID, u.name, prodName, u.addr, concat(u.mobile1,u.mobile2)
from usertbl u
    left outer join buytbl b
    on u.userID = b.userID
order by u.userID;

# sqldb의사용자를모두조회하되전화가없는사람은제외하고출력하세요.
    select  *
    from usertbl
    where name in (
        -- 유저중에 휴대폰번호가 없는사람(null인사람)
        select name
        from  usertbl
        where mobile1 is null
        );
# sqldb의사용자를모두조회하되전화가없는사람만출력하세요.

/*
 UNION(합집합)
 -- 두 쿼리의 결과를 하나의 RESULT로 합치는것
 -- 중복된 행이 결과에 포함 X
 UNION ALL (합집합 + 교집합)
  -- 두 쿼리의 결과를 하나의 RESULT로 합치는것
 -- 중복된 행이 결과에 포함 O
 */

select
    name,
    addr,
    mobile1
from usertbl
where
    addr = '서울'

UNION ALL

select
    name,
    addr,
    mobile1
from
    usertbl
where
    mobile1 = '011';