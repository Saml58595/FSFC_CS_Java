package com.as.cs.exercises;

public class Stringclass_exersise {

	public static void main(String[] args) {
		
		String firstname = "Sam" ;
		String lastname = "Lister" ;
		
	String fullname = firstname.concat(lastname);
	
	System.out.println(firstname.equals(lastname));
	
	System.out.println(fullname.equals(firstname+lastname));
	
	String firstname2 = new String("Sam");
	
	System.out.println(firstname==firstname2);
	
	System.out.println(fullname==firstname+lastname);
	
	String str="oblong";
	String SubStringOne=str.substring(0,6);
	System.out.println(SubStringOne);
	
	String str1="itsaclassic";
	String SubStringTwo=str1.substring(11);
	System.out.println(SubStringTwo);

	}

}
