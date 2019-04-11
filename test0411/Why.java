package com.aliba.a;
public class Why
{
	//实行正方形
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
//空心正方形//
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
//实心三角
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