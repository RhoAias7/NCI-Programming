/*
Numbers.java
@author F Animashaun
18/03/2017
*/

//Create an application where you take in 2
//numbers from the user and add them all up to give a total

//1.Class signature - Creates an application
public class Number{
	//2.Data members i.e. variables

	//inputs
	private int num1;
	private int num2;

	//output
	private int total;

	//3.Constructor
	public Number(){
		num1 = 0;
		num2 = 0;
		total = 0;
	}

	//setter
	//For every input you have a setter
	public void setNum1(int num1){
		this.num1=num1;
	}

	public void setNum2(int num2){
		this.num2=num2;
	}

	//compute
	public void compute(){
		total=num1+num2;
	}

	//getter
	//for every output, you have a getter
	public int getTotal(){
		return total;
	}

	}