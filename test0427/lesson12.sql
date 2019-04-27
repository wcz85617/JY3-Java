/*  where emp2?1. 向表 emp2 的 id 列中添加 PRIMARY KEY 约束（my_emp_id_pk）*/

/*  2. 向表 dept2 的 id 列中添加 PRIMARY KEY 约束（my_dept_id_pk）*/
ALTER TABLE dept2 
MODIFY COLUMN department_id PRIMARY KEY;

/*  向表 emp2 中添加列 dept_id，并在其中定义 FOREIGN KEY 约束，与之相关联的列是
dept2 表中的 id 列。*/








