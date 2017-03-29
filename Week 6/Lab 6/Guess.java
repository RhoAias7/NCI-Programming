/*
Guess.java
@Author F Animashaun
03/03/2017
*/

import java.lang.Math.*;
public class Guess{

	//Declare variables
	private int userNo;
	private int randomNo;
	private String message;

	//Constructor
	public Guess(){
		randomNo=(int)(Math.random()*10);
		userNo=0;
		message="";
		}

	//set method
	public void setUserNo(int userNo){
		this.userNo=userNo;
		}

	//compute
	public void compute(){
		if(userNo == randomNo){
			message="Congratulations, you guessed correctly!";
			}
		else if(userNo > randomNo){
			message="You guessed too high, sorry!";
			}
		else{
			message="you guessed to low, sorry!";
			}

		}

	//get method
	public String getMessage(){
		return message;
		}

	public int getRandomNo(){
			return randomNo;
		}


	}