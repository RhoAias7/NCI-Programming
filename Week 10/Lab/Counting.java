/*
Counting.java
@author F Animashaun
31/03/2017
*/

public class Counting{

	//data members
	private String sentence;
	private int numOfVowels;
	private int numOfConstants;
	private int numOfSpaces;


	//constructor
	public Counting(){
		sentence="";
		numOfVowels=0;
		numOfConstants=0;
		numOfSpaces=0;
	}

	//set method
	public void setSentence(String sentence){
		this.sentence=sentence;
	}

	//compute
	public void compute(){
		for(int i=0; i<sentence.length(); i++){
			if(sentence.charAt(i)=='a'||sentence.charAt(i)=='e'||sentence.charAt(i)=='i'||sentence.charAt(i)=='o'||sentence.charAt(i)=='u'){
				numOfVowels++;
			}
			else if(sentence.charAt(i)==' '){
				numOfSpaces++;
			}
			else{
				numOfConstants++;
			}
		}
	}

	//get method
	public int getNumOfVowels(){
		return numOfVowels;
	}
	public int getNumOfConstants(){
		return numOfConstants;
	}
	public int getNumOfSpaces(){
		return numOfSpaces;
	}




}