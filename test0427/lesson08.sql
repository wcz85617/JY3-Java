/*显示所有员工的姓名，部门号和部门名称。*/
SELECT first_name,last_name,departments.department_id,department_name
FROM employees,departments
WHERE employees.department_id = departments.department_id

/*查询 90 号部门员工的 job_id 和 90 号部门的 location_id*/
SELECT job_id,location_id,first_name
FROM employees,departments
WHERE employees.department_id = departments.department_id
AND employees.department_id = 90;

/*选择所有有奖金的员工的
last_name , department_name , location_id , city*/

SELECT last_name , department_name , loc.location_id , city
FROM employees emp , departments dep ,locations loc
WHERE emp.department_id = dep.department_id AND 
dep.location_id = loc.location_id
AND commission_pct IS NOT NULL;

/*选择city在Toronto工作的员工的
last_name , job_id , department_id , department_name */
SELECT last_name , job_id , emp.department_id , department_name 
FROM employees emp , departments dep ,locations loc
WHERE emp.department_id = dep.department_id 
AND loc.city = 'Toronto';

/*查询每个工种、每个部门的部门名、工种名和最低工资*/
SELECT department_name ,job_title , MIN(salary)
FROM employees emp ,jobs,departments dep
WHERE emp.job_id = jobs.job_id 
AND emp.department_id = dep.department_id
GROUP BY emp.department_id

/*OK！！！查询每个国家下的部门个数大于 2 的国家编号*/
SELECT COUNT(*),country_id FROM
departments dep,locations loc
WHERE dep.location_id = loc.location_id
GROUP BY country_id
HAVING COUNT(*) > 2;


/* 把一个表分成两个表去看，on后面的内容是关键
选择指定员工的姓名，员工号，以及他的管理者的姓名和员工号式*/
SELECT CONCAT(emp1.first_name)"员工的姓名",CONCAT(emp1.employee_id)"员工工号",
CONCAT(emp2.first_name)"管理者的姓名",CONCAT(emp2.employee_id)"管理者工号"
FROM employees emp1
JOIN employees emp2
ON emp1.manager_id = emp2.employee_id

/*4-26课上练习题*/
SELECT first_name, job_id, salary
FROM employees
where 
job_id = (SELECT job_id FROM employees WHERE employee_id = 141)
AND
salary > (SELECT salary FROM employees WHERE employee_id = 143)

/*4-26课上练习题*/
SELECT first_name,job_id,salary
FROM employees
WHERE salary = (SELECT MIN(salary)FROM employees)

/*4-26课上练习题*/
SELECT first_name FROM employees
WHERE department_id
in
(SELECT department_id FROM departments 
WHERE location_id in(1700,1400));

/*4-26课上练习题*/

SELECT employee_id,first_name,job_id,salary
FROM employees
WHERE salary < ANY
(SELECT salary FROM employees WHERE job_id = 'IT_PROG')
AND job_id != 'IT_PROG';



