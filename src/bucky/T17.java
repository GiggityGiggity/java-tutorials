package bucky;

public class T17 {
	private String girlName;  //A constructor allows you to give this var a value (ex: kelsey, Ann) when you create your object in the other class
	
	public T17(String name){  //The constructor methods name has to be the exact same name as the class (ex: T17)
		girlName=name;  //as soon as you created your object in the other class it took that value and passed into girlName
	}
	
	public void setName(String name){
		girlName=name;
	}
	
	public String getName(){  //
		return girlName;
	}
	
	public void saying(){
		System.out.printf("Your first gf was %s\n", getName());  //getName prints out girlName
	}
	
}
