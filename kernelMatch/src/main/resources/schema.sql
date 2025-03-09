use kernelMatch;

DROP TABLE IF EXISTS user;
DROP TABLE IF EXISTS post;

create table user (
	id bigint auto_increment,
    name varchar(50) not null,
    password varchar(100) not null,
    email varchar(100) not null unique,
    phone varchar(15) not null,
    role enum('ADMIN', 'MEMBER') not null default 'MEMBER',
    is_active boolean default true,
    registered_at timestamp default current_timestamp,
    primary key(id)
);

create table post (
	id bigint auto_increment,
    title varchar(100) not null,
    content text not null,
    created_at timestamp default current_timestamp,
    user_id bigint not null,
    primary key(id)
);