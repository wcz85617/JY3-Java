/*查询和 Zlotkey 相同部门的员工姓名和工资*/
SELECT first_name,last_name,salary
FROM employees
WHERE department_id = 
(SELECT department_id FROM employees WHERE last_name = 'Zlotkey')

/*查询工资比公司平均工资高的员工的员工号，姓名和工资。*/
SELECT employee_id,first_name,last_name,salary
FROM employees WHERE salary >(SELECT AVG(salary)FROM employees )

/*查询各部门中工资比本部门平均工资高的员工的员工号, 姓名和工资。*/
SELECT employee_id,first_name,last_name,salary,department_id
FROM employees emp1
HAVING salary > (SELECT AVG(salary) FROM employees emp2 WHERE emp1.department_id = emp2.department_id GROUP BY department_id)

/* 感觉 有点小问题 单个的也选出来了，查询和姓名中包含字母 u 的员工在相同部门的员工的员工号和姓名。*/
SELECT employee_id,first_name,department_id
FROM employees emp1
WHERE emp1.first_name in 
(SELECT first_name
FROM employees emp2
WHERE emp1.department_id = emp2.department_id 
AND emp2.first_name LIKE '%u%')

/*查询在部门的 location_id 为 1700 的部门工作的员工的员工号*/

SELECT employee_id,first_name,emp.department_id FROM employees emp ,departments dep  
WHERE emp.department_id = dep.department_id
AND location_id = 1700

SELECT employee_id FROM employees WHERE department_id = ANY
(SELECT department_id FROM departments WHERE location_id = 1700)

/*查询管理者是 King 的员工姓名和工资*/
SELECT first_name,last_name,salary
FROM employees
WHERE manager_id = ANY
(SELECT employee_id FROM employees WHERE last_name = 'K_ing')

/*查询工资最高的员工的姓名，要求 first_name 和 last_name 显示为一列，列名为 姓.名*/

SELECT CONCAT(first_name,'    ',last_name)'姓.     名'
FROM employees
WHERE salary = (SELECT MAX(salary)FROM employees)















