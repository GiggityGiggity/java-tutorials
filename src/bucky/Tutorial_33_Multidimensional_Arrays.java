package bucky;

public class Tutorial_33_Multidimensional_Arrays {

	public static void main(String[] args){
		
//Array type (int): Array name (firstArray): 1st[] is for the row: 2nd[] is for the column: rows are in {8,9,10,11} will be the 1st and {12,13,14,15} will be the 2nd
		int firstArray[][] = {{8,9,10,11} , {12,13,14,15}};
		
		System.out.println(firstArray[0][1]);// This is how you call on the 1st array above (0 = 1st array and 1 = the index 9)
		
		int secondArray[][] = {{30,31,32,33} , {43}, {4,5,6}};  //This table is an example with different row lengths
		
		System.out.println(secondArray[2][2]);// This would call for the index 6
	
	}
	
}
//People make multidemensional arrays when ever they want to make a table in java or make something where you need coordinates. 