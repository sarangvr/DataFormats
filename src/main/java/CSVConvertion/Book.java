package CSVConvertion;
//JavaObjectToCSV
public class Book {
	public String name;
	public String authorName;
	public int NoOfPages;
	public double price;
	public Book(String name, String authorName, int noOfPages, double price) {
		super();
		this.name = name;
		this.authorName = authorName;
		NoOfPages = noOfPages;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getNoOfPages() {
		return NoOfPages;
	}
	public void setNoOfPages(int noOfPages) {
		NoOfPages = noOfPages;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
