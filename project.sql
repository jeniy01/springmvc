create table board_info_table(
    board_info_idx number constraint BOARD_INFO_PK primary key,
    board_info_name varchar2(500) not null
);
insert into board_info_table VALUES (1, '자유게시판');
insert into board_info_table(board_info_idx, board_info_name) VALUES (2, '유머게시판');
insert into board_info_table(board_info_idx, board_info_name) VALUES (3, '정치게시판');
insert into board_info_table(board_info_idx, board_info_name) VALUES (4, '스포츠게시판');
select board_info_idx, board_info_name from board_info_table order by board_info_idx;

create table user_table(
    user_idx number constraint USER_PK primary key,
    user_name varchar2(50) not null,
    user_id varchar2(100) not null,
    user_pw varchar2(100) not null
);
select * from user_table;
drop table user_table;
delete from user_table;
commit;

-- drop table content_table purse;
create table content_table(
    content_idx number constraint CONTENT_PK primary key,
    content_subject varchar2(500) not null,
    content_text long not null,
    content_file varchar2(500),
    content_writer_idx number not null constraint CONTENT_FK1 references user_table(user_idx),
    content_board_idx number not null constraint CONTENT_FK2 references board_info_table(board_info_idx),
    content_date date not null
);
-- insert into content_table VALUES ();
select * from content_table;
delete from content_table;
commit;
select * from user_table;
drop table content_table;

drop sequence user_seq;
drop sequence content_seq;

create sequence user_seq
start with 0
increment by 1
minvalue 0;

create sequence content_seq
start with 0
increment by 1
minvalue 0;

commit;

-- insert into content_table(content_idx, content_subject, content_text, content_file, content_writer_idx, content_board_idx, content_date) values(content_seq.nextval, #{content_subject}, #{content_text}, #{content_file}, #{content_writer_idx}, #{content_board_idx}, sysdate);

-- 전체 글 개수
-- SELECT count (*) FROM content_table WHERE content_board_idx = 1;
-- SELECT * FROM content_table;
-- SELECT count (*) FROM content_table WHERE content_board_idx = 2;
-- SELECT count (*) FROM content_table WHERE content_board_idx = 3;
-- SELECT count (*) FROM content_table WHERE content_board_idx = 4;
