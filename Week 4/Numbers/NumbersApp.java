/*
NumberApp.java
@ author F Animashaun
14 Feb 2017
*/
import java.util.*;//scanner
public class NumbersApp{
	public static void main(String args[]){

		//variables
		int num1;
		int num2;
		int total;

		//objects
		Scanner keyboard;
		keyboard=new Scanner(System.in);

		Numbers myNumbers; //brining in file and give it a name
		myNumbers=new Numbers(); //now talking to each other

		//input
		System.out.println("Please enter your first number"); //ask the question
		num1=keyboard.nextInt(); //store the answer
		myNumbers.setNum1(num1); //go out to the intan class and
		//send across num 1

		System.out.println("Please enter your second number");
		num2=keyboard.nextInt();
		myNumbers.setNum2(num2);

		//process
		myNumbers.compute(); //go out to my instan class and run the calculations

		//output
		total=myNumbers.getTotal(); // go out to myNumber instan class// and get the total and store it in this total
		System.out.println("your total is "+total);



		}
	}