/*
Customer.java
@ Author F Animashaun
7 Feb 2017
*/
//app to ask the user for their name and for 5 individual numbers
//name and for 5 individual numbers
//then to calculate the sum total

//importing the utility package
import java.util.*;
public class Customer{
	public static void main (String args[]){

		//variables - DEclaring
		String name;
		int number1;
		int number2;
		int number3;
		int number4;
		int number5;
		int sum;

		//assigning variables
		name="";
		number1=0;
		number2=0;
		number3=0;
		number4=0;
		number5=0;
		sum=0;

		//objects
		Scanner keyboard;//bring in the Scanner
		keyboard=new Scanner(System.in);//creating an instance

		//input - so we ask the question
		System.out.println("Please enter your name");
		name=keyboard.nextLine();

		System.out.println("Please enter your first number?");
		number1=keyboard.nextInt();

		System.out.println("Please enter your second number?");
		number2=keyboard.nextInt();

		System.out.println("Please enter your third number?");
		number3=keyboard.nextInt();

		System.out.println("Please enter your fourth number?");
		number4=keyboard.nextInt();

		System.out.println("Please enter your fifth number?");
		number5=keyboard.nextInt();

		//Process
		sum=number1+number2+number3+number4+number5;

		//output -print out message
		System.out.println(" Hello "+name+" your sum total is "+sum);

		}


}