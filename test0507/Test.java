package com.alibaba.test;

import java.sql.Connection;
import java.util.List;
import java.util.Scanner;

import com.alibaba.dao.StudentDao;
import com.alibaba.dao.StudentDaoImpl;
import com.alibaba.dao.courseDao;
import com.alibaba.dao.courseDaoImpl;
import com.alibaba.entity.Course;
import com.alibaba.entity.Student;
import com.alibaba.util.DBUtils;

public class Test  {
	
	Connection conn = DBUtils.getConnection();
	   
	StudentDao studentDaoImpl = new StudentDaoImpl(conn);
	courseDao cd = new courseDaoImpl(conn);
	Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) 
	{
	
	}
	
    public void addStu()
    {
    	System.out.println("请输入增加的学生号：");
    	String stuId = scanner.next();
		
		System.out.println("请输入增加学生姓名：");
		String stuName = scanner.next();
		
		System.out.println("请输入年龄：");
		int stuAge = scanner.nextInt();
		
		System.out.println("请输入性别：");
		String stuSex = scanner.next();
		
    	Student student = new Student(stuId,stuName,stuAge,stuSex);
    	
    	studentDaoImpl.addOneStudent(student);
    	System.out.println("添加成功");
    	

    }
    
    
    
    public void addCou()
    {
    	
    	System.out.println("请输入增加的课程号：");
    	int couId = scanner.nextInt();
		System.out.println("请输入增加课程：");
		String couName = scanner.next();
		Course course = new Course(couId,couName);
		cd.addOneCourse(course);
		System.out.println("添加成功");

    	
    }
    
    public void updateStu()
    {
    	System.out.println("请输入要修改的学生号：");
    	String stuId = scanner.next();
		
		System.out.println("请输入修改的学生姓名：");
		String stuName = scanner.next();
		
		System.out.println("请输入修改年龄：");
		int stuAge = scanner.nextInt();
		
		System.out.println("请输入修改性别：");
		String stuSex = scanner.next();
		
		Student student = new Student(stuId,stuName,stuAge,stuSex);
    	
		studentDaoImpl.updateOneStudent(student);
    	
    	System.out.println("添加成功");

    }
    
    public void upCou()
    {
    	System.out.println("请输入要修改的课程号：");
    	int couId = scanner.nextInt();
		
		System.out.println("请输入修改的课程名称：");
		String couName = scanner.next();
    	
    	Course course = new Course(couId,couName);
        
    	cd.updateOneCourse(course);
    	
    	System.out.println("添加成功");
    }
    

 public void allStu() {
    	
	 List<Student> queryAllAccount = studentDaoImpl.getAllStudent();
	 System.out.print(queryAllAccount);
		System.out.println();
	
	
    }
 public void deleteStu() {
 	
	 System.out.println("请输入删除的学生号：");
 	 String stuId = scanner.next();
 	 studentDaoImpl.deOneStudent(stuId);
 	 System.out.println("删除成功");
    }
 
 
 public void deleteCou() {
	 	
	 System.out.println("请输入删除的学生号：");
 	 int couId = scanner.nextInt();
 	 cd.deOneCourse(couId);
 	 System.out.println("删除成功");
    }
 
 
 
 public void getstu() {
	 	
	 System.out.println("请输入查询的学生号：");
 	 String stuId = scanner.next();
 	 System.out.println(studentDaoImpl.getStudentInfoByStudId(stuId));
 	 
 	 
    }
 
 public  void getCou() {
	 
	 System.out.println("请输入查询课程的学生号：");
 	 String stuId = scanner.next();
 	List<String> getcouName =studentDaoImpl.getCouByStuId(stuId);
 	System.out.println(getcouName);
	 
	 
 }
 public  void getstuName() {
	 
	 System.out.println("请输入查询学生的课程号：");
 	 int couId = scanner.nextInt();
 	List<String> getstuName =cd.getStuIdByCou(couId);
 	System.out.println(getstuName);
 
 }
public  void adds() {
	 
	 System.out.println("请选择课程号：");
 	 int couId = scanner.nextInt();
 	 System.out.println("请输入添加的学生号：");
	 String stuId = scanner.next();
	 cd.addOne(stuId, couId);
	 System.out.println("添加成功");

 }
public  void deletes() {
	 
	 System.out.println("请选择课程号：");
	 int couId = scanner.nextInt();
	 System.out.println("请输入删除的学生号：");
	 String stuId = scanner.next();
	 cd.deOne(stuId, couId);
	 System.out.println("删除成功");

}
    
    
    
 
}
