package com.aliba.a;

import java.util.Arrays;

public class T201904101 {
	public static void main(String[] args)
	{
		int[] c = new int[13];
		int[] a = {1,7,9,11,13,15,17,19};
		int[] b = {2,4,6,8,10};
		//int[] c = Arrays.copyOf(a, a.length);
		//int[] c = Arrays.copyOf(a, b.length);
		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, a.length, b.length);
		Arrays.sort(c);
		System.out.print(Arrays.toString(c));
		
	}
}
class Test1
{
	public static void main(String[] args)
	{
		for(int i = 6;i < 1000;i++)
		{
			int a = 0;
			for(int j = 5;j<1000;j++)
			{
				if(i%j ==0)
				{
				  a = a+j; 
				}	
			}
			if(a==i);
			System.out.println(i);
		}
	}			
}
	
	
