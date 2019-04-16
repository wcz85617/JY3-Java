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
		System.out.println("������ѧ��ID:");
		int id = scanner.nextInt();
		System.out.println("������ѧ������:");
		String name = scanner.next();
		
		System.out.println("������ѧ���Ա�:");
		char sex = scanner.next().charAt(0);
		
		System.out.println("������ѧ�����䣨ֻ������1~100���ڵ����֣�:");
		short age  = scanner.nextShort();
		
		
		System.out.println("������ѧ���꼶:");
		String grade = scanner.next();
		System.out.println("������ѧ����ַ:");
		String address = scanner.next();
		
		
		System.out.println("������ѧ����ϵ��ʽ:");
		int tel = scanner.nextInt();
		System.out.println("������ѧ����������:");
		String email = scanner.next();
		
		StudentManager studentManager = new StudentManager();
		Student stu = new Student(id,name,sex,age,grade,address,tel,email);
		studentManager.addStudent(stu);
		System.out.println("���ݱ���ɹ�,�����ϼ�Ŀ¼������");
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
		System.out.println("��������Ҫ�޸ĵ�ID");
		int id=scanner.nextInt();
		
		for(int i=0;i<stus.length;i++)
		{
			if(stus[i].id == id)
			{
				System.out.println("����:");
				stus[i].stuName=scanner.next();
				System.out.println("�Ա�:");
				stus[i].sex=scanner.next().charAt(0);
				System.out.println("����:");
				stus[i].age=scanner.nextShort();
				System.out.println("�꼶:");
				stus[i].grade=scanner.next();
				System.out.println("��ַ:");
				stus[i].sutAddress=scanner.next();
				System.out.println("��ϵ��ʽ:");
				stus[i].stuTel=scanner.nextInt();
				System.out.println("����:");
				stus[i].stuEmail=scanner.next();
				System.out.println("�޸ĳɹ� ϵͳ�Զ������ϲ�Ŀ¼");
				sc.stuManagerIndex();
			}else
			{
				System.out.println("ѧ��ID��������������ȷ�Ϻ���������");
			}
		}
	}
	public void  upSome(Scanner scanner)
	{
		System.out.println("��������Ҫ�޸ĵ�ID");
		int id=scanner.nextInt();
		
		for(int i=0;i<stus.length;i++)
		{
			if(stus[i].id == id)
			{
				System.out.println("��������Ҫ�޸ĵ�����");
				String choose = scanner.next();
				switch(choose)
				{
				case "stuName":System.out.println("�������޸ĺ������");
			    stus[i].stuName=scanner.next();
				break;
				
				case "sex":System.out.println("�������޸ĺ������");
			    stus[i].sex=scanner.next().charAt(0);
			    break;
			    
				case "age" :System.out.println("�������޸ĺ������");
				stus[i].grade=scanner.next();
				break;
				
				case "grade":System.out.println("�������޸ĺ������");
				stus[i].grade=scanner.next();
				break;
				
				case "stuTel":System.out.println("�������޸ĺ������");
				stus[i].stuTel=scanner.nextInt();
				break;
				
				case "stuEmail":System.out.println("�������޸ĺ������");
				stus[i].stuEmail=scanner.next(); 
				default:
				break;}
				System.out.println("�޸ĳɹ�");
				System.out.println("ϵͳ�Զ������ϲ�Ŀ¼");
				sc.stuManagerIndex();
			    }else {System.out.println("ѧ��ID��������������ȷ�Ϻ���������");}		   
	            }
	  }  
	
	public void  stuCheck1(Scanner scanner)
	{
		System.out.println("��������Ҫ��ѯ��ID");
		int id=scanner.nextInt();
		for(int i=0;i<stus.length;i++)
		{
			if(stus[i].id==id)
			{
			  System.out.println("****************����ѧ����Ϣ*************************");
		      System.out.println("|ѧ�� |�� ��|�Ա�|����|�꼶| ��ַ          |�绰               |email      |");
		      System.out.println("*************************************************");
		      System.out.println(Arrays.toString(stus));
		      System.out.println("*************************************************");
		      System.out.println("ϵͳ�Զ������ϲ�Ŀ¼");
		      sc.stuManagerIndex();
			}
		}	
	}
	public void  idCheck(Scanner scanner)
	{
		System.out.println("��������Ҫ��ѯ��ID");
		int id=scanner.nextInt();
		for(int i=0;i<stus.length;i++)
		{
			if(stus[i].id==id)
			{
			  System.out.println(stus[i].stuName);
			}else 
			{System.out.println("ѧ��ID��������������ȷ�Ϻ���������");
			}		   
        }
		
		
	}

	
}
