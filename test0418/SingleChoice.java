package com.alibaba.tt;

public class SingleChoice extends Question{

	public SingleChoice(String text, String[] options, int[] answer)
	{
		this.text= text;
		this.options = options;
		this.answer = answer;
		
	}
	
	String text;
	String[] options;
	int[] answers;
	int[] answer;
	
	public boolean check(int[] answers)
	{
		if(answers==null&&answers.length!=1)
		{ return false;}else 
		{
			return answer[0] == answers[0];
		}
		
		
		
	}
	
	

}
