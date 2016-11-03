package bucky;

public class Potpie_43 {
	private int month;
	private int day;
	private int year;
	
	public Potpie_43(int m, int d, int y){ //This is the 1st thing we do and pass the parameters 4,5,6
		month = m; //This will = 4
		day = d; //This will = 5
		year = y; //This will = 6
		
//Every time we create an object we will print out this string but in the %s variable we had a reference to an 
//object "this" and any time you reference an object and it needs something in the string format it will look 
//to the method on line 19 
		System.out.printf("The constructor for this is %s\n", this); //"this" is going to reference the current object
	}
	
	public String toString(){
		return String.format("%d/%d/%d", month, day, year); //this is where the format 4/5/6 comes from
	}

}