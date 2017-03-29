/*
Theatre.java
@author F Animashaun
27/03/2017
*/

public class Theatre{

	//declare data memebers
	private String day;
	private int age;
	private int price;

	//constructor
	public Theatre(){
		day=new String();
		price=0;
		age=0;
	}

	//set method
	public void setDay(String day){
		this.day=day;
	}

	public void setAge(int age){
		this.age=age;
	}

	//compute
	public void compute(){
		if(day.equals("Monday")||day.equals("Tuesday")||day.equals("Wednesday")||day.equals("Thursday")){
			if(age<5||age>65){
				price=0;
			}

			else if(age>=5&&age<=15){
				price=15;
			}
			else{
				price=20;
			}
		}

		else if(day.equals("Friday")||day.equals("Saturday")||day.equals("Sunday")){
			if(age<5||age>65){
				price=5;
			}
			else if(age>=5&&age<=15){
				price=20;
			}
			else{
				price=30;
			}
		}

		else{
			price=-1;//error in the input
		}
	}

	//get method
	public int getPrice(){
		return price;
	}
}