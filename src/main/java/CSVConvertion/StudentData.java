package CSVConvertion;
//CSVToJavaObject
public class StudentData {
	
	public String name;
	public int id;
	public double Marks;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getMarks() {
		return Marks;
	}
	public void setMarks(double marks) {
		Marks = marks;
	}
	@Override
	public String toString() {
		return "StudentData [name=" + name + ", id=" + id + ", Marks=" + Marks + "]";
	}
	
	
	
	

}
