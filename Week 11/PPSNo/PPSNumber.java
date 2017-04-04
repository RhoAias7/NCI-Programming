//PPSNumber
//Develope an application that asks the user for a PPS number. A valid PPS number is 7 in length (This should include a vowel).
//Make sure the vowel is at the end
//That the number 1,2,3

public class PPSNumber{

	//Data members
	private String letter;//hold the PPS number
	private boolean validity;//True or false

	//Constructor
	public PPSNumber(){
		letter="";
	}

	public void setLetter(String letter){
		this.letter=letter;
	}


	//compute
	public void compute(){
		//check if the letter has a length of 8
		if(letter.length()==8){

			//if the letter has a character at index zero and it's = to 1
			if(letter.charAt(0)=='1'||letter.charAt(1)=='2'||letter.charAt(2)=='3'){
		if(letter.charAt(letter.length()-1)=='u'||letter.charAt(letter.length()-1)=='o'||letter.charAt(letter.length()-1)=='e'||letter.charAt(letter.length()-1)=='i'||letter.charAt(letter.length()-1)=='a'){

					validity=true;
				}
				else{
					validity=false;
				}
			}
		}
	}
	public boolean getValidity(){
		return validity;
	}

	}