package bucky;

import java.util.EnumSet; //We need to import the EnumSet class to use the built in method .range

public class Apples_45 {
	public static void main(String[] args) {
		//Enhanced for loop
		for(Tuna_45 people: Tuna_45.values()) //Object Var : Enumeration Array(the constints in Tuna_44 (Java built this automatically) 
		//This will loop through bucky, kelsey and Julia in Tuna_44 and assign them to the people variable 	
			System.out.printf("%s \t %s \t %s \n", people, people.getDesc(), people.getYear());
		//people (OBJECT NAME) = (bucky, kelsey, julia)  people.getDesc = (nice, cutie, bigmistake)  people.getYear = (22,10,12)
		
		System.out.println("\nThis is where the 1st for loop ends and the 2nd begins\n");
		
		for(Tuna_45 people: EnumSet.range(Tuna_45.kelsey, Tuna_45.candy))//this enhanced for loop will get the range between kelsey and candy in Tuna_45 
			System.out.printf("%s \t %s \t %s \n", people, people.getDesc(), people.getYear());

	}

}

//EnumSet range = allows you to choose certain values in an array