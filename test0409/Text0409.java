package com.neuedu.test;

import java.util.*;

public class Text0409 {
	public static void main(String[] args) {
		TestDemo test = new TestDemo();
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入用户名");
		String username = scanner.next();
		System.out.println("输入密码");
		String paw= scanner.next();
		boolean checkUser = test.checkUser(username,paw);
		System.out.println(checkUser == true ?"登录成功":"登录失败");
		scanner.close();
		
	 
		
	}

}
