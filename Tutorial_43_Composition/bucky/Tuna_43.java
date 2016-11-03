package bucky;

public class Tuna_43 {
	private String name;
	private Potpie_43 birthday;
	
	public Tuna_43(String theName, Potpie_43 theDate){
		name = theName; //It took the name "Dion" 
		birthday = theDate; //It took the object "potObject" and set it to birthday
	}

//Anytime I want to turn an object into a string I go to Potpie_43 and look for the toString method
	public String toString(){
		return String.format("My name is %s, My birthday is %s", name, birthday);
	}
}
