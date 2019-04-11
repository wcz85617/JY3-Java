package com.aliba.a;

public class W 
{
	public static void main(String[] args) 
	{
		Vehicle p1 = new Vehicle(70,500);
		int sp = Vehicle.setSpeed(50);
		
		System.out.println(p1.speed);
		System.out.println(p1.size);
		System.out.println(sp);
		
	
	
	}
	
	
	
}
	




class Vehicle
{
	public Vehicle(int speed,int size)
	{
		this.speed = speed;
		this.size = size;	
	}
	int speed;
	int size;
	int time;
	public static int move(int speed,int time)
	{
		return speed*time;
	}
	public static int setSpeed(int speed)
	{
		
		return speed;
	}
	


}
