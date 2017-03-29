/*
MakingChange.java
@author F Animashaun
10/02/2017
*/

import java.util.*;
public class MakingChange{
	public static void main(String args[]){
		Scanner keyboard;

		keyboard=new Scanner(System.in);

		double totalCost=0;
		double paid=0;
		double change=0;
		int fifty50;
		int twenty20;
		int ten10;
		int two2;

		System.out.println("What is the total cost?");
		totalCost=keyboard.nextDouble();

		System.out.println("How much has the customer paid?");
		paid=keyboard.nextDouble();



		//process

		fifty50=(int)change/50;
		change=change%50;

		twenty20=(int)change/20;
		change=change%20;

		ten10=(int)change/10;
		change=change%10;

		two2=(int)change/2;
		change=change%2;

		change=paid-totalCost;

		System.out.println("Here is the customer's change "+(change));















		}



	}