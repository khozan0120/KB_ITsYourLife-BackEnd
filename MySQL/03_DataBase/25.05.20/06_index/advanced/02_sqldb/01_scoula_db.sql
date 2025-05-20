-- 다음과같이실습데이터베이스및사용자를생성하고,
-- 해당데이터베이스에대해모든권한을부여하세요.
-- 데이터베이스명: scoula_db
-- 사용자명: scoula
--  비밀번호: 1234
--  접속호스트: 제한없음

create database scoula_db;

create  user  'scoula'@'%'  identified  by  '1234';

grant  all  privileges  on  scoula_db.*   to  'scoula'@'%';
