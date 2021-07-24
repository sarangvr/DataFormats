package XMLConvertion;
import java.io.File; 

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import XMLConvertion.Student;

public class XMLToJavaObject {

	public static void main(String[] args) {
		try {
			File file = new File("C:\\Users\\Dell\\Documents\\ECS Eclipse WorkSpace Latest(1)\\DataFormat\\src\\\\main\\resources\\student.xml");
			JAXBContext jaxbContext=JAXBContext.newInstance(Student.class);
			
			Unmarshaller unmarshallerObj=jaxbContext.createUnmarshaller();
			
			Student student=(Student) unmarshallerObj.unmarshal(file);
			
			System.out.println("First Name is "+student.getFirstName());
			System.out.println("Last Name is "+student.getLastName());
			System.out.println("Marks is "+student.getMarks());
			
		}catch(Exception e) {e.getStackTrace();}

	}

}
