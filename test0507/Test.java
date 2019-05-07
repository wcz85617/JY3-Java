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
    	System.out.println("���������ӵ�ѧ���ţ�");
    	String stuId = scanner.next();
		
		System.out.println("����������ѧ��������");
		String stuName = scanner.next();
		
		System.out.println("���������䣺");
		int stuAge = scanner.nextInt();
		
		System.out.println("�������Ա�");
		String stuSex = scanner.next();
		
    	Student student = new Student(stuId,stuName,stuAge,stuSex);
    	
    	studentDaoImpl.addOneStudent(student);
    	System.out.println("��ӳɹ�");
    	

    }
    
    
    
    public void addCou()
    {
    	
    	System.out.println("���������ӵĿγ̺ţ�");
    	int couId = scanner.nextInt();
		System.out.println("���������ӿγ̣�");
		String couName = scanner.next();
		Course course = new Course(couId,couName);
		cd.addOneCourse(course);
		System.out.println("��ӳɹ�");

    	
    }
    
    public void updateStu()
    {
    	System.out.println("������Ҫ�޸ĵ�ѧ���ţ�");
    	String stuId = scanner.next();
		
		System.out.println("�������޸ĵ�ѧ��������");
		String stuName = scanner.next();
		
		System.out.println("�������޸����䣺");
		int stuAge = scanner.nextInt();
		
		System.out.println("�������޸��Ա�");
		String stuSex = scanner.next();
		
		Student student = new Student(stuId,stuName,stuAge,stuSex);
    	
		studentDaoImpl.updateOneStudent(student);
    	
    	System.out.println("��ӳɹ�");

    }
    
    public void upCou()
    {
    	System.out.println("������Ҫ�޸ĵĿγ̺ţ�");
    	int couId = scanner.nextInt();
		
		System.out.println("�������޸ĵĿγ����ƣ�");
		String couName = scanner.next();
    	
    	Course course = new Course(couId,couName);
        
    	cd.updateOneCourse(course);
    	
    	System.out.println("��ӳɹ�");
    }
    

 public void allStu() {
    	
	 List<Student> queryAllAccount = studentDaoImpl.getAllStudent();
	 System.out.print(queryAllAccount);
		System.out.println();
	
	
    }
 public void deleteStu() {
 	
	 System.out.println("������ɾ����ѧ���ţ�");
 	 String stuId = scanner.next();
 	 studentDaoImpl.deOneStudent(stuId);
 	 System.out.println("ɾ���ɹ�");
    }
 
 
 public void deleteCou() {
	 	
	 System.out.println("������ɾ����ѧ���ţ�");
 	 int couId = scanner.nextInt();
 	 cd.deOneCourse(couId);
 	 System.out.println("ɾ���ɹ�");
    }
 
 
 
 public void getstu() {
	 	
	 System.out.println("�������ѯ��ѧ���ţ�");
 	 String stuId = scanner.next();
 	 System.out.println(studentDaoImpl.getStudentInfoByStudId(stuId));
 	 
 	 
    }
 
 public  void getCou() {
	 
	 System.out.println("�������ѯ�γ̵�ѧ���ţ�");
 	 String stuId = scanner.next();
 	List<String> getcouName =studentDaoImpl.getCouByStuId(stuId);
 	System.out.println(getcouName);
	 
	 
 }
 public  void getstuName() {
	 
	 System.out.println("�������ѯѧ���Ŀγ̺ţ�");
 	 int couId = scanner.nextInt();
 	List<String> getstuName =cd.getStuIdByCou(couId);
 	System.out.println(getstuName);
 
 }
public  void adds() {
	 
	 System.out.println("��ѡ��γ̺ţ�");
 	 int couId = scanner.nextInt();
 	 System.out.println("��������ӵ�ѧ���ţ�");
	 String stuId = scanner.next();
	 cd.addOne(stuId, couId);
	 System.out.println("��ӳɹ�");

 }
public  void deletes() {
	 
	 System.out.println("��ѡ��γ̺ţ�");
	 int couId = scanner.nextInt();
	 System.out.println("������ɾ����ѧ���ţ�");
	 String stuId = scanner.next();
	 cd.deOne(stuId, couId);
	 System.out.println("ɾ���ɹ�");

}
    
    
    
 
}
