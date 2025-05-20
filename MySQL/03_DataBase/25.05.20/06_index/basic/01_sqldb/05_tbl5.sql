use tabledb;

create table tbl5
(
    a int unique not null,
    b int unique,         -- b 유니크 -> unique 인덱스 생성(중복불가, null 허용)
    c int unique,         -- c 유니크 -> unique 인덱스 생성(중복불가, null 허용)
    d int primary key -- >primary 클러스트형 인덱스 설정
);
-- tbl4이 가지고있는 인덱스 조회
show index from tbl5;