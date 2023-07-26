show databases;
use bootcamp;
create table employee2(id int, name char(30),dept varchar(30),age int,salary float);
desc employee2;
insert into employee2 values(1,'lavanya','hr',22,66000);
insert into employee2 values(2,'rohit','hr',29,50000);
insert into employee2 values(3,'manu','developer',32,86000);

select * from employee2;
select id,name from employee2;
select id,age from employee2;
insert into employee2(id,name) values(4,'riya');
insert into employee2(id,name,age) values(5,'ankit',36);
select * from employee2;
update employee2 set dept='developer' where id=5;
update employee2 set dept='developer',age=33,salary=77000 where id=4;
select * from employee2;
select name,salary,salary+5000 as bonus,salary/30 as perDaySalary from employee2;
select * from employee2 where dept='hr';
select * from employee2 where dept<>'hr';
select * from employee2 where dept='hr' and age<30;
select * from employee2 where salary between 50000 and 80000;
select * from employee2 where not dept='hr';
select * from employee2 where name like 'a%';
select * from employee2 where name like '%t';
select * from employee2 where name like '_o%';
select * from employee2 where name like '%i_';
select * from employee2 where name like '%a%';
insert into employee2 values(6,'mukesh','tester',23,30000);
insert into employee2 values(7,'dinu','tester',34,25000);
insert into employee2 values(8,'adi','developer',25,68000);
select min(salary) from employee2;
select max(salary) from employee2;
select min(salary),max(salary),sum(salary),avg(salary),count(salary) from employee2;
select id,name ,upper(name),lower(name),length(name) from employee2;
select round(34.677,1);
select dept,round(sum(salary),3),count(id),max(salary) from employee2 
group by dept
order by count(id) desc;

select dept,round(sum(salary),3),count(id),max(salary) from employee2 
group by dept
having count(id)>=2
order by count(id) desc;

select * from employee2 where salary is null;
select * from employee2 where salary is not null;
select * from employee2 
where salary>
(select salary from employee2 where dept='tester');
select * from employee2 where salary=25000;
select * from employee2 where salary in (25000,30000,66000,88000);
create table emp
(
id int not null primary key,
name varchar(30)not null,
dept varchar(30) default'bench',
age int check(age>22),
mobileno varchar(10) unique,
emailid varchar(30) unique
);
desc emp;


