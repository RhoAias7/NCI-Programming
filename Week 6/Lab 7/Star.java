/*Star.java
@author F Animashaun
10/03/2017
*/

public class Star{

	//Data members
	private String month;
	private int date;
	private String star;

	//constructor
	public Star(){
		month="";
		date=0;
		star="";
	}

	//setters
	public void setMonth(String month){
		this.month=month;
	}
	public void setDate(int date){
		this.date=date;
	}

	//compute
	public void compute(){
		if(month.equalsIgnoreCase("January")){
			if(date>=1 || date<=19){
				star="Capricorn";
			}
			else if(date>=20 || date<=31){
				star="Aquarius";
			}
			else{
				star="error 404";
			}
		}

		else if(month.equalsIgnoreCase("February")){
					if(date>=1 || date<=18){
						star="Aquarius";
					}
					else if(date>=19 || date<=28){
						star="Pisces";
					}
					else{
						star="error 404";
					}
		}

		else if(month.equalsIgnoreCase("March")){
							if(date>=1 || date<=20){
								star="Pisces";
							}
							else if(date>=21 || date<=31){
								star="Aries";
							}
							else{
								star="error 404";
							}
		}

		else if(month.equalsIgnoreCase("April")){
									if(date>=1 || date<=19){
										star="Aries";
									}
									else if(date>=21 || date<=30){
										star="Taurus";
									}
									else{
										star="error 404";
									}
		}

		else if(month.equalsIgnoreCase("May")){
									if(date>=1 || date<=20){
										star="Taurus";
									}
									else if(date>=21 || date<=31){
										star="Gemini";
									}
									else{
										star="error 404";
									}
		}

		else if(month.equalsIgnoreCase("June")){
									if(date>=1 || date<=20){
										star="Gemini";
									}
									else if(date>=21 || date<=31){
										star="Cancer";
									}
									else{
										star="error 404";
									}
		}

		else if(month.equalsIgnoreCase("July")){
									if(date>=1 || date<=22){
										star="Cancer";
									}
									else if(date>=23 || date<=31){
										star="Leo";
									}
									else{
										star="error 404";
									}
		}

		else if(month.equalsIgnoreCase("August")){
									if(date>=1 || date<=22){
										star="Leo";
									}
									else if(date>=23 || date<=31){
										star="Virgo";
									}
									else{
										star="error 404";
									}
		}

		else if(month.equalsIgnoreCase("September")){
									if(date>=1 || date<=22){
										star="Virgo";
									}
									else if(date>=23 || date<=30){
										star="Libra";
									}
									else{
										star="error 404";
									}
		}

		else if(month.equalsIgnoreCase("October")){
									if(date>=1 || date<=22){
										star="Libra";
									}
									else if(date>=21 || date<=31){
										star="Scopio";
									}
									else{
										star="error 404";
									}
		}

		else if(month.equalsIgnoreCase("November")){
									if(date>=1 || date<=21){
										star="Scopio";
									}
									else if(date>=22 || date<=30){
										star="Saggitarius";
									}
									else{
										star="error 404";
									}
		}

		else if(month.equalsIgnoreCase("December")){
									if(date>=1 || date<=21){
										star="Saggitarius";
									}
									else if(date>=21 || date<=31){
										star="Capricorn";
									}
									else{
										star="error 404";
									}
		}
		else{
			star="Try again";
		}
	}
	//getters
	public String getStar(){
		return star;
	}


















}