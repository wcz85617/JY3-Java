package com.neusoft.tt;

public class Work4 {
	public static void main(String[] args) {
		Apple apple = new Apple();
	    apple.showName();
		System.out.println(apple.name);
		
		
	}

}

class Fruit
{
	String type;
	String name;
	
}
class Apple extends Fruit
{
	String name;
	
	public void showName()
	{
		name = "ºìÆ»¹û";
	}

}