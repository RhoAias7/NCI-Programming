/*
Months.java
@Author F Animashaun
28/02/17
*/

public class Months{

	//data members
	private int month;
	private String message;

	//Constructor
	public Months(){
		month=0;
		};

	//setters
	public void setMonths(int month){
		this.month=month;
		}

	//compute
	public void compute(){
		if(month==1||month==5||month==7||month==8||month==10||month==12||month==3){
			message="There are 31 days in that month.";
		}
		else if(month==4||month==6||month==9||month==11){
			message="There are 30 days in that month.";
			}
		else{
			message="There are 28 days in that month.";
			}
		}

	//getters
	public String getMessage(){
		return message;
		}


	}