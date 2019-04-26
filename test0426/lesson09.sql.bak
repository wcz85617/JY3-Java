/*查询和 Zlotkey 相同部门的员工姓名和工资*/
SELECT first_name,last_name,salary
FROM employees
WHERE department_id = 
(SELECT department_id FROM employees WHERE last_name = 'Zlotkey')

/*查询工资比公司平均工资高的员工的员工号，姓名和工资。*/
SELECT employee_id,first_name,last_name,salary
FROM employees WHERE salary >(SELECT AVG(salary)FROM employees )

/*查询各部门中工资比本部门平均工资高的员工的员工号, 姓名和工资。*/
SELECT employee_id,first_name,last_name,salary
FROM employees
GROUP BY department_id
HAVING salary >(SELECT AVG(salary) FROM employees GROUP BY department_id)


