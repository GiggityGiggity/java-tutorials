package bucky;

public class Tutorial_27_Intro_to_Arrays {
	
	public static void main(String [] args) {
	
// 1st describe the data type (ex:int) 2nd name your array (ex:bucky) followed by[] so java knows your working with an array 	
// 3rd set =new int [] (ex: =new int [10];) and put in the [] how many values you want to store. NOTE it starts counting from zero
		
		int bucky[] = new int[10];
		
		bucky [0] = 87;    //These are your indexes[] or subscripts so [0] will equal 87
		bucky [1] = 95;
		bucky [2] = 83;
		bucky [3] = 20;
		bucky [4] = 99;
		bucky [5] = 39;
		bucky [6] = 19;
		bucky [7] = 55;
		bucky [8] = 33;
		bucky [9] = 66;
	//	bucky [10] = 100;    it will not print this because it starts counting from ZERO
		
		System.out.println(bucky[0]);
		
		
//Instead of typing everything above you can use an Array Intializer ****THIS IS HOW EVERYONE DOES IT****
		
		
		int fastBucky[] ={87,95,83,20,99,39,19,55,33,66}; //this way automatically assigns an index to each value and it starts counting with ZERO
		System.out.println(fastBucky[0]); //The zero index is assigned to 87, 1 = 95, 2 = 83 and etc..
		
		
	}

}

//Arrays = is a variable that can store many values.  The values however have to be the same data type (ex: strings, int)