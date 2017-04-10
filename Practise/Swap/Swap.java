/*
Swap.java
@author F Animashaun
07/04/2017
*/

public class Swap{

	//data members
	private String usersWord;
	private String resultant;
	private StringBuffer buff;

	//constructor
	public Swap(){
			usersWord="";
			resultant="";
			buff=new StringBuffer();
	}

	//set
	public void setUsersWord(String usersWord){
		this.usersWord=usersWord;
	}

	//compute
	public void compute(){
		for(int i=0; i<usersWord.length(); i++){

		}
		resultant=buff.toString();
	}

	//get
	public String getResultant(){
		return resultant;
	}
}