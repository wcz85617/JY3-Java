package com.alibaba.tt;

public class Test {
	public static void main(String[] args) {
		
		Test vehicle =new Test();
		Plane plane = new Plane();
		//Train train= new Train();
		vehicle.play(plane);
		
		Car car= new Car();
		car.setPrice(152250);
		int price= car.getPrice();	
		System.out.println(price);
		
		car.setName("benzs");
		String name= car.getName();
		System.out.println(name);
	}
	
		public void play(Vehicle v)
		{
			v.trip();
			
			
		}
	
	
	
	
	

}
