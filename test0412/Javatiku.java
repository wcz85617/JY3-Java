package com.aliba.a;
import java.util.*;

public class Javatiku {
	//�κ���ҵ2
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
class Javatiku1{//���̿��������ϰһ
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("����������");
		 int a = scanner.nextInt();
		 if(a>0 && a%2==0)
		 {
			 System.out.println("���������ż��"+a);
		 }else
		 {
			 System.out.println("�������"+a);
		 }
		 scanner.close();
	}
	
}
class Javatiku2{//���̿��������ϰ��
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("������x");
		int x = scanner.nextInt();
		System.out.println("������y");
		int y = scanner.nextInt();
		if(x>y) {
			System.out.println("�ϴ�ֵ��x");
		}else if(x<y) {
			System.out.println("�ϴ�ֵ��y");
		}else
		{
			System.out.println("һ����");
		}
		scanner.close();
	}	
}
class Javatiku3{//���̿��������ϰ3
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
class Javatiku4{//���̿������κ���ҵ1
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("������a");
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
		
		System.out.println("��������ǣ�"+ a);	
	}
	
}
class Javatiku5{//���̿������κ���ҵ4
	public static void main(String[] args) {
		   int num =1;
		for(int i = 10;i>0;i--) {
				num=(num+1)*2;
			}
			System.out.println(num);
		}
	}
	
