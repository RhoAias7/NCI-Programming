/*AllNumbers.java
@author Yo
21/02/17
*/


public class AllNumbers{
	public static void main(String args[]){
	//loops

	int sum=0;
	//Display numbers from 0 to 10 inclusive
	//creating a variable called i to store the counter
	//1. Initialisation - start the loop at zero
	//2. Termination - where it ends (<=10)
	//3. Progression -go up in ones (i=i+1) or (i++)
	//4.Action - Print out the counter
	for(int i=0;i<=10;i++){
		System.out.println(i);
	}

	//display numbers from 10 to 0 inclusive
	for(int j=10;j>=0;j=j-1){
		System.out.println(j);
	}

	//while loop that displays the following numbers
	//10, 20, 30, 40, 50
	int k=10;
	while(k<=50){
		System.out.println(k);
		k=k+10;
	}

	//while loop that displays the following numbers
	//100,90,80,70,60
	int h=100;
	while(h>=60){
		System.out.println(h);
		h=h-10;
	}

	//for loop that calculates the sum of numbers between 1 and 10
	for(int f=0;f<=10;f=f+1){//start the counter at 0
	//end the counter at 10;
		sum=sum+f; //add the counter into the sum
	}//end the loop

	System.out.println(sum); //print out the sum







}
}