package com.aliba.a;
import java.util.*;

public class Javatiku {
	//课后作业2
	public static void main(String[] args) {
		int sum = 0;
		for(int i=0;i<=12;i++)
		{
			int a = i/100;
			int b = i/10%10;
			int c = i%10;
			sum = a+b+c;
			System.out.println(sum);	
		}	
	}
}
class Javatiku1{//流程控制语句练习一
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("请输入数字");
		 int a = scanner.nextInt();
		 if(a>0 && a%2==0)
		 {
			 System.out.println("您输入的是偶数"+a);
		 }else
		 {
			 System.out.println("输入错误"+a);
		 }
		 scanner.close();
	}
	
}
class Javatiku2{//流程控制语句练习二
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("请输入x");
		int x = scanner.nextInt();
		System.out.println("请输入y");
		int y = scanner.nextInt();
		if(x>y) {
			System.out.println("较大值是x");
		}else if(x<y) {
			System.out.println("较大值是y");
		}else
		{
			System.out.println("一样大");
		}
		scanner.close();
	}	
}
class Javatiku3{//流程控制语句练习3
	public static void main(String[] args) {
		int sum = 0;
		int a = 1;
		while(a>=1 && a<=100)
		{
			if(a%2!=0)
			{
				sum = sum + a;
			}
			a++;
			
		}
		System.out.println(sum);	
	}
}
class Javatiku4{//流程控制语句课后作业1
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("请输入a");
		int a = scanner.nextInt();
		if(a<=100000) {a =10000;
		}else if(a>100000 && a<=200000)
		{
			a =10000+(a-100000)*75/1000;	
		}else if(a>200000 && a<=4000000)
		{
			a =10000+7500+(a-200000)*50/1000;
		}else if(a>400000 && a<=6000000)
		{
			a =10000+7500+10000+(a-400000)*30/1000;
			
		}else if(a>600000 && a<=10000000)
		{
			a =10000+7500+10000+6000+(a-600000)*15/1000;	
		}else if(a>10000000)
		{
			a =10000+7500+10000+6000+(a-1000000)*10/1000;	
		}
		
		System.out.println("您的提成是："+ a);	
	}
	
}
class Javatiku5{//流程控制语句课后作业4
	public static void main(String[] args) {
		   int num =1;
		for(int i = 10;i>0;i--) {
				num=(num+1)*2;
			}
			System.out.println(num);
		}
	}
	
