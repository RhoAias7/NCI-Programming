/*
Change.java
@Author F Animashaun
21/02/17
*/

//Mr Cashman, the owner of the local corner shop is having trouble with his staff giving the wrong change.
//To tackle this he has commisioned you to create a program that allows the staff member to enter the total
//cost of the shopping and the amount the customer has paid. The program should then calculate and output
//how many €50, €20, €10, €5 notes, and how many €2, and €1 coins to give the customer as change. Mr.
//Cashman refuses to deal with small coins so although the staff member enters a decimal value for the
//cost of the shopping he rounds all of his prices down to the nearest euro and doesn't bother with 50c, 20c, 10c, 5c, 2c or 1c coins.

import java.util.*;
public class Change{
	public static void main (String args[]){

		Scanner keyboard;

		keyboard=new Scanner(System.in);

		double totalCost=0;
		double paid=0;
		double change=0;
		int fifty50;
		int twenty20;
		int ten10;
		int five5;
		int two2;
		int one1;

		System.out.println("What is the total cost?");
		totalCost=keyboard.nextDouble();

		System.out.println("How much has the customer paid?");
		paid=keyboard.nextDouble();

		//process

		fifty50=(int)change/50;
		change=change%50;

		tw

		}

	}