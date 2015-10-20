package com.as.cs.exercises;

public class Calculator_Controller {

	public static void main(String[] args) {
		float numOne, numTwo;
		Calulator samcalculator = new Calulator();
		
		
		
		numOne=Float.parseFloat(args[0]);
		numTwo=Float.parseFloat(args[0]);
		
		
	

	samcalculator.setnumOne(numOne);
	samcalculator.setnumOne(numTwo);
	
	System.out.println("adding" + samcalculator.add());
	System.out.println("dividing" + samcalculator.divide());
	System.out.println("multiplying" + samcalculator.multiply());
	System.out.println("subtracting" + samcalculator.subtract());
	
	
}

}