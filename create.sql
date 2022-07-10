create sequence hibernate_sequence start 1 increment 1;
create sequence user_sequence start 1 increment 1;
create table event (id int8 not null, date timestamp, description varchar(255), details varchar(255), name varchar(255), primary key (id));
create table member (id int8 not null, lastname varchar(255), user_role varchar(255), email varchar(255), enabled boolean, locked boolean, name varchar(255), number int4 not null, password varchar(255), primary key (id));
