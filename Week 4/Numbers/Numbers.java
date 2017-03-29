/*
Numbers.java
@author F Animashaun
14 Feb 2017
*/

//1. Class signature - Creates an application
public class Numbers{

	//2. Data members i.e variables
	private int num1;
	private int num2;
	private int total;

	//3. Constructor
	public Numbers(){//when we link documents together, its important for making this happen.
		num1=0;
		num2=0;
		total=0;

		}

		//Setter - i.e inputs
		//For every input you have, you have a setter
		public void setNum1(int num1){ //pulling in num1 from app class
			this.num1=num1; //the variable in here called num1 is the same
			//as num1 in the app class

			}
		public void setNum2(int num2){
			this.num2=num2;
			}

			//compute
			public void compute(){
				total=num1*num2;
				}

			//get - i.e inputs
			//for every output, you have a getter
			public int getTotal() //gets total from above
			{
				return total; //returns to app class


				}







	}