DROP
DATABASE IF EXISTS bbs;
CREATE
DATABASE bbs;
USE
bbs;


create table tbl_user
(
	uid     int primary key auto_increment,
	uname   varchar(20) unique,
	upass   varchar(100),
	head    varchar(100),
	regtime datetime,
	gender  int
);

create table tbl_board
(
	boardid   int primary key auto_increment,
	boardname varchar(50) unique,
	parentid  int
);

create table tbl_topic
(
	topicid     int primary key auto_increment,
	title       varchar(50),
	content     varchar(1000),
	publishtime datetime,
	modifytime  datetime,
	uid         int,
	boardid     int
);

alter table tbl_topic
	add constraint FK_topic_uid
		foreign key (uid) references tbl_user (uid);

alter table tbl_topic
	add constraint FK_topic_boardid
		foreign key (boardid) references tbl_board (boardid);

create table tbl_reply
(
	replyid     int primary key auto_increment,
	title       varchar(50),
	content     varchar(1000),
	publishtime datetime,
	modifytime  datetime,
	uid         int,
	topicid     int
);

alter table tbl_reply
	add constraint FK_reply_uid
		foreign key (uid) references tbl_user (uid);

alter table tbl_reply
	add constraint FK_reply_topicid
		foreign key (topicid) references tbl_topic (topicid);
