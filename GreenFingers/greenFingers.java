/*
greenFingers.java
@Author A Animashaun
@31 Jan 2017
*/

import java.util.*;
public class greenFingers{
	public static void main(String arg[]){

		double flowersCost;
		double seedsCost;
		double treesCost;
		double shovelCost;
		int flowers;
		int seeds;
		int trees;
		int shovel;
		double sum;

		flowersCost=5.20;
		seedsCost=1.40;
		treesCost=10.90;
		shovelCost=9.99;
		flowers=0;
		seeds=0;
		trees=0;
		shovel=0;
		sum=0;

		Scanner keyboard;

		keyboard=new Scanner(System.in);

		System.out.println("How many flowers would you like?");
		flowers=keyboard.nextInt();

		System.out.println("How many seeds would you like?");
		seeds=keyboard.nextInt();

		System.out.println("How many trees would you like?");
		trees=keyboard.nextInt();

		System.out.println("How many shovel would you like?");
		shovel=keyboard.nextInt();

		sum=(flowers*flowersCost)+(seeds*seedsCost)+(trees*treesCost)+(shovel*shovelCost);

		System.out.println("The total cost of your shopping is "+(sum));





		}







	}