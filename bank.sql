create database bankmanagementsystem;

show databases;

use bankmanagementsystem;

create table signup(formno varchar(20),name varchar(20), father_name varchar(20), dob varchar(20),gender varchar(20),email varchar(30),marital_status varchar(20),address varchar(30),city varchar(20),state varchar(20),pinCode varchar(20));

show tables;

create table login(formno varchar(20), cardnumber varchar(30), pinnumber varchar(10));

select * from signup;

select * from signUpTwo;

create table signUpTwo(formno varchar(20),religion varchar(20), category varchar(20), income varchar(20),education varchar(20),occupation varchar(30),pan varchar(20),aadhar varchar(30),seniorcitizen varchar(20),existingaccount varchar(20));

select * from login;

DESCRIBE signUpThree;

select * from bank;

Drop table bank;
Drop table login;

DESCRIBE signUpThree;

select * from signUpThree;
drop table login;

create table signUpThree( formno varchar(20), accountType varchar(40), cardnumber varchar(25), pinnumber varchar(10), facility varchar(100));

create table bank(pinnumber varchar(20),date varchar(50),type varchar(20), amount varchar(20));
