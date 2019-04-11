package com.aliba.a;
public class Text
//实现选择排序
{
	public static void main(String[] args)
	{
		int[] num = {-1,20,50,100,0};
		int[] num1 = chooseSort(int[] num);
		String.out.println(Arrays.toString(num1));
		
	}
	public static int[] chooseSort(int[] nums)
	{
		for(int i = 0; i<nums.length-1; i++)
		{
			for(int j = i+1; j<nums.length; j++)
			{
				if(nums[i] > nums[j])
				{
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		return nums;
		
	}
	
}
class Text1
//实现冒泡排序
{
	public static void main(String[] args)
	{
		int[] num = {-10,-1,50,0};
		int[] num1 = bubbleSort(num);
		System.out.println(Arrays.toString(num1));
	}

	public static int[] bubbleSort(nums)
	{
		for(int i = 0; i < nums.length - 1;i++)
		{
			for(int j = 0; i < num.length - 1 - i;j++)
			if(nums[j] > nums[j+1])
			{
				int temp = nums[j];
				nums[j] = nums[j+1];
				nums[j+1] = temp;
			
			}

		}
		return nums
	
	}
}