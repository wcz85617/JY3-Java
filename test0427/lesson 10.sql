/*1 本创建表 my_employees*/
CREATE TABLE my_employees
(
Id int(10),
First_name varchar(10),
Last_name varchar(10),
Userid varchar(10),
Salary double(10,2)
)
CREATE TABLE users(
id int,
Userid varchar(10),
department_id int
)

/*2 显示表 my_employees 的结构*/
DESC my_employees;

/*3向 my_employees 表中插入下列数据*/

INSERT INTO my_employees VALUES(1,'patel','Ralph','Rpatel',895);
INSERT INTO my_employees VALUES(2,'Dancs','Betty','Bdancs',860);
INSERT INTO my_employees VALUES(3,'Biri','Ben','Bbiri',1100);
INSERT INTO my_employees VALUES(4,'Newman','Chad','Cnewman',750);
INSERT INTO my_employees VALUES(5,'Ropeburn','Audrey','Aropebur',1550);

/*4向 users 表中插入数据*/

INSERT INTO users VALUES(1,'Rpatel',10);
INSERT INTO users VALUES(2,'Bdancs',10);
INSERT INTO users VALUES(3,'Bbiri',20);
INSERT INTO users VALUES(4,'Cnewman',30);
INSERT INTO users VALUES();
INSERT INTO users VALUES(5,'Aropebur',40);

/*5将 3 号员工的 last_name 修改为“drelxer”*/
UPDATE my_employees SET last_name = 'drelxer'
WHERE id = 3;

/*6 将所有工资少于 900 的员工的工资修改为 1000*/
UPDATE my_employees SET salary = 1000
WHERE salary < 900;

/*7 将 userid 为 Bbiri 的 user 表和 my_employees 表的记录全部删除*/
DELETE FROM users WHERE userid = 'Bbiri';
DELETE FROM my_employees WHERE userid = 'Bbiri';

/*8 删除所有数据*/
DROP TABLE users;DROP TABLE my_employees;
/*9检查所作的修正*/
/*10清空表 my_employees*/
TRUNCATE TABLE my_employee;




