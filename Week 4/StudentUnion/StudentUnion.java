/*
StudentUnion.java
@author F Animashaun
14 Feb 2017
*/

public class StudentUnion{

	private int noOfShirts;
	private int noOfHoodies;
	private int noOfCaps;
	private double shirtCost;
	private double hoodyCost;
	private double capCost;
	private int total;

	public StudentUnion(){
			noOfShirts=0;
			noOfHoodies=0;
			noOfCaps=0;
			shirtCost=10;
			hoodyCost=20;
			capCost=5;
			total=0;
		}

	public void setNoOfShirts(int noOfShirts){
				this.noOfShirts=noOfShirts;
			}

	public void setNoOfHoodies(int noOfHoodies){
				this.noOfHoodies=noOfHoodies;
			}

	public void setNoOfCaps(int noOfCaps){
					this.noOfCaps=noOfCaps;
			}

	public void setShirtCost(int shirtCost){
					this.shirtCost=shirtCost;
			}

	public void setHoodyCost(int hoodyCost){
					this.hoodyCost=hoodyCost;
			}

	public void setCapCost(int capCost){
						this.capCost=capCost;
			}

	public int getTotal()
				{
					return total;

				}





	}