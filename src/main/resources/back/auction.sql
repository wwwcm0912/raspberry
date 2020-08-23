
create table auction  (
   auction_id int(6) not null AUTO_INCREMENT comment '拍卖品编号',
   auction_name varchar(50) not null comment '拍卖品名称',
   auction_start_price decimal(9,2) not null comment '拍卖品起拍价',
   auction_upset   decimal(9,2) not null comment '拍卖品底价',
   auction_start_time TIMESTAMP not null comment '拍卖品拍卖开始时间',
   auction_end_time TIMESTAMP not null comment '拍卖品拍卖结束时间',
   auction_pic varchar(200) not null comment '拍卖品图片',
   auction_desc varchar(500) comment '拍卖品描述',
   primary key (auction_id) 
) ENGINE = InnoDB DEFAULT CHARSET=utf8 COMMENT = '拍卖品';


create table auction_user  (
   user_id int(6) not null AUTO_INCREMENT comment '用户编号',
   user_name varchar(20) not null comment '用户名',
   user_password varchar(20) not null comment '用户密码',
   user_card_no varchar(20) comment '用户身份证号',
   user_tel varchar(20) comment '用户电话',
   user_address varchar(200) comment '用户地址',
   user_post_number varchar(6) comment '用户邮政编号',
   user_is_admin int(1) default 0 comment '用户是否是管理员，0是竞拍者，1是管理员，默认值是0',
   user_question varchar(100) comment '用户找回密码的问题',
   user_answer varchar(100) comment '用户找回密码答案',
   primary key (user_id)
)ENGINE = InnoDB DEFAULT CHARSET=utf8 COMMENT = '用户表';

create table auction_record  (
   id int(9) not null AUTO_INCREMENT comment '竞拍记录编号',
   user_id int(6) comment '竞拍者编号',
   auction_id int(6) not null comment '拍卖品编号',
   auction_time TIMESTAMP default current_timestamp not null comment '竞价时间',
   auction_price decimal(9,2) not null comment '竞拍价格',
	 primary key (id),
   constraint user_rel_foreignkey foreign key (user_id) references auction_user (user_id),
   constraint auction_rel_foreignkey foreign key (auction_id) references auction (auction_id)
)ENGINE = InnoDB DEFAULT CHARSET=utf8 COMMENT = '竞拍记录';