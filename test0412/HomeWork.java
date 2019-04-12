package com.aibaba.tt;
import java.util.*;
public class HomeWork {
//第三章流程语句控制课后作业2
	public static void main(String[] args)
	{
		int a = 90;
		String level;
		switch(a/10) {
		case 10: 
		case 9:  level ="A";break;
		case 8:  level ="B";break;
		case 7:  level ="C";break;
		case 6:  level ="D";break;
		default: level ="E";
		}
		System.out.print(level);	
	}
}
class HomeWork2
{
	public static void main(String[] args)
	{
		       int a = 30000;
		       int b = 0 ;
			
			for(int i =1;i<=10;i++)
			{
				//Scanner scanner = new Scanner(System.in);
				//System.out.println("请输入工作年限");
				//int i= scanner.nextInt();
				//b= a*Math.pow(1+0.06 ,10);
				a = a+a*6/100;
				b = b +a;
				System.out.println(a);	
			}
	}
}
