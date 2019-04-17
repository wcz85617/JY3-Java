package com.alibaba.tt;

public class Car {
		
		private int price;
		private String carName;
		
		
		public void setName(String name)
		{
			this.carName = name;
		}
		
		
		public String getName()
		{
			return carName;
		}
		public void setPrice( int price) {
			if(price < 10000)
			{
				System.out.println("您出入价格有误！！！！");
			}else
			{this.price = price;
			}
		}
		
		public int getPrice()
		{
			
			return price;
		}
}
	
	

	

