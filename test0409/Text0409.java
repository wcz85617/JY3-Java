package com.neuedu.test;

import java.util.*;

public class Text0409 {
	public static void main(String[] args) {
		TestDemo test = new TestDemo();
		Scanner scanner = new Scanner(System.in);
		System.out.println("�����û���");
		String username = scanner.next();
		System.out.println("��������");
		String paw= scanner.next();
		boolean checkUser = test.checkUser(username,paw);
		System.out.println(checkUser == true ?"��¼�ɹ�":"��¼ʧ��");
		scanner.close();
		
	 
		
	}

}
