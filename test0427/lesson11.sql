/*  1创建表 dept1*/
CREATE TABLE dept1
(
id int(7),
name varchar(25)
);

/*  2将表 departments 中的数据插入新表 dept2 中*/
CREATE TABLE dept2 LIKE departments;
INSERT INTO dept2 SELECT * FROM departments;

/*  3. 创建表 emp5*/
CREATE TABLE emp5
(
id int(7),
First_name Varchar(25),
Last_name Varchar(25),
Dept_id int(7)
)
/*  4. 将列 Last_name 的长度增加到 50*/
ALTER TABLE emp5
MODIFY COLUMN  Last_name Varchar(50);

/*  5. 根据表 employees 创建 employees2*/
CREATE TABLE employees2 LIKE employees;
INSERT INTO employees2 SELECT * FROM employees;

/*  6. 删除表 */
DROP TABLE emp5;

/*  7 将表 employees2 重命名为 emp5 */
ALTER TABLE employees2
RENAME TO emp5555;

/* 8 在表 dept1 和 emp5555 中添加新列 test_column，并检查所作的操作*/
ALTER TABLE dept1 ADD  test_column VARCHAR(20);
ALTER TABLE emp5555 ADD test_column VARCHAR(20);

/*  9 直接删除表 emp5555 中的列 dept_id */
ALTER TABLE emp5555
DROP COLUMN dept_id;








