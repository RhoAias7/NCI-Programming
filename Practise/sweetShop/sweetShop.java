/*
sweetShop.java
@Author A Animashaun
@23 Feb 2017
*/

//utility package
import java.util.*;
public class sweetShop{
	public static void main(String args[]){

		//declare variables
		//Double is used to hold decimal or cost
		double icecreamCost; //This holds the cost of the icecream
		double lolliesCost; //This holds the cost of the lollies
		int icecream; //This will store the user input for the icecream
		int lollies; //This will store the user input for the lollies
		double sum; //store the sum which is probably going to be a decimal

		//assign variables
		icecreamCost=6.20;
		lolliesCost=1.50;
		icecream=0;
		lollies=0;
		sum=0;

		//objects
		//Declaring an object and giving it a name
		//Scanner is part of the utility package
		//1. Bringing in the Scanner class
		//2. Give it a name
		//3. Create a copy of it so that we can use it
		Scanner keyboard;

		//Assign
		keyboard=new Scanner(System.in);//allow for user input

		//Ask the user a question
		System.out.println("How many lollies would you like?");
		//storing the next interger that comes in via the user
		lollies=keyboard.nextInt();

		System.out.println("How many icecreams would you like?");
		icecream=keyboard.nextInt();

		//process - calculations
		sum=(lollies*lolliesCost)+(icecream*icecreamCost);

		System.out.println("The total cost of your shopping is"(sum));





		}


	}