/*
Cinema.java
@Author F Animashaun
28/02/17
*/

public class Cinema{

	//data memebers
	private int age; //hold the age coming in from the user
	private String message; //hold the message being sent ot to the user

	//Constructor
	public Cinema(){
		age=0;
	}

	//setters
	public void setAge(int age){
		this.age=age;
	}

	//compute
	public void compute(){
		if(age<=5||age>=60){
			message="Your admission is free";
		}
		else if(age>5&&age<=14){
			message="Your admission is 5 euros";
		}
		else{
			message="Your admission is 10 euros";
		}

		}

	//getters
	public String getMessage(){
		return message;
		}


	}

