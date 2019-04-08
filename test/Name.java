package com.neuedu.test;

import java.util.*;

public class Name {
	public static void main(String[] args)
	{
		int[] ary = {2,2,3,5};
		int[] ary1 = new int[ary.length];
		for(int i = 0;i < ary.length;i++)
		{
			ary1[i] = ary[i];
		}
	    System.out.println(Arrays.toString(ary1));	
		
	}

}
class Name1
{
	public static void main(String[] args)
	{
		int[] ary = {119,-1,20,220,777,11999};
		//int[] destArray = new int[ary.length];
		int[] destArray = Arrays.copyOf(ary, 6);
		System.out.println(Arrays.toString(destArray));	
		
	}

}

class Name2{

	public static void main(String[] args) {
	
		int[] arr = {10,5,109,100,-11,999};
		arr = f(arr);
		System.out.println(Arrays.toString(arr));
	 }
	public static int[] f(int[] arr)
	{
		for(int i = 0; i< arr.length-1; i++)
		{
			for(int j = 0; j < arr.length-1-i; j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
				}
				
			}
		}
		return arr;		
	}
}
class Name3
{
	public static void main(String[] args)
	{
		int[] arr = {10,5,109,100,-11,999};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));	
	}
}
class Name4
{
	public static void main(String[] args) 
	{
		          
		for(int i =100; i<=999;i++)
		{
			int a = i/100;
			int b = i/10%10;
			int c = i%10; 
			if(i==(a*a*a+b*b*b+c*c*c))
			{
				System.out.println(i);
			}
		}
		long time =System.currentTimeMillis();
		System.out.println(time);
		
			
	}

}
