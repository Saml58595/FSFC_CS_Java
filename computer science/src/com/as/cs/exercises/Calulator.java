package com.as.cs.exercises;

public class Calulator {
private float numOne=0;
private float numTwo=0;

public float getnumOne(){
	return numOne;
}
public void setnumOne (float numOne){
this.numOne = numOne;
}

public float getnumTwo(){
	return numTwo;
}
public void setnumTwo (float numTwo){
this.numTwo = numTwo;	
}

public Calulator (){

}

public float add(){
	return numOne + numTwo;
}

public float multiply(){
	return numOne + numTwo;
}
public float subtract(){
	return numOne - numTwo;
}

public float divide(){
	return numOne / numTwo;
}


}