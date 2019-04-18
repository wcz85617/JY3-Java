package com.alibaba.tt;

public class Question {
	String text;
	String[] options;
	int[] answers;
	
	
	public boolean check(int[] answers)
	{
		return false;
	}
	
	public void print() {
		System.out.println(this.text);
		for(int i =0 ; i< options.length; i ++)
		{
			
			System.out.println(options[i]+"");
		}
		System.out.println();
		
		
	}

}
