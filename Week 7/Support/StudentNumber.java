public class StudentNumber{

	//variables
	private String studentNo;
	private String message;

	//constructor
	public StudentNumber(){
		studentNo = "";
		message = "";
		}
	//setters
	public void setStudentNo(String studentNo){
		this.studentNo=studentNo;
		}
	public void setMessage(String message){
		this.message=message;
		}
	//compute
	public void compute(){
		if(studentNo.length() == 9){
			if(studentNo.charAt(0) == 'x' || studentNo.charAt(0) == 'X'){
				message = "Student number is valid";
				}
				else{
					message = "Student number is not valid";
					}
				}
			else{
				message = "Student is not 9 characters";
				}
		}

		//get methods
		public String getStudentNo(){
			return studentNo;
		}

		public String getMessage(){
			return message;
		}


	}