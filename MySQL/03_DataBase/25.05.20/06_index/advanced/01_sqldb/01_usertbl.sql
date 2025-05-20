use sqldb;

-- usertbl 내용확인
select * from usertbl;
-- usertbl의 인덱스 목록 확인
show index from usertbl;
-- usertbl의 데이터 크기와 인덱스 크기 확인
analyze table usertbl;
show table status  like "usertbl";

-- usertbl의addr 컬럼에 대해idx_usertbl_addr이름으로 인덱스를 만들고,
-- 인덱스목록을확인하세요.
create index idx_usertbl_addr on usertbl(addr);
show index from usertbl;

-- usertbl의상태를출력하여인덱스의내용이만들어졌는지확인하고,
show index  from usertbl;
-- 내용이없다면실제적용되도록한후,
create index idx_usertbl on usertbl(userID);
-- 인덱스의크기를확인하세요.
analyze table usertbl;
show table status like 'usertbl';

-- usertbl에대해다음을처리하세요.
-- birthYear 컬럼에 대해 idx_usertbl_birthYear 이름의 인덱스를 만드세요.
    create index idx_usertbl_birthYear on usertbl(birthYear);
-- 에러가난다면그이유를설명하세요
-- name 컬럼에대해idx_usertbl_nam 이름의 인덱스를 만드세요
    create index idx_usertbl_nam on usertbl(name);
-- 생성된인덱스의목록을확인하세요.
show index  from usertbl;

-- usertbl에서앞에서만든인덱스를삭제하세요.
drop index idx_usertbl_addr on usertbl;
drop index idx_usertbl_birthYear on usertbl;
drop index idx_usertbl_nam on usertbl;
drop index  idx_usertbl on usertbl;