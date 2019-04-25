/*查询最大 最小 平均 总和*/
SELECT MAX(salary),MIN(salary),AVG(salary),SUM(salary),job_id
FROM employees
GROUP BY job_id
ORDER BY job_id;

/*查询员工最高工资和最低工资的差距（DIFFERENCE）*/
SELECT MAX(salary) - MIN(salary)DIFFERENCE
FROM employees;

/*查询各个管理者手下员工的最低工资，其中最低工资不能低于 6000，*/
SELECT MIN(salary),manager_id
FROM employees
WHERE manager_id is NOT NULL
GROUP BY manager_id
HAVING MIN(salary) > 6000 ;

/*查询所有部门的编号，员工数量和工资平均值,并按平均工资降序*/
SELECT department_id, COUNT( first_name),AVG(salary)
FROM employees
GROUP BY department_id
ORDER BY AVG(salary) DESC

/*选择具有各个 job_id 的员工人数*/
SELECT COUNT( first_name),job_id
FROM employees
WHERE job_id IS NOT NULL
GROUP BY job_id;


