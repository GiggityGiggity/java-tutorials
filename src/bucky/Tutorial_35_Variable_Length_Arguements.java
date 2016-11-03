package bucky;

public class Tutorial_35_Variable_Length_Arguements {
	
public static void main(String[] args){
	System.out.println(average(43,56,76,8,65,76,2,31)); //this is going to call the method average and pass the numbers into it (...)

	}
// Here we created a Method named average thats going to return int. Use an elipse (...) any time you don't know how many of something your going to use & the name of the var you want to use (numbers)
public static int average(int...numbers){
	int total = 0;  //Starts at 0 because we don't know how many numbers yet
	for(int x:numbers)  //Here we created an enhanced for loop
		total+=x;  //Here we are looping through all those numbers in average and adding them to total 
	
	return total/numbers.length; //What this does is take how many #'s you use in average and divide them by the sum of the #'s 
	}

}
//Any time you want to build a Method but you don't know how many arguments its going to take you use this