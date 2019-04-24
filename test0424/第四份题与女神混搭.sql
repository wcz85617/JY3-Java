/*测试哪个城市没有部门*/
SELECT city 
FROM locations
WHERE state_province IS NULL 

/*查询部门名为 SAL 或 IT 的员工信息*/
SELECT first_name,email,salary
FROM employees
WHERE department_name IS Sal