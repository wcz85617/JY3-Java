package com.neusoft.tt;

import java.awt.image.SinglePixelPackedSampleModel;

public class Work3 { 
	public static void main(String[] args) {
		String[] pop= new String[] {"����","��ѧ��","����","���ǳ�"};
		
		Single single= new Single(1, "�ĸ�����ÿ�", pop,"����" );
		String[] ans= new String[] {"����"};
		
		boolean check = single.check(ans);
		System.out.println(check==true?"�ش���ȷ":"�ش����");
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
		System.out.println("���"+id+",���"+text);
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

