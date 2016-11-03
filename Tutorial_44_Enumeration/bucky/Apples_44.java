package bucky;

public class Apples_44 {
	public static void main(String[] args) {
		//Enhanced for loop
		for(Tuna_44 people: Tuna_44.values()) //Object Var : Enumeration Array(the constints in Tuna_44 (Java built this automatically) 
		//This will loop through bucky, kelsey and Julia in Tuna_44 and assign them to the people variable 	
			System.out.printf("%s \t %s \t %s \n", people, people.getDesc(), people.getYear());
		//people (OBJECT NAME) = (bucky, kelsey, julia)  people.getDesc = (nice, cutie, bigmistake)  people.getYear = (22,10,12)
		
		
	}

}

//EnumSet range = allows you to choose certain values in an array