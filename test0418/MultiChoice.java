package com.alibaba.tt;

public class MultiChoice extends Question {
	
	String text;
	String[] options;
	int[] answers;
	
	public MultiChoice(String text, String[] options, int[] answers)
	{
		this.text= text;
		this.options = options;
		this.answers = answers;
		
	}
	
	
	int[] answer;
	public boolean check(int[] answer)
	{
		
		return answers.equals(answer);
		
	}

}
