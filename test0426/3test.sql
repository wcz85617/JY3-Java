/*测试6-1 可以执行成功 但是sal未使用双引号*/
select last_name , job_id , salary as sal
from employees;

/*测试6-2 可以执行成功*/
select * 
from employees;

/*测试6-3 找出错误 未使用单引号 */
select employee_id , last_name,
salary * 12  'ANNUAL SALARY'
from employees;

/*测试6-4 但是同时查询全部数据不会 */
DESC employees；
SELECT * FROM employees;

/*测试6-5  */
SELECT job_id
from employees
GROUP BY job_id;

/*测试6-6  */
SELECT CONCAT(employee_id,",",first_name,",",last_name,",",email,",
",phone_number,",",job_id,",",salary,",",IFNULL(commission_pct,0),",",
IFNULL(manager_id,0),",",department_id,",",hiredate) 
out_put FROM employees;



