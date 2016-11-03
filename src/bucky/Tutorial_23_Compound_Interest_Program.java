package bucky;

public class Tutorial_23_Compound_Interest_Program {
	
	public static void main(String[] args){
		
		double amount;                  //We need 3 var because thats how many vars are in the formula (look at the bottom)
		double principal = 10000;
		double rate = .01;
		
		for (int day=1; day<=20; day++){
			amount=principal*Math.pow(1 + rate, day);//The Math.pow method Returns the value of the first argument raised to the power of the second argument (The arguments are separated by the comma)
			System.out.println(day + "   "+ amount); //the " " are to add spaces
		}
		
	}

}
// Problem:
// We want to find out how many subscribers we will have in the future. If we have 10,000(P) subscribers and we gain 
// 1%(R) each day.  With this information we want to find out how many subscribers we will have in the future(n)

/* The formula for Compound Interest
A=P(1+R)^n

A=10000(1+.01)^20

A = stands for the amount (This is what were looking for)
P = stands for the principal which is what were solving for
R = stands for the rate
^ = stands for power
n = stands for the number of years

*/