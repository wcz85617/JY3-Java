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
		System.out.println("*****************��ӭ����ѧ������ϵͳ**************************");
		System.out.println("1.��¼                     2.�˳�");
		System.out.println("*******************************************");
		System.out.println("��ѡ��");
		int nextInt = scanner.nextInt();
		switch(nextInt)
		{
		case 1 :
		System.out.println("��ӭ��¼");
		System.out.println("�������û�����");
		String inputName= scanner.next();
		System.out.println("�����������룺");
		String inputpwd= scanner.next();
		Admin admin = new Admin(inputName,inputpwd);
		boolean login = login(admin);
		if(login = true) {
			System.out.println("��ӭ��"+ user);
		}else
		{
			System.out.println("��¼ʧ��");
			welcome();	
		}
		break;
		case 2 :
		exitSystem();
		System.out.print("�˳��С�������������");
		break;
		default:
		System.out.print("��������������ѡ��");
		welcome();
		break;	
		} 
	}
		//�˳�ϵͳ�ķ���
		public void exitSystem() {
			System.exit(0);	
		}
		
		//�жϵ�½�û���������ķ���
		public boolean login(Admin admin) {
			if(user.equals(admin.user)||pwd.equals(admin.pwd)) {
				return true;	
			}else {
				return false;
			}	
		}
		public void stuManagerIndex() {
			System.out.println("**********��ѡ��Ҫ��������Ϣ��Ӧ����****************");
			System.out.println("*1.ѧ����Ϣ����      2.�γ���Ϣ����       3.�˳�  ");
			System.out.println("**************************************");
			System.out.println("��ѡ��");
			int nextInt = scanner.nextInt();
			switch(nextInt) {
			case 1 :this.stu1();
			break;
			case 2 :this.stu2();
			break;
			case 3 :
			break;
			default:
			System.out.print("��������������ѡ��");	
			stuManagerIndex();
			}
			
			
		}
		public void stu1() {
			System.out.println("**********��ѡ��Ҫ��������Ϣ��Ӧ����****************");
			System.out.println("*1.����ѧ��      2.�޸�ѧ��      3.ɾ��ѧ��    4.��ѯѧ��  5.��ӡѧ��  6.�γ̹���  7.�γ̲�ѯ  8.�˳�ϵͳ  ");
			System.out.println("**************************************");
			System.out.println("��ѡ��");
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
			System.out.print("��������������ѡ��");	
			}
			studentClinet.stu1();
			
			}
		
		public void stu2() {
			System.out.println("**********��ѡ��Ҫ��������Ϣ��Ӧ����****************");
			System.out.println("*1.���ӿγ�      2.�޸Ŀγ�   3.�ο���Ա   4.ɾ���γ�   5.���ѧ�� 6.ɾ��ѧ��   ");
			System.out.println("**************************************");
			System.out.println("��ѡ��");
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
			System.out.print("��������������ѡ��");
			}
			studentClinet.stu1();
		}	
	}


