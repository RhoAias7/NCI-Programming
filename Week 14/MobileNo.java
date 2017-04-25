//Develop an application that allows the user to enter a string that represents a mobile phone number and tests to see that the number is valid mobile number. A valid mobile number begins with either 083, 086, 087 and is exactly 10 character long.

/*
MobileNo.java
@author F Animashaun
25/04/17
*/

public class MobileNo{
	//data members
	private String mobilePhoneNo;
	private boolean valid;

	//constructor
	public MobileNo(){
		String mobilePhoneNo;
	}

	//set method
	public void setMobilePhoneNo(String mobilePhoneNo){
		this.mobilePhoneNo=mobilePhoneNo;
	}

	//compute
	public void compute(){
		if(mobilePhoneNo.length()==10){
			if(mobilePhoneNo.charAt(0)=='0' && mobilePhoneNo.charAt(1)=='8'){
				if(mobilePhoneNo.charAt(2)=='3' || mobilePhoneNo.charAt(2)=='6' || mobilePhoneNo.charAt(2)=='7'){
					valid=true;
				}

				else{
					valid=false;
				}
			}
		}
	}

	public boolean getValid(){
		return valid;
	}
}