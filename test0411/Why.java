package com.aliba.a;
public class Why
{
	//ʵ��������
	public static void main(String[] args)
	{
		int a = 5;
		for(int j = 0; j <= a; j++)
		{
			for(int i= 0; i <= a; i++)
			{
				System.out.print("*"+" ");
			
		
			}
			System.out.println();
		}
	
	}
}

class Why1
//����������//
{
	public static void main(String[] args)
	{
		//int a = 5;
		for(int i = 0; i <= 5; i++)
		{
			//System.out.print("*");
			for(int j = 0; j <=5; j++)
			{
				if(i==0||i==5||j==0)
				{System.out.print("*"+" ");}
				else
				{System.out.print("  ");}
			
			
			}
			System.out.println("*");
		
		}
	
	
	}
}
class Why2
//ʵ������
{
	public static void main(String[] args)
	{
		//int a = 5;
		for(int i = 0; i <= 5; i++)
		{
			for(int j = 0; j<= 5 - i; j++)
			{
				System.out.print(" ");
			}
			for(int x = 0; x <= i*2; x++)
			{
				System.out.print("*");

			}
			System.out.println();

		}
   }
}