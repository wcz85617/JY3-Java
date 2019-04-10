package com.neusoft.tt;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) 
	{
		int[] sum = {881,15,102,10,5,4};
		int[] sum1 = choose(sum);
		System.out.println(Arrays.toString(sum1));
		
	}

	public static int[] choose(int[] sum)
	{
		for(int i = 0; i < sum.length; i++)
		{
			for(int j = i+1; j < sum.length; j++)
			{
				
				if(sum[i] > sum[j])
				{
					int temp = sum[i];
					sum[i] = sum[j];
					sum[j] = temp;
				}
			}
			
		}
		
		
		return sum;
		
	}

}
