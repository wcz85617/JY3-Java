package com.neusoft.tt;

import java.awt.image.SinglePixelPackedSampleModel;

public class Work3 { 
	public static void main(String[] args) {
		String[] pop= new String[] {"刘德","张学友","周润发","周星驰"};
		
		Single single= new Single(1, "哪个人最好看", pop,"刘德" );
		String[] ans= new String[] {"刘德"};
		
		boolean check = single.check(ans);
		System.out.println(check==true?"回答正确":"回答错误");
		single.print();
		
		
		
	}
	
	
	
	

}
class Question{
	int id;
	String text;
	String[] options = {};
	public boolean checkAnswer(String[] ans)
	{
		return false;
		
	}
	public void print()
	{
		System.out.println("题号"+id+",题干"+text);
		for(String i:options)
		{
			System.out.println("\t"+i);
			
		}
		System.out.println();	
	}
	
	
}
class Single extends Question{
	String answer;
	public Single(int id,String text,String[] options,String answer)
	{
		this.id= id;
		this.text =text;
		this.options = options;
		this.answer = answer;	
	}
	public boolean check(String[] ans)
	{
		if(ans==null || ans.length !=1)
		{
			return false;
		}else 
		{return this.answer.equals(ans[0]);
		}
				
	}
	
	
	
}

