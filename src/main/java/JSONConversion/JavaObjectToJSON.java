package JSONConversion;

import com.google.gson.Gson;

public class JavaObjectToJSON {

	public static void main(String[] args) {
		
		Student student = new Student();
		Gson gson = new Gson();
		
		student=getStudentData(student);
		
		System.out.println("Json Convertion Result ");
		System.out.println(gson.toJson(student));

	}
	
	public static Student getStudentData(Student student) {
		
		student.setStudentName("John Wick");
		student.setCollegeName("Hollywood");
		student.setRegisterNumber(1988);
		return student;
		
	}

}
