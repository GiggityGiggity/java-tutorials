package bucky;

public class Tutorial_17_Constructors {
	public static void main (String[] args) {
		
		T17 T17Object = new T17("Kelsey");  //instead of leaving empty use the parameters to pass an argument (ex:Kelsey)
		T17 T17Object2 = new T17("Ann");  //these 2 objects cant see each others var
		
		T17Object.saying();
		T17Object2.saying();
	}

}

//A Constructor allows you to initialize variables (T17) as soon as you create an object (line 6&7)