package com.aliba.a;

public class Tsr {
	public static void main(String[] args) {
		
		int a = 9;
		int b = 8;
		a = a ^ b;
		b = b ^ a;
		a = a ^ b;
		System.out.println(a);
		System.out.println(b);
		
		
	}

}
class Tsr1
{
	public static void main(String[] args) {
		String str = "692116851128";
		int num1 =0;
		int num2 =0;
		int cc = 0;
		for(int i = 0; i< str.length();i=i+2)
		{
			char c = str.charAt(i);
			num1 = num1 + c-48;
			System.out.println(c);
		}
		System.out.println(num1);
		
		for(int j = 1; j< str.length();j=j+2)
		{
			char d = str.charAt(j);
			num2 = num2 + d-48;
		}
		System.out.println(num2);
		System.out.println((10-(num1+num2*3)%10)%10);
	}
}
class Tsr2
{
	public static void main(String[] args)
	{
		int a = 10;
		int jie = f(a);
		System.out.println(jie);
		
	}
	public static int f(int d)
	{
		if(d==0||d==1)
		{return 1;
		}else
		{	
		 return f(d-1)*d;
	    }
    }
}
		
	
	


