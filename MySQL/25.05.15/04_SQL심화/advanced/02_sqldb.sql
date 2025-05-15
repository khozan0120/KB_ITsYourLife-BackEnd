-- ''우대리' 의 상관 연락처 정보
-- 부하직원, 직속상관, 직속상관연락처
select
    A. emp AS '부하직원',
    B. manager AS '직속상관',
    B.empTel AS '직송상관연락처'
from
    emptbl A
inner join emptbl B
on A.manager = B.emp
where A.emp = '우대리';