drop table board_info_table purge;
create table board_info_table(
  board_info_idx number constraint BOARD_INFO_PK primary key,
  board_info_name varchar2(500) not null
);

insert into board_info_table VALUES (1, '자유게시판');
insert into board_info_table(board_info_idx, board_info_name) VALUES (2, '유머게시판');
insert into board_info_table(board_info_idx, board_info_name) VALUES (3, '정치게시판');
insert into board_info_table(board_info_idx, board_info_name) VALUES (4, '스포츠게시판');

commit;
select board_info_idx, board_info_name 
  from board_info_table
order by board_info_idx;  

select board_info_idx, board_info_name
from board_info_table
order by board_info_idx;


commit;

create table user_table(
    user_idx	number constraint USER_PK primary key,
    user_name	varchar2(50) not null,
    user_id	    varchar2(100) not null,
    user_pw	    varchar2(100) not null
);

desc user_table;

/* user_idx, user_name, user_id, user_pw */
INSERT INTO user_table VALUES(user_seq.nextval, '더조은', 'spring', '1234');
INSERT INTO user_table(user_idx, user_name, user_id, user_pw) 
       VALUES(user_seq.nextval , '아카데미', 'java', '3456');
INSERT INTO user_table(user_idx, user_name, user_id, user_pw) 
       VALUES(user_seq.nextval , '학원', 'python', '1111');
       
DELETE FROM user_table;
       
COMMIT;

SELECT * FROM user_table;

/*
    Foreign key
    content_writer_idx <-- user_table(user_idx)
    content_board_idx  <-- board_info_table(board_info_idx)
*/
drop table content_table purge;
create table content_table(	
    content_idx	number constraint CONTENT_PK primary key,
    content_subject	varchar2(500) not null,
    content_text	long not null,
    content_file	varchar2(500),
    content_writer_idx	number not null
                        constraint CONTENT_FK1 references user_table(user_idx),
    content_board_idx	number not null
                        constraint CONTENT_FK2 references board_info_table(board_info_idx),    
    content_date	date not null
);

-- sequence
drop sequence user_seq;
create sequence user_seq
start with 0
increment by 1
minvalue 0;

create sequence content_seq
start with 0
increment by 1
minvalue 0;












