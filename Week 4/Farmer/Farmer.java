/*
Farmer.java
@author F Animashaun
18/03/2017
*/

public class Farmer{

	//variables
	private int numOfEggs;
	private int numOfEggsLeftover;
	private int numOfBoxes;

	public Farmer(){
		numOfEggs=0;
		numOfEggsLeftover=0;
		numOfBoxes=0;
		}

	//setters
	public void setEggs(int numOfEggs){
		this.numOfEggs=numOfEggs;
	}

	//compute
	public void compute(){
		numOfEggsLeftover=numOfEggs%12;
		numOfBoxes=numOfEggs/12;
		}

	//getters
	public int getNumOfEggsLeftover(){
		return numOfEggsLeftover;
	}

	public int getNumOfBoxes(){
		return numOfBoxes;
	}



}