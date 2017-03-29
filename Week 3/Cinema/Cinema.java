/*
Cinema.java
@ Author F Animashaun
7 Feb 2017
*/

import java.util.*;
public class Cinema{
	public static void main (String args[]){

		final int student;
		final int oap;
		final int child;
		final int adult;
		int noOfStudentTickets;
		int noOfOapTickets;
		int noOfChildTickets;
		int noOfAdultTickets;
		int sum=0;

		student=12;
		oap=10;
		child=7;
		adult=15;

		Scanner keyboard;
		keyboard=new Scanner(System.in);

		System.out.println("How many Student tickets would you like.");
		noOfStudentTickets=keyboard.nextInt();

		System.out.println("How many Oap tickets would you like.");
		noOfOapTickets=keyboard.nextInt();

		System.out.println("How many Child tickets would you like.");
		noOfChildTickets=keyboard.nextInt();

		System.out.println("How many Adult tickets would you like.");
		noOfAdultTickets=keyboard.nextInt();

		sum=(student*noOfStudentTickets)+(oap*noOfOapTickets)+(child*noOfChildTickets)+(adult*noOfAdultTickets);

		System.out.println("This is your total "+sum);
	}
}