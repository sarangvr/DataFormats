package JSONConversion;

public class Student {
	private String studentName;
	private String collegeName;
	private int registerNumber;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public int getRegisterNumber() {
		return registerNumber;
	}
	public void setRegisterNumber(int registerNumber) {
		this.registerNumber = registerNumber;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", collegeName=" + collegeName + ", registerNumber="
				+ registerNumber + "]";
	}
	
	

}
