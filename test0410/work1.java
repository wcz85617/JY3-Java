package com.neusoft.tt;

public class work1 {
	public static void main(String[] args) {
		ErHa er= new ErHa();
		er.sys();
		Dog dog= new Dog();
		//dog.sys();
		dog.get();
		System.out.println(Dog.animalName);
		
		
	}
	

}
class Animal{
	
	public Animal()
	{
		System.out.println("来自父类构造器的文字");
		
	}
    static String animalName = "haha";
	
	String Type = "gooddog";
	
	int weight;
	public void get()
	{
		System.out.println("蹦起来");
	}
	
	
}
class Dog extends Animal
{
	public Dog()
	{
		System.out.println("来自一个子类的构造器，不知道父类的会不会被删除呢答案是否定的");
		
	}
	
	public void sys()
	{
		System.out.println(Type);
		
	}
}
class ErHa extends Dog
{
	


}
