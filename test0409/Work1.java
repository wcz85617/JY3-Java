package com.neuedu.test;
public class Work1{
public static void main(String[] args) 
	{
	Book b1 = new Book();
	b1.name = "���´�ȫ";
	b1.page = 100;
	b1.price = 200;	
	b1.wirter = "������";
	b1.ISBN = "1234564565";
	b1.style = "������";
	b1.company = "�����ձ�������";
	System.out.println("b1������"+b1.name);
	System.out.println("b1��ҳ��"+b1.page);
	System.out.println("b1�ļ�Ǯ"+b1.price);
	System.out.println("b1������"+b1.wirter);
	System.out.println("b1��ISBN"+b1.ISBN);
	System.out.println("b1����ʽ"+b1.style);
	System.out.println("b1�ĳ�����"+b1.company);
	
	}
	

}
class Book
{
	String name;
	int page;
	double price;
	String wirter;
	String ISBN;
	String style;
	String company;

	public void read()
	{
		System.out.println("���ڿ���");
	}
	public void collect()
	{
		System.out.println("ϲ���ղ�");
	}
	public void buy(int price ,int nums) 
	{
		return;
	}
	
}


class Work2
{
	public static void main(String[] args)
	{
		Money RMB = new Money(50,"china");
		System.out.println(RMB.value);
		System.out.println(RMB.country);
		
		
		
	}
}
	class Money
	{
		public Money()
		{
			
		}
		public Money(int value,String country)
		{
			this.value = value;
			this.country = country;
			
		}
		int value;
		String  country;
		


	}
class Work3
{
	public static void main(String[] args)
	{
		Point point = new Point(5);
		System.out.println(point.x);
		System.out.println(point.y);
		
	}
	
}

class Point
{
	public Point(int p)
	{
		this(p,p);
	}
	public Point(int x ,int y)
	{
		this.x = x;
		this.y = y;
		
	}
	int x;
	int y;
	


}













	




