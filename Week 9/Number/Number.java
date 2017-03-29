/*
Numbers.java#
@author F Animashaun
24/03/2017
*/

//Develop an application that accepts a whole number from the user and calculates and displays the sum of all numbers from 1 to that number.
//Your application should use instantiable classes.

public class Number{

	//data member
	private int userNo;
	private int total;


	//constructor
	public Number(){
		userNo=0;
		total=0;
	}

	//set
	public void setUserNo(int userNo){
		this.userNo=userNo;
	}

	//compute
	public void compute(){
		for(int q=0; q<=userNo; q++){
			total=total+q;
		}
}
	//get method
	public int getTotal(){
		return total;
	}










}