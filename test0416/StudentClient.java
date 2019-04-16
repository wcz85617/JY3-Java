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
		System.out.println("*****************��ӭ����ѧ������ϵͳ**************************");
		System.out.println("1.��¼                     2.�˳�");
		System.out.println("*******************************************");
		System.out.println("��ѡ��");
		int nextInt= scanner.nextInt();
		switch (nextInt) {
		case 1 :System.out.println("��ӭ��¼");
		System.out.println("�������û�����");
		String inputName= scanner.next();
		System.out.println("�����������룺");
		String inputpwd= scanner.next();
		Admin admin=new Admin(inputName,inputpwd);
		boolean login = login(admin);
		if(login == true)
		{
			System.out.println("��ӭ��"+ user);
		}else
		{
			System.out.println("��¼ʧ��");
			welcome();
		}
		break;
		case 2 :exitSystem();
		System.out.print("�˳��С�������������");
		break;
	default:
		System.out.print("��������������ѡ��");
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
		
		System.out.println("**********��ѡ��Ҫ��������Ϣ��Ӧ����****************");
		System.out.println("*1.�鿴ѧ����Ϣ      2.���ѧ����Ϣ       3.ɾ��ѧ����Ϣ      4.�޸�ѧ����Ϣ     5.�˳�  ");
		System.out.println("**************************************");
		System.out.println("��ѡ��");
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
		System.out.println("**********��ѡ��Ҫ��������Ϣ��Ӧ����****************");
		System.out.println("*1����ID�޸�ѧ��ȫ����Ϣ      2.����ID�޸�ѧ��������Ϣ        3.�����ϼ�Ŀ¼      4.ϵͳ�˳�");
		System.out.println("**************************************");
		System.out.println("��ѡ��˵�");
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
		System.out.println("**********��ѡ��Ҫ��������Ϣ��Ӧ����****************");
		System.out.println("*1.�鿴����ѧ����Ϣ      2.����ID�鿴ѧ����Ϣ       3.����ID�鿴ѧ������     4.������һ��");
		System.out.println("**************************************");
		System.out.println("��ѡ��");
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
