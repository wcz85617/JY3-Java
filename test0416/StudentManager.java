package com.stusystem.tt;

import java.util.Arrays;
import java.util.Scanner;

public class StudentManager {
	StudentClient sc;
	private String String;
	public StudentManager()
	{
		
	}
	
	public StudentManager(StudentClient sc)
	{
		this.sc = sc;
	}
	
	static Student[] stus = new Student[0];
	static Student[] newStus;
	public void addStudent(Student student)
	{
		stus = Arrays.copyOf(stus,stus.length+1);
		stus[stus.length-1] = student;
	}
	
	public void addStuPage(Scanner scanner)
	{
		System.out.println("请输入学生ID:");
		int id = scanner.nextInt();
		System.out.println("请输入学生姓名:");
		String name = scanner.next();
		
		System.out.println("请输入学生性别:");
		char sex = scanner.next().charAt(0);
		
		System.out.println("请输入学生年龄（只能输入1~100以内的数字）:");
		short age  = scanner.nextShort();
		
		
		System.out.println("请输入学生年级:");
		String grade = scanner.next();
		System.out.println("请输入学生地址:");
		String address = scanner.next();
		
		
		System.out.println("请输入学生联系方式:");
		int tel = scanner.nextInt();
		System.out.println("请输入学生电子邮箱:");
		String email = scanner.next();
		
		StudentManager studentManager = new StudentManager();
		Student stu = new Student(id,name,sex,age,grade,address,tel,email);
		studentManager.addStudent(stu);
		System.out.println("数据保存成功,返回上级目录。。。");
		sc.stuManagerIndex();
	}
	public Student[] deStuId(int stuId) 
	{
		newStus = new Student[stus.length-1];
		int j = 0;
		for(int i = 0 ; i<stus.length;i++)
		{
			if(stuId != stus[i].id)
			{
			   
			   newStus[j] = stus[i];
			   j++;
				
			}
		}
		return newStus;
	}
	public void  update(Scanner scanner)
	{
		System.out.println("请输入您要修改的ID");
		int id=scanner.nextInt();
		
		for(int i=0;i<stus.length;i++)
		{
			if(stus[i].id == id)
			{
				System.out.println("姓名:");
				stus[i].stuName=scanner.next();
				System.out.println("性别:");
				stus[i].sex=scanner.next().charAt(0);
				System.out.println("年龄:");
				stus[i].age=scanner.nextShort();
				System.out.println("年级:");
				stus[i].grade=scanner.next();
				System.out.println("地址:");
				stus[i].sutAddress=scanner.next();
				System.out.println("联系方式:");
				stus[i].stuTel=scanner.nextInt();
				System.out.println("邮箱:");
				stus[i].stuEmail=scanner.next();
				System.out.println("修改成功 系统自动返回上层目录");
				sc.stuManagerIndex();
			}else
			{
				System.out.println("学生ID号码输入有误，请确认后重新输入");
			}
		}
	}
	public void  upSome(Scanner scanner)
	{
		System.out.println("请输入您要修改的ID");
		int id=scanner.nextInt();
		
		for(int i=0;i<stus.length;i++)
		{
			if(stus[i].id == id)
			{
				System.out.println("请输入您要修改的属性");
				String choose = scanner.next();
				switch(choose)
				{
				case "stuName":System.out.println("请输入修改后的数据");
			    stus[i].stuName=scanner.next();
				break;
				
				case "sex":System.out.println("请输入修改后的数据");
			    stus[i].sex=scanner.next().charAt(0);
			    break;
			    
				case "age" :System.out.println("请输入修改后的数据");
				stus[i].grade=scanner.next();
				break;
				
				case "grade":System.out.println("请输入修改后的数据");
				stus[i].grade=scanner.next();
				break;
				
				case "stuTel":System.out.println("请输入修改后的数据");
				stus[i].stuTel=scanner.nextInt();
				break;
				
				case "stuEmail":System.out.println("请输入修改后的数据");
				stus[i].stuEmail=scanner.next(); 
				default:
				break;}
				System.out.println("修改成功");
				System.out.println("系统自动返回上层目录");
				sc.stuManagerIndex();
			    }else {System.out.println("学生ID号码输入有误，请确认后重新输入");}		   
	            }
	  }  
	
	public void  stuCheck1(Scanner scanner)
	{
		System.out.println("请输入您要查询的ID");
		int id=scanner.nextInt();
		for(int i=0;i<stus.length;i++)
		{
			if(stus[i].id==id)
			{
			  System.out.println("****************所有学生信息*************************");
		      System.out.println("|学号 |姓 名|性别|年龄|年级| 地址          |电话               |email      |");
		      System.out.println("*************************************************");
		      System.out.println(Arrays.toString(stus));
		      System.out.println("*************************************************");
		      System.out.println("系统自动返回上层目录");
		      sc.stuManagerIndex();
			}
		}	
	}
	public void  idCheck(Scanner scanner)
	{
		System.out.println("请输入您要查询的ID");
		int id=scanner.nextInt();
		for(int i=0;i<stus.length;i++)
		{
			if(stus[i].id==id)
			{
			  System.out.println(stus[i].stuName);
			}else 
			{System.out.println("学生ID号码输入有误，请确认后重新输入");
			}		   
        }
		
		
	}

	
}
