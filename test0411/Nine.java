package com.aliba.a;
import java.util.*;
public class Nine
//�žų˷�����//
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
//ˮ�ɻ�//
{
	public static void main(String[] args)
	{
		System.out.println("�L:");
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
//100���ڵ��ۼ�ֵ ���ǲ�������λΪ3����//
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
///С���100�߿����£���ʮ�ι��ƾ��������ף�
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
//100Ԫ��һ��ֻ��//
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
					System.out.println("����"+l+":"+g+m+b);
					l++;
				
				}
			}
		}
	}
}
class Nine5
//intתchar
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner (System.in);
		System.out.print("������:");
		int num = scanner.nextInt();
		char c = f(num);
		System.out.print("���:"+c);
	}
	public static char f(int num)
	{
		return (char)num;
	}
}
class Nine6
//char ת int
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner (System.in);
		System.out.print("������:");
		String num = scanner.next();
		char sp = num.charAt(0);
		int x = f(sp);
		System.out.print("�������:"+x);

	}
	public static int f(char c)
	{
		return c;
	}

}
class Nine7
{
	//С���������� one year How much 
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
//�Լ���� �Լ����� ��ʵ��ȫ�ǽ����֮ǰ��ʦ���Ķ�����ֻ�ǽ����һ�¶���
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
		System.out.println("�������֣�");
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
