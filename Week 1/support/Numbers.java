/*
*Numbers.java
@Author Ayodele Animashaun
1 February 2017
*/

import java.util.Scanner;
public class Numbers{
	public static void main(String[] args){
		//declare vars
		int num1;
		int num2;
		int ans;
		int anws;
		//declare and create object (instantiable classes!)
		Scanner scan;
		scan=new Scanner(System.in);
		//take input
		System.out.println("Please enter a number!");
		num1=scan.nextInt();
		System.out.println("Please enter another number!");
		num2=scan.nextInt();
		//compute/process
		anws=num1+num2;
		ans=num1-num2;

		//output
		System.out.println(num1+" + "+num2+" = "+anws+"!");
		System.out.println(num1+" - "+num2+" = "+ans+"!");


		}









}