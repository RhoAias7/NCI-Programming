/*
Encode.java
@author F Animashaun
*/

public class Encode{
	//declare vars
	private String userInput;
	private String encoded;
	private StringBuffer buff;

	//constructor
	public Encode(){
		userInput="";
		encoded="";
	 	buff=new StringBuffer();

	}

	//set
	public void setUserInput(String userInput){
		this.userInput=userInput;
	}

	public void compute(){
		for(int i=0; i<userInput.length(); i++){
			if(userInput.charAt(i)=='a'){
				buff.append('!');
			}
			else if(userInput.charAt(i)=='e'){
				buff.append('"');
			}
			else if(userInput.charAt(i)=='i'){
				buff.append('£');
			}
			else if(userInput.charAt(i)=='o'){
				buff.append('$');
			}
			else if(userInput.charAt(i)=='u'){
				buff.append('0');
			}
			else{
				buff.append(userInput.charAt(i));
			}
		}
		encoded=buff.toString();
	}

	public String getEncoded(){
		return encoded;

	}
}