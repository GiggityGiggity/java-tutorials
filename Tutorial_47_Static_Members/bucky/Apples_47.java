package bucky;

public class Apples_47 {
	public static void main(String[] args) {
	//below are 3 different Objects of which each have their own set of variables
		Tuna_47 member1 = new Tuna_47("Megan","Fox");
		Tuna_47 member2 = new Tuna_47("Natalie","Portman");
		Tuna_47 member3 = new Tuna_47("Taylor","Swift");
		
		
		System.out.println(Tuna_47.getMembers()); //Instead of having an object we can use the class name and the name of the method since its static
		
		System.out.println();
		System.out.println(member1.getFirst()); //This will only print out the info for member1
		System.out.println(member1.getLast());
		System.out.println(member1.getMembers());
		
		System.out.println();
		System.out.println(member2.getFirst()); //This will only print out the info for member2
		System.out.println(member2.getLast());
		System.out.println(member2.getMembers());
		
		System.out.println();
		System.out.println(member3.getFirst()); //This will only print out the info for member3
		System.out.println(member3.getLast());
		System.out.println(member3.getMembers());
	
	}

}

