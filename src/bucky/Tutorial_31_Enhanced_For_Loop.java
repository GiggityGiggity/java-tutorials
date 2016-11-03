package bucky;

public class Tutorial_31_Enhanced_For_Loop {

	public static void main(String[] args) {
		
		int bucky[] = {3,4,5,6,7};  //Created an Array named bucky
		int total = 0;  //Created a Variable named total
		
//Created an enhanced for statement. 1st argument takes the TYPE of data (int) and the identifier you want to store it in (x). The 2nd argument identifies the Array	
		for(int x: bucky){  
			total += x; // this is going to add 3 to 0 (because total=0) then 4, 5,6,7
		}
		
		System.out.println(total); //total holds the sum of all the numbers in the array bucky
		
	}
	
}

//This is used to loop through all the elements in your array so you can do something with them.