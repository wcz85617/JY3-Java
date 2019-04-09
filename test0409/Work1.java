package com.neuedu.test;
public class Work1{
public static void main(String[] args) 
	{
	Book b1 = new Book();
	b1.name = "故事大全";
	b1.page = 100;
	b1.price = 200;	
	b1.wirter = "无名氏";
	b1.ISBN = "1234564565";
	b1.style = "故事书";
	b1.company = "人民日报出版社";
	System.out.println("b1的书名"+b1.name);
	System.out.println("b1的页数"+b1.page);
	System.out.println("b1的价钱"+b1.price);
	System.out.println("b1的作者"+b1.wirter);
	System.out.println("b1的ISBN"+b1.ISBN);
	System.out.println("b1的样式"+b1.style);
	System.out.println("b1的出版社"+b1.company);
	
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
		System.out.println("正在看书");
	}
	public void collect()
	{
		System.out.println("喜欢收藏");
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













	




