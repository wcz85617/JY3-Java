package com.aliba.a;
import java.util.*;
public class Nine
//九九乘法法则//
{
	public static void main(String[] args)
	{
		for(int i =1; i <= 9; i++)
		{
			for(int k = 1; k <= i; k++)
			{
				System.out.print(k+"*"+i+"="+i*k+"  ");

			}
		System.out.println();
		}
	}

}
class Nine1
//水仙花//
{
	public static void main(String[] args)
	{
		System.out.println("桳:");
		//int x =0;
	    for(int i = 100; i < 1000;i++)
	    {
			int ge = i%10;
			int shi = i/10%10;
			int bai = i/10/10%10;
			if(i == (ge*ge*ge+shi*shi*shi+bai*bai*bai))
			{
			
			System.out.println(i);
			
			}
		}
	}
	

}
class Nine2
//100以内的累加值 但是不包括个位为3的数//
{
	public static void main(String[] args)

	{
		int sum  = 0;
		for(int i =0; i <= 100;i++)
		{
			if(!(i%10==3))
			{
				sum = sum + i;

			}		
		}
		System .out.println(sum);
	}
		

}
class Nine3
///小球从100高空落下，第十次共计经过多少米？
{
	public static void main(String[] args)
	{ 
		double sum = 0.0;
		for(int a = 1; a <= 10; a++)
		{
			sum = sum+(double)(100/Math.pow(2,a));
			System .out.println(sum);	
		}
	
	}
}
class Nine4
//100元买一百只鸡//
{
	public static void main(String[] args)
	{
		int g = 1;
		int m = 1;
		int b = 1;
		int l = 1;
		for(g = 1; g < 25 ; g++)
		{
			for(m = 1; m <33 ; m++)
			{
				b = 100 - g - m;
				if(100 == 5*g + 3*m +1/3*b)
				{
					System.out.println("方案"+l+":"+g+m+b);
					l++;
				
				}
			}
		}
	}
}
class Nine5
//int转char
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner (System.in);
		System.out.print("请输入:");
		int num = scanner.nextInt();
		char c = f(num);
		System.out.print("输出:"+c);
	}
	public static char f(int num)
	{
		return (char)num;
	}
}
class Nine6
//char 转 int
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner (System.in);
		System.out.print("请输入:");
		String num = scanner.next();
		char sp = num.charAt(0);
		int x = f(sp);
		System.out.print("输出的是:"+x);

	}
	public static int f(char c)
	{
		return c;
	}

}
class Nine7
{
	//小兔子生宝宝 one year How much 
	public static void main(String[] args) {
		int a = 5;
		int b = f(a);
		System.out.println(b);
	}
	public static int f(int n)
	{
		if(n==0||n==1||n==2)
		{
			return 1;	
		}else
		{
			
			return f(n-1)+f(n-2);
		}
	}
}
class Nine8
//自己想的 自己做的 其实完全是结合了之前老师讲的东西，只是结合了一下而已
{ 
	public static void main(String[] args) {
		int[] a = new int[] {5,5,9,0};
		int c = 0;
		for(int i =a.length-1;i>=0;--i)
		{
			 c = (a[i]+5)%10;
			 System.out.println(c);
		}	
	}

}
class Nine9
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入数字：");
		int x = scanner.nextInt();
		int y = f(x);
		System.out.println(y);
		}
	public static int f(int z)
	{
		int a = z/1000;
		int b = z/100%10;
		int c = z/10%10;
		int d = z%10;
		
		a = (a+5)%10;
		b = (b+5)%10;
		c = (c+5)%10;
		d = (d+5)%10;
		z = d*1000+c*100+b*10+a;
		return z;
		
	}		
}
