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

	




