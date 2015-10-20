package com.as.cs.exercises;

public class check_eligibility {

	public static void main(String[] args) 
	{
		checkEligibility();
	}
	
	static void checkEligibility(){
		
		int age;
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("What is you age");
		
		age=sc.nextlnt();
		
		if(age>=18)
			System.out.println("Lets go get a drink");
		else
			System.out.println("Aren't you a bit young");
	}

}
