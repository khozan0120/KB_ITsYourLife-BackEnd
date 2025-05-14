-- 국가 코드가 'KOR'인 도시를 찾아 인구수를 역순으로 표시하세요.
select
    Population
from city
where CountryCode Like 'KOR'
order by Population desc;

-- city 테이블에서 국가코드와 인구수를 출력하라. 정렬은 국가코드별로 오름차순으로,\
    select
        CountryCode,
        Population
    from city
    ORDER BY  CountryCode asc ;

-- 동일한 코드(국가) 안에서는 인구 수의 역순으로 표시하세요.
    select
        CountryCode,
        Population
    from city
    ORDER BY CountryCode asc, Population desc ;

-- city 테이블에서 국가코드가 'KOR'인 도시의 수를 표시하세요.
    select
        count(*) as city_count
    from city
    where CountryCode LIKE 'KOR';

-- city 테이블에서 국가코드가 'KOR', 'CHN', 'JPN'인 도시를 찾으세요.
    select CountryCode
    from city
    where CountryCode IN ('KOR' or 'CHN' or 'JPN');
-- 국가코드가 'KOR'이면서 인구가 100만 이상인 도시를 찾으세요.-
    select CountryCode
    from city
    where Population >= 1000000
        or CountryCode LIKE 'KOR';
-- 국가 코드가 'KOR'인 도시 중 인구수가 많은 순서로 상위 10개만 표시하세요.]
select *
from city
where CountryCode LIKE 'KOR'
order by Population DESC
LIMIT 10;
-- city 테이블에서 국가코드가 'KOR'이고, 인구가 100만 이상 500만 이하인 도시를 찾으세요
select *
from city
where CountryCode LIKE 'KOR'
 and Population >= 1000000 and Population <= 5000000;