drop database dinamore;
create database dinamore;
use dinamore;

create table customer(
    cid varchar(10)not null,
    cname varchar(100),
    caddress varchar(100),
    cTelephone int(20),
    constraint primary key(cid)
);

create table chef(
    ch_id varchar(10)not null,
    ch_name varchar(100),
    constraint primary key(ch_id)
);

create table tpOperator(
    tp_id varchar(10) not null,
    tp_name varchar(100),
    constraint primary key(tp_id)
);

create table delivers(
    did varchar(10)not null,
    d_name varchar(100),
    constraint primary key(did)
);

create table food(
    foodid varchar(10)not null,
    foodname varchar(100),
    price decimal(10,2),
    constraint primary key(foodid)
);

create table payment(
    pid varchar(10)not null,
    price decimal(10,2),
    payment_status varchar(30),
    constraint primary key(pid)
);

create table Orders(
    or_id varchar(10)not null,
    cid varchar(10)not null,
    pid varchar(10)not null,
    ch_id varchar(10)not null,
    tp_id varchar(10)not null,
    did varchar(10)not null,
    orderDate date,
    orderStatus varchar(30),
    constraint primary key(or_id),
    CONSTRAINT FOREIGN KEY(cid) REFERENCES customer(cid)
    ON Delete Cascade On update cascade,
    CONSTRAINT FOREIGN KEY(pid) REFERENCES payment(pid)
    ON Delete Cascade On update cascade,
    CONSTRAINT FOREIGN KEY(ch_id) REFERENCES chef(ch_id)
    ON Delete Cascade On update cascade,
    CONSTRAINT FOREIGN KEY(tp_id) REFERENCES tpOperator(tp_id)
    ON Delete Cascade On update cascade,
    CONSTRAINT FOREIGN KEY(did) REFERENCES delivers(did)
    ON Delete Cascade On update cascade
);

create table orderDetails(
    or_id varchar(10)not null,
    foodid varchar(10)not null,
    qty int,
    total decimal(10,2),
    CONSTRAINT FOREIGN KEY(or_id) REFERENCES Orders(or_id)
    ON Delete Cascade On update cascade,
    CONSTRAINT FOREIGN KEY(foodid) REFERENCES food(foodid)
    ON Delete Cascade On update cascade
);
