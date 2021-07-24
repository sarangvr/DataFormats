package XMLConvertion;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class JavaObjectToXML {

	public static void main(String[] args) {
		try {
			Student student = new Student();
			student.setFirstName("John");
			student.setLastName("Wick");
			student.setMarks(78);
			
			JAXBContext jaxbcontext=JAXBContext.newInstance(Student.class);
			Marshaller marshallerObj=jaxbcontext.createMarshaller();
			
			File file = new File("C:\\Users\\Dell\\Documents\\ECS Eclipse WorkSpace Latest(1)\\DataFormat\\src\\main\\resources\\student.xml");
			
			marshallerObj.marshal(student, file);
			
		}catch(Exception e) {e.printStackTrace();}

	}

}
