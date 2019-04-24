/*测试第3-1题*/
SELECT first_name,department_id,salary*12
FROM employees
ORDER BY salary*12 DESC;
/*测试第3-2题*/
select FIRST_name,salary
FROM employees
WHERE salary NOT BETWEEN 8000 AND 17000
ORDER BY salary DESC;

/*测试第3-3题*/
SELECT first_name,email,department_id
FROM employees
WHERE email LIKE '%e%'
ORDER BY email DESC;
ORDER BY department_id


