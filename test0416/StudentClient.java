package com.stusystem.tt;

import java.util.Arrays;
import java.util.Scanner;

public class StudentClient {
	static String user = "admin";
	static String pwd = "admin";
	Scanner scanner = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		StudentClient studentclient = new StudentClient();
		studentclient.welcome();
		studentclient.stuManagerIndex();
		studentclient.stuChange();
		studentclient.stuCheck();
		
		
	}
		StudentManager sm =  new StudentManager(this);
		
	
	public void welcome()
	{
		System.out.println("*****************欢迎来到学生管理系统**************************");
		System.out.println("1.登录                     2.退出");
		System.out.println("*******************************************");
		System.out.println("请选择：");
		int nextInt= scanner.nextInt();
		switch (nextInt) {
		case 1 :System.out.println("欢迎登录");
		System.out.println("请输入用户名：");
		String inputName= scanner.next();
		System.out.println("请输入用密码：");
		String inputpwd= scanner.next();
		Admin admin=new Admin(inputName,inputpwd);
		boolean login = login(admin);
		if(login == true)
		{
			System.out.println("欢迎您"+ user);
		}else
		{
			System.out.println("登录失败");
			welcome();
		}
		break;
		case 2 :exitSystem();
		System.out.print("退出中。。。。。。。");
		break;
	default:
		System.out.print("输入有误，请重新选择");
		welcome();
		break;
		}
		
		
	}

	public boolean login(Admin admin)
	{
		
		if(user.equals(admin.user)|| pwd.equals(admin.pwd))
		{
			return true;
		}else
		{
			return false;
		}	
	}

	public void exitSystem()
	{
		System.exit(0);
	}
	
	public void stuManagerIndex()
	{
		
		System.out.println("**********请选择要操作的信息对应数字****************");
		System.out.println("*1.查看学生信息      2.添加学生信息       3.删除学生信息      4.修改学生信息     5.退出  ");
		System.out.println("**************************************");
		System.out.println("请选择");
		int nextInt = scanner.nextInt();
		switch (nextInt)
		{
		case 1:
			this.stuCheck();
			break;
		case 2:
			sm.addStuPage(scanner);
			break;
		case 3:
			sm.deStuId(nextInt);
			break;
		case 4:
			this.stuChange();
			break;
		case 5: System.exit(0);
			break;
		default:
			System.exit(0);
			break;
		}	
	}
	public void stuChange()
	{
		System.out.println("**********请选择要操作的信息对应数字****************");
		System.out.println("*1根据ID修改学生全部信息      2.根据ID修改学生部分信息        3.返回上级目录      4.系统退出");
		System.out.println("**************************************");
		System.out.println("请选择菜单");
		int nextInt = scanner.nextInt();
		switch (nextInt)
		{
		   case 1:sm.update(scanner);
		   break;
		   case 2:sm.upSome(scanner);
		   break;
		   case 3:this.stuManagerIndex();
		   break;
		   case 4:System.exit(0);
		   break;
		   default:
		   break;
		   
		   
		
		
		
		}
	}
	
	public void stuCheck()
	{
		System.out.println("**********请选择要操作的信息对应数字****************");
		System.out.println("*1.查看所有学生信息      2.根据ID查看学生信息       3.根据ID查看学生姓名     4.返回上一层");
		System.out.println("**************************************");
		System.out.println("请选择");
		int nextInt = scanner.nextInt();
		switch (nextInt)
		{
		 case 1 :System.out.println(Arrays.toString(StudentManager.stus));
		 break;
		 
		 case 2 :sm.stuCheck1(scanner);
	     break;
		 case 3 :sm.idCheck(scanner);
	     break;
	     
		 case 4 :System.exit(0);
	     break;
		 default:
	     break;
		}
		
		
		
	}
	
	
	
	
}
