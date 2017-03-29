public class LeapYear{
	//declare vars
	private int year;
	private String message;

	//constructor
	public LeapYear(){
		year=0;
		message="Error";
	}

	//set method
	public void setYear(int year){
		this.year=year;
	}

	//compute
	public void compute(){
		if(year%4==0){
			if(year%100==0){
			message="Is a leap";
			}
			else{
			message="Not a leap";
		}
		}
		else{
			message="Is a leap";
	}
}

	//get
	public String getMessage(){
		return message;
	}


	}