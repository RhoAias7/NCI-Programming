/*
Reverse.java
@author F Animashaun
28/03/2017
*/

//Develop and application that accepts a word from a user and prints the letters for the word in reverse order.
//Call the application Reverse. Use instansible classes

public class Reverse{

	//data members
	private String word,newWord;
	private StringBuffer strBuff;


	//constructor
	public Reverse(){
		word="";
		strBuff=new StringBuffer();

	}

	//set method
	public void setWord(String word){
		this.word=word;
		}

	//compute
	public void compute(){
		for(int i=word.length()-1; i>=0; i--){
			strBuff.append(word.charAt(i));			;
		}
		newWord=strBuff.toString();
	}

	//get method
	public String getNewWord(){
		return newWord;
	}


}