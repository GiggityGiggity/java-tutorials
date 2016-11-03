package bucky;
 

public class Tutorial_34_Multi_Arrays {

	public static void main(String[] args){
		
//Array type (int): Array name (firstArray): 1st[] is for the row: 2nd[] is for the column: rows are in {8,9,10,11} will be the 1st and {12,13,14,15} will be the 2nd
		int firstArray[][] = {{8,9,10,11} , {12,13,14,15}};
		int secondArray[][] = {{30,31,32,33} , {43}, {4,5,6}};  //This table is an example with different row lengths
		
		System.out.println("This is the First Array");
		display(firstArray);                               //This calls the method display below and says to display firstArray
		
		System.out.println();                              //This just gives a space between the first and secong array
		
		System.out.println("This is the Second Array");
		display(secondArray);                              //This calls the method display below and says to display secondArray
	}
	
	public static void display(int x [][]){               //We create a new Method called display and pass it the multidemensional Array
		for(int row = 0; row < x.length; row++){          //lines 22-27 loops through the rows
			for(int column=0; column<x[row].length; column++){  //loops through the columns
				System.out.print(x[row] [column] +"\t");        //prints out the indexes
			}
			System.out.println();                               //prints out a whole new line each time the loop is ran. comment it out to see what happens
		}
	}
}
//People make multidemensional arrays when ever they want
