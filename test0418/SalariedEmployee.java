package com.alibaba.tt;

public class SalariedEmployee extends ColaEmployee{
	  
	  private int money;

	public SalariedEmployee(String workerName, int workerBirthday, int month,int money) {
		super(workerName, workerBirthday, month);
		this.money =money;
		if(super.getMonth()==super.getBirthday())
		{
			System.out.println("Ա��"+getName()+month+"�¹��ʽ��Ϊ"+(money+100));
		}else {
			
			System.out.println("Ա��"+getName()+month+"�¹��ʽ��Ϊ"+money);
		}
		
		
		
		
	}
	


	

}
