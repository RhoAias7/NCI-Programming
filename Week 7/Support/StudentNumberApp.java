import javax.swing.JOptionPane;
public class StudentNumberApp{
	public static void main(String[] args){

	String studentNo;
	String message;

	StudentNumber student;
	student=new StudentNumber();

	studentNo=JOptionPane.showInputDialog(null, "Please enter your student number");
	student.setStudentNo(studentNo);

	student.compute();

	message=student.getMessage();
	JOptionPane.showMessageDialog(null, "Here you go:"+message);

	}
}