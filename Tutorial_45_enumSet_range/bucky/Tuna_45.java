package bucky;

public enum Tuna_45 {
//Anytime you make an enumeration like below Java takes the constints and builds an array
	bucky("nice", "22"),    //Each constint is an like object with its own set of variables in this enumeration     
	kelsey("cutie", "10"),       
	julia("bigmistake", "12"),
	nicole("italian", "13"),
	candy("different", "14"),
	erin("iwish", "16");   
	
	private final String desc;  //Each of the above constints have a set of variables for desc and year
	private final String year;
	
	Tuna_45(String description, String birthday){ //This is a constructor which allows us to set the vars equal to each other
		desc = description; //This is going to have a value of nice, cutie, bigmistake, italian, different, iwish
		year = birthday;    //This is going to have a value of 22, 10, 12, 13, 14, 16
	}
	
	public String getDesc() { //This will now return the information we wanted
		return desc;
	}

	public String getYear(){
		return year;
	}
}


//Enumerations are constants that are also Objects