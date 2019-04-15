package com.alibaba.tt;

public class Person {
	public static void main(String[] args) {
		
		Person person = new Person();
		//Car car= new Car();
		Plane plane = new Plane();
		person.play(plane);
		
		
		
		
	}
	public void play( Vehicle v)
	{
		v.trip();
		
	}

}
