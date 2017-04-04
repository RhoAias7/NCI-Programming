/*
Replace.java
@author F Animashaun
04/04/2017
*/

//develop an application to ask a user for a word and replace the character 'a' with a star.

public class Replace{
	//Data members
	private String name;//hold the name
	private StringBuffer strBuff;//hold the altered word
	private String newName;//hold the new word

	//Constructor
	public Replace(){
		name="";
		newName="";
		strBuff=new StringBuffer();
	}

	//setters
	public void setName(String name){
		this.name=name;
	}

	//Compute
	public void compute(){
		for(int i=0; i<name.length();i++){
			//if the name has a character in the loop with an 'a'
			if(name.charAt(i)=='a'){
				//replace the character with a star
				strBuff.append('*');
			}//closes if
			else{
				//otherwise put the words back together
				strBuff.append(name.charAt(i));
			}//closes else
		}//closes compute
		//grabbing the altered word and converting it back to a whole string and saving it in newName
		newName=strBuff.toString();
	}
	public String getNewName(){
		return newName;
	}
}