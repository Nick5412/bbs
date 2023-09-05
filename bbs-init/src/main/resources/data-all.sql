insert into tbl_board(boardname, parentid)
values ('.net', 0);
insert into tbl_board(boardname, parentid)
values ('java', 0);
insert into tbl_board(boardname, parentid)
values ('数据库', 0);
insert into tbl_board(boardname, parentid)
values ('其它', 0);
insert into tbl_board(boardname, parentid)
values ('ado.net', 1);
insert into tbl_board(boardname, parentid)
values ('asp.net', 1);
insert into tbl_board(boardname, parentid)
values ('vb.net', 1);
insert into tbl_board(boardname, parentid)
values ('jsp', 2);
insert into tbl_board(boardname, parentid)
values ('struts', 2);
insert into tbl_board(boardname, parentid)
values ('hibernate', 2);
insert into tbl_board(boardname, parentid)
values ('sql', 3);
insert into tbl_board(boardname, parentid)
values ('oracle', 3);
insert into tbl_board(boardname, parentid)
values ('mysql', 3);

insert into tbl_user(uname, upass, head, regtime, gender)
values ('a', 'd7afde3e7059cd0a0fe09eec4b0008cd', '1.gif', now(), 1);

insert into tbl_topic(title, content, publishtime, modifytime, uid, boardid)
values ('jsp  good', ' good,i agree', now(), now(), 1, 8);
insert into tbl_topic(title, content, publishtime, modifytime, uid, boardid)
values ('jsp is very good', 'very good,i agree', now(), now(), 1, 8);
insert into tbl_topic(title, content, publishtime, modifytime, uid, boardid)
values ('jsp is very good', 'very good,i agree', now(), now(), 1, 8);
insert into tbl_topic(title, content, publishtime, modifytime, uid, boardid)
values ('jsp is very good', 'very good,i agree', now(), now(), 1, 8);
insert into tbl_topic(title, content, publishtime, modifytime, uid, boardid)
values ('jsp is very good', 'very good,i agree', now(), now(), 1, 8);
insert into tbl_topic(title, content, publishtime, modifytime, uid, boardid)
values ('ado.net is very good', 'very good,i agree', now(), now(), 1, 5);

insert into tbl_reply(title, content, publishtime, modifytime, uid, topicid)
values ('jsp is very good reply', 'very good,i agree, reply', now(), now(), 1, 2);
insert into tbl_reply(title, content, publishtime, modifytime, uid, topicid)
values ('jsp is very good reply', 'very good,i agree, reply', now(), now(), 1, 2);
insert into tbl_reply(title, content, publishtime, modifytime, uid, topicid)
values ('jsp is very good reply', 'very good,i agree, reply', now(), now(), 1, 2);
insert into tbl_reply(title, content, publishtime, modifytime, uid, topicid)
values ('jsp is very good reply', 'very good,i agree, reply', now(), now(), 1, 2);
insert into tbl_reply(title, content, publishtime, modifytime, uid, topicid)
values ('jsp is very good reply', 'very good,i agree, reply', now(), now(), 1, 2);
