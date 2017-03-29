/*
Lotto.java
@author F Animashaun
22/03/2017
*/

public class Lotto{
	//declare vars
	private int l1,l2,l3;//random numbers
	private int g1,g2,g3;//guesses
	private int correct;//number guessed correctly
	//constructor
	public Lotto(){
		l1=0;
		l2=0;
		l3=0;
		g1=0;
		g2=0;
		g3=0;
		correct=0;
	}
	//set
	public void setG1(int g1){
		this.g1=g1;
	}
	public void setG2(int g2){
		this.g2=g2;
	}
	public void setG3(int g3){
		this.g3=g3;
	}
	//compute
	public void compareNumbers(){
		l1=(int)((Math.random()*3)+1);
		l2=(int)((Math.random()*3)+1);
		l3=(int)((Math.random()*3)+1);
		if(g1==l1 || g1==l2 || g1==l3){
			//correct=correct+1;
			correct++;
		}
		if(g2==l1 || g2==l2 || g2==l3){
			//correct=correct+1;
			correct++;
		}
		if(g3==l1 || g3==l2 || g3==l3){
			//correct=correct+1;
			correct++;
		}

	}
	//get method
	public int getCorrect(){
		return correct;
	}
}
