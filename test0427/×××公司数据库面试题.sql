/*×××公司数据库面试题*/
/*增加和更新一条语句*/
INSERT INTO department
VALUES (‘12’，‘研发部’，‘张三’);

UPDATE department(dept_id,dept_name,dept_leader,)
SET dept_leader = ‘张三新’
WHERE dept_id=‘12’;

/*给表Department加字段notes长度为10的字符串，默认值为‘0’*/
ALTER TABLE Department ADD notes VARCHAR(10) DEFAULT 0;

/*查找工资大于2000的员工记录，并按员工号id升序排列*/
SELECT name FROM  Personnel
WHERE salary > 2000 
ORDER BY id 

/*查找工资大于2000的员工所在部门、部门编号、部门经理、员工名称*/
SELECT dept_name,dept_id,dept_leader,name
FROM Personnel per ,Department dep
WHERE per.dept_id = dep.dept_id
AND salary > 2000 ;

/*查找张三和李四所在部门所有人员的姓名*/
SELECT name FROM Personnel
WHERE dept_id in(SELECT dept_id FROM Personnel WHERE name='张三' AND name='李四' )

/* 不太会，查看每个部门的部门经理和部门人数，按部门人数排序*/
SELECT dept_leader,COUNT(*)
FROM Personnel per ,Department dep
WHERE per.dept_id = dep.dept_id
GROUP BY dept_name
ORDER BY COUNT(id)

/*删除表Department中的所有记录*/
DELETE Department;

/*删除表Department中的所有记录*/
DROP TABLE Department;

/* 不会啊 查询课程号“001”课程比课程号“002”课程成绩高的所有学生的学号、姓名*/
SELECT Student.id,SNAME
FROM (SELECT SNO ,SCORE FROM SC WHERE CNO = 001)a,
(SELECT SNO ,SCORE FROM SC WHERE CNO = 002)b,
WHERE a.SCORE > b.SCORE
AND a.SNO = b.SNO

/*查询课程教师为‘张老师’的所有课程名称。*/
SELECT CNAME
FROM Teacher,Course
WHERE Course.TNO = Teacher.TNO 
AND TNAME = '张老师';

/*查询所有选修‘语文’学生的学号、姓名。*/
SELECT Student.SNO,Student.SNAME 
FROM Student,Course,SC
WHERE Student.SNO = SC.SNO 
AND Course.CNO = SC.CNO
AND Course.CNAME  = '语文';

/*查询平均成绩大于60分的同学的学号和平均成绩。*/
SELECT SNO,AVG(SCORE)
FROM SC
WHERE AVG(SCORE)> 60
GROUP BY SNO;

/*查询所有课程成绩小于60分的同学的学号、姓名。*/
SELECT SNO,SNAME
FROM Student
WHERE SNO NOT in
(SELECT sno FROM Student,SC WHERE Student.sno = SCS.sno CORE > 60)





