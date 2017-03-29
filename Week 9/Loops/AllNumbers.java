/*
AllNumbers.java
@Author F Animashaun
21/03/2017
*/

public class AllNumbers{
	public static void main(String args[]){

		//Display numbers from 0 to ten inclusive
		//creating a variable called i to store the counter
		//1. Initialisation start the loop at [zero]
		//2. Termination - where it ends [<=10]
		//3. Progression - go up in ones [i=i+1]
		//4. Action - print out the counter
		for(int i=0; i<11; i=i+1){
			System.out.println(i);
		}

		//Display numbers from 10 to 0 inclusive
		for(int q=10; q>-1; q=q-1){
			System.out.println(q);
		}

		//While loop that displays the following numbers
		//10, 20, 30, 40, 50
		int w=10;
		while(w<=50){
			System.out.println(w);
			w=w+10;
			}

		//while loop that displays the following numbers
		//100, 90, 80, 70, 60
		int e=100;
		while(e>=0){
			System.out.println(e);
			e=e-10;
			}

		//For loop that calculates the sum of numbers between 1 and 10
		int sum=0;
		for(int r=0; r<=10; r++){//start the counter at 0 end the counter at 10 and go up in one's
			sum=sum+r;//add the counter into the sum
			}//end the loop
			System.out.println(sum);//print ount the sum
	}





}