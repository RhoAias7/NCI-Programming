/*
Farmer.java
@author F Animashaun
17/02/2017
*/

//John the farmer has tasked his son with collecting the eggs from the chicken
//coop each morning and putting them in boxes of 1 dozen eggs each. Unfortunately
//Johns son Joe is having trouble working out how many boxes he will need each morning.
//You have been asked to develop a java application to allow Joe to enter the number of
//eggs he has collected.  The application should then calculate and output how many boxes
//can be filled and how many eggs Joe will have leftover.

//Your application should use instantiable classes to separate the calculations from the user input and output.

//*Hint: there are 12 eggs in 1 dozen



public class Farmer{

	//declare variables

	//This variable will be my input
	private int numOfEggs;

	//These varibles will be my outputs
	private int numOfBoxes;
	private int numOfLeftovers;

	//constructor
	public Farmer(){
		numOfEggs=0;
		numOfBoxes=0;
		numOfLeftovers=0;
		}

	//set methods
	public void egg(int numOfEggs){
		this.numOfEggs=numOfEggs;
		}

	public void eggsLeft(int numOfLeftovers){
		this.numOfLeftovers=numOfLeftovers;
		}

	//compute
	public void compute(){
		numOfLeftovers=numOfEggs%12;
		numOfBoxes=numOfEggs/12;
		}

	//get method
	public int getNumOfBoxes(){
	return numOfBoxes;
			}

	public int getNumOfLeftovers(){
	return numOfLeftovers;
			}




	}