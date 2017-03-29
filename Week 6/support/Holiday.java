/*
Holiday.java
@author F Animashaun
01/03/17
*/

public class Holiday{

	//declare var
	private String season, answer;
	private int people, cost;

	//constructor
	public Holiday(){
		season="";
		people=0;
		cost=0;
	}

	//setter
	public void setSeason(String season){
		this.season=season;
	}

	public void setPeople(int people){
		this.people=people;
	}

	public void compute(){
		if(season.equalsIgnoreCase("Winter")){
			if(people>0 && people<5){
				cost=300;
			}
			else if(people>=5){
				cost=200;
			}
		}

		if(season.equalsIgnoreCase("Spring")){
			if(people>0 && people<5){
				cost=400;
			}
			else if(people>=5){
				cost=300;
			}
		}

		if(season.equalsIgnoreCase("Summer")){
			if(people>0 && people<5){
				cost=600;
			}
			else if(people>=5){
				cost=500;
			}
		}

		if(season.equalsIgnoreCase("Autumn")){
			if(people>0 && people<5){
				cost=500;
			}
			else if(people>=5){
				cost=400;
			}
		}

	}

	//get
	public int getCost(){
			return cost;
		}
}
