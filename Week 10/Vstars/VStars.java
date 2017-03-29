/*
VStars.java
@author F Animashaun
29/03/2017
*/

public class VStars{

	//data members
	private String name;
	private String newName;
	private StringBuffer strBuff;

	//constructor
	public VStars(){
		name="";
		newName="";
		strBuff=new StringBuffer();
	}

	//set method
	public void setName(String name){
		this.name=name;
	}

	//compute
	public void compute(){
		for(int i=0; i<name.length(); i++){
			if(name.charAt(i)=='a'||name.charAt(i)=='A'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u'){
				strBuff.append('*');
			}
			else{
				strBuff.append(name.charAt(i));
			}
		}
		newName=strBuff.toString();
	}

	//get
	public String getNewName(){
		return newName;
	}

	public StringBuffer getStrBuff(){
		return strBuff;
	}
}