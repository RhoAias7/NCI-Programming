/*GreenBottle.java
@author F Animashaun
21/03/17
*/

//create an applicaiton for the song 10 green bottles.

public class GreenBottle{
	public static void main(String args[]){
		for(int b=10;b>=0;b=b-1){
			System.out.println(b+ " green bottles hanging on the wall");
			System.out.println(b+ " green bottles hannign on the wall");
			System.out.println("but if one green bottle should accidently fall");
			if((b-1)==0){
			System.out.println("There should be no bottles haning on the wall");
			}
			else{
			System.out.println("There'd be "+(b-1)+"Green bottle on the wall");
			}
		}
	}
}