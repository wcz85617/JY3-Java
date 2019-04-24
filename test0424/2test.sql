/*测试第11-1题*/
SELECT first_name,salary
FROM employees
WHERE salary > 12000;

/*测试第11-2题*/
SELECT first_name,department_id,salary*12
FROM employees
WHERE employee_id = 176;

/*测试第11-3题*/
SELECT first_name,salary
FROM employees
WHERE salary NOT between 5000 AND 12000;

/*测试第11-4题*/
SELECT first_name,department_id
FROM employees
WHERE department_id = 20 OR department_id = 50

/*测试第11-5题*/
SELECT first_name,last_name,job_id
FROM employees
WHERE manager_id IS NULL

/*测试第11-6题*/
SELECT first_name,last_name,salary,commission_pct
FROM employees
WHERE commission_pct is NOT NULL

/*测试第11-7题*/
SELECT first_name
FROM employees
WHERE first_name LIKE '__a%';

/*测试第11-8题*/
SELECT first_name
FROM employees
WHERE first_name LIKE '%a%'
AND first_name LIKE '%e%';

/*测试第11-9题*/
SELECT first_name,department_id,salary
FROM employees
WHERE first_name LIKE '%e'

/*测试第11-10题*/
SELECT first_name,job_id
FROM employees
WHERE department_id BETWEEN 80 AND 100;

/*测试第11-11题*/
SELECT first_name,manager_id
FROM employees
WHERE manager_id in (100,101,110)
