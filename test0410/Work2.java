package com.neusoft.tt;

public class Work2 {
	public static void main(String[] args) {
		NoteBook nb= new NoteBook();
		nb.playGame();
		
			
	}

}

class Computer
{
	String brand;
	String type;
	
	public void playGame()
	{
		
		System.out.println("geming....");
	}
	
	public void playCode()
	{
		
		System.out.println("coding....");
	}
	

}

class NoteBook extends Computer{
	@Override
	public void playGame() {
		System.out.println("玩高级游戏");
	}
	
	public void playCode(String name)
	{
		
		System.out.println(name+"敲代码");
		
	}
	
	
}




