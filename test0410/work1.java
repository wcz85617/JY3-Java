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
		System.out.println("���Ը��๹����������");
		
	}
    static String animalName = "haha";
	
	String Type = "gooddog";
	
	int weight;
	public void get()
	{
		System.out.println("������");
	}
	
	
}
class Dog extends Animal
{
	public Dog()
	{
		System.out.println("����һ������Ĺ���������֪������Ļ᲻�ᱻɾ���ش��Ƿ񶨵�");
		
	}
	
	public void sys()
	{
		System.out.println(Type);
		
	}
}
class ErHa extends Dog
{
	


}
