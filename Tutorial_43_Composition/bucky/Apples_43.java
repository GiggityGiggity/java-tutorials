package bucky;

public class Apples_43 {
	public static void main(String[] args){
		Potpie_43 potObject = new Potpie_43(4,5,6); //We create an object using the parameters 4,5,6
		Tuna_43 tunaObject = new Tuna_43("Dion", potObject); //We pass a string "Dion" and an Object "potObject"
		
		System.out.println(tunaObject);
	}

}


//Composition = A class, instead of just having vars and methods it can also have references to other objects for other classes