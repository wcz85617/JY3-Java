package com.alibaba.test;

import java.util.Scanner;

import com.alibaba.dao.StudentDao;
import com.alibaba.dao.StudentDaoImpl;

public class StudentClinet {
	static String user = "admin";
	static String pwd = "123456";
	Scanner scanner = new Scanner(System.in);
	Test test = new Test();
	static StudentClinet studentClinet = null;
	
	public static void main(String[] args) {
	studentClinet = new StudentClinet();
	studentClinet.welcome();	
	studentClinet.stuManagerIndex();
	studentClinet.stu1();

	}
	public void welcome() {
		System.out.println("*****************欢迎来到学生管理系统**************************");
		System.out.println("1.登录                     2.退出");
		System.out.println("*******************************************");
		System.out.println("请选择：");
		int nextInt = scanner.nextInt();
		switch(nextInt)
		{
		case 1 :
		System.out.println("欢迎登录");
		System.out.println("请输入用户名：");
		String inputName= scanner.next();
		System.out.println("请输入用密码：");
		String inputpwd= scanner.next();
		Admin admin = new Admin(inputName,inputpwd);
		boolean login = login(admin);
		if(login = true) {
			System.out.println("欢迎您"+ user);
		}else
		{
			System.out.println("登录失败");
			welcome();	
		}
		break;
		case 2 :
		exitSystem();
		System.out.print("退出中。。。。。。。");
		break;
		default:
		System.out.print("输入有误，请重新选择");
		welcome();
		break;	
		} 
	}
		//退出系统的方法
		public void exitSystem() {
			System.exit(0);	
		}
		
		//判断登陆用户名和密码的方法
		public boolean login(Admin admin) {
			if(user.equals(admin.user)||pwd.equals(admin.pwd)) {
				return true;	
			}else {
				return false;
			}	
		}
		public void stuManagerIndex() {
			System.out.println("**********请选择要操作的信息对应数字****************");
			System.out.println("*1.学生信息管理      2.课程信息管理       3.退出  ");
			System.out.println("**************************************");
			System.out.println("请选择");
			int nextInt = scanner.nextInt();
			switch(nextInt) {
			case 1 :this.stu1();
			break;
			case 2 :this.stu2();
			break;
			case 3 :
			break;
			default:
			System.out.print("输入有误，请重新选择");	
			stuManagerIndex();
			}
			
			
		}
		public void stu1() {
			System.out.println("**********请选择要操作的信息对应数字****************");
			System.out.println("*1.增加学生      2.修改学生      3.删除学生    4.查询学生  5.打印学生  6.课程管理  7.课程查询  8.退出系统  ");
			System.out.println("**************************************");
			System.out.println("请选择");
			int nextInt = scanner.nextInt();
			switch(nextInt) {
			case 1 :test.addStu();
			break;
			case 2 :test.updateStu();
			break;
			case 3 :test.deleteStu();
			break;
			case 4 :test.allStu();
			break;
			case 5 :test.getstu();
			break;
			case 6 :this.stu2();
			break;
			case 7 :test.getCou();	
			break;
			case 8 :System.exit(0);	
			break;
			default:
			System.out.print("输入有误，请重新选择");	
			}
			studentClinet.stu1();
			
			}
		
		public void stu2() {
			System.out.println("**********请选择要操作的信息对应数字****************");
			System.out.println("*1.增加课程      2.修改课程   3.参课人员   4.删除课程   5.添加学生 6.删除学生   ");
			System.out.println("**************************************");
			System.out.println("请选择");
			int nextInt = scanner.nextInt();
			switch(nextInt) {
			case 1 :test.addCou();
			break;
			case 2 :test.upCou();
			break;
			case 3 :test.getstuName();
			break;
			case 4 :test.deleteCou();
			break;
			case 5 :test.adds();
			break;
			case 6 :test.deletes();
			break;
			
			
			default:
			System.out.print("输入有误，请重新选择");
			}
			studentClinet.stu1();
		}	
	}


