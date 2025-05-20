use sqldb;

create table tbl3
(
    a int unique,
    b int unique, -- b 유니크 -> unique 인덱스 생성(중복불가, null 허용)
    c int unique, -- c 유니크 -> unique 인덱스 생성(중복불가, null 허용)
    d int
);
-- tbl3이 가지고있는 인덱스 조회
show index from tbl3;