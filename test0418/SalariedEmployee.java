package com.alibaba.tt;

public class SalariedEmployee extends ColaEmployee{
	  
	  private int money;

	public SalariedEmployee(String workerName, int workerBirthday, int month,int money) {
		super(workerName, workerBirthday, month);
		this.money =money;
		if(super.getMonth()==super.getBirthday())
		{
			System.out.println("员工"+getName()+month+"月工资金额为"+(money+100));
		}else {
			
			System.out.println("员工"+getName()+month+"月工资金额为"+money);
		}
		
		
		
		
	}
	


	

}
