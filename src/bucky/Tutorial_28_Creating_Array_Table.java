package bucky;

public class Tutorial_28_Creating_Array_Table {

	public static void main(String[] args) {
		
		System.out.println("Index\tValue");  // /t stands for tab or 5 spaces
		
		int bucky[] = {32,12,18,52,2};
		
		for(int counter=0; counter<bucky.length; counter++) {  
	// int counter = 0; The counter has to start at zero because array indexes begin at zero
	// bucky.length = how many indexes you have which is 5 (32,12,18,52,2)
	
			System.out.println(counter + "\t" + bucky[counter]);  
	// counter = index;  /t = tab or 5 spaces; bucky[counter] = value of index being called inside the bucky array (ex: bucky 0 = 32)
		}
		
	}
	
}
