/*1查询工资最低的员工信息: last_name, salary*/
SELECT last_name, salary FROM employees 
WHERE salary = (SELECT MIN(salary) FROM employees);


/*2查询平均工资最低的部门信息*/
SELECT MIN(a.avg)
FROM (SELECT AVG(salary)avg,department_id
FROM employees GROUP BY department_id)a

SELECT * 
FROM employees 
HAVING department_id=(SELECT department_id 
FROM employees
GROUP BY department_id 
ORDER BY AVG(salary) 
LIMIT 0,1)

SELECT *
FROM (SELECT department_id , AVG(salary)sal_avg 
FROM SCOTT.EMP 
GROUP BY department_id )
WHERE sal_avg =
(SELECT min(sal_avg)
FROM (SELECT AVG(salary)sal_avg FROM SCOTT.EMP GROUP BY department_id ));

/* 不太会啊 3查询平均工资最低的部门信息和该部门的平均工资*/
SELECT MIN(a.avg)
FROM (SELECT AVG(salary)avg,department_id
FROM employees GROUP BY department_id)a

/*4 题意 不太明白 查询平均工资最高的 job 信息*/
SELECT jobs.job_id,job_title,min_salary,max_salary
FROM employees emp,jobs
WHERE emp.job_id = jobs.job_id 
AND department_id=(SELECT department_id 
FROM employees
GROUP BY department_id 
ORDER BY AVG(salary)DESC
LIMIT 0,1)

/*5 查询平均工资高于公司平均工资的部门有哪些?*/

SELECT department_id FROM employees
GROUP BY department_id
HAVING AVG(salary) >(SELECT AVG(salary) FROM employees)

/*6 查询出公司中所有 manager 的详细信息.*/
SELECT *
FROM employees
WHERE employee_id in(SELECT manager_id FROM employees)

/*7各个部门中 最高工资中最低的那个部门的 最低工资是多少.*/

SELECT MIN(salary)
FROM employees
WHERE department_id = (SELECT department_id FROM employees 
GROUP BY department_id
ORDER BY MAX(salary)
LIMIT 0,1)

/*8查询平均工资最高的部门的 manager 的详细信息: last_name, department_id, email,
salary*/
SELECT last_name, department_id, email,salary
FROM employees
WHERE employee_id =(SELECT manager_id FROM departments
WHERE department_id = (SELECT department_id FROM employees 
GROUP BY department_id
ORDER BY MAX(salary)DESC
LIMIT 0,1))


