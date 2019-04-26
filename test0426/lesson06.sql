/*查询最大 最小 平均 总和*/
SELECT MAX(salary),MIN(salary),AVG(salary),SUM(salary)
FROM employees


/*查询员工表中的最大入职时间和最小入职时间的相差天数 （DIFFRENCE）*/
SELECT  MAX(hiredate) - MIN(hiredate)DIFFRENCE
FROM employees

/*查询部门编号为 90 的员工个数*/
SELECT COUNT(first_name)
FROM employees
WHERE department_id > 90;



