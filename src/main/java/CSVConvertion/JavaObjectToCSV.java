package CSVConvertion;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;

public class JavaObjectToCSV {

	public static void main(String[] args) {
		
		final String location="C:\\Users\\Dell\\Documents\\ECS Eclipse WorkSpace Latest(1)\\DataFormat\\src\\main\\resources\\Books.csv";
		
		try {
			FileWriter writer = new FileWriter(location);
			
			List<Book> bookList=new ArrayList<>();
			
			Book b1 = new Book("Super Man","mavel",80,543);
			Book b2 = new Book("Spider Man","mavel",200,234);
			Book b3 = new Book("Bat Man","DC Comics",135,678);
			Book b4 = new Book("Iron Man","mavel",152,299);
			Book b5 = new Book("The Incredible Hulk","Universal pictures",231,543);
			Book b6 = new Book("Hulk","Marvel Studios",100,200);
			
			bookList.add(b1);
			bookList.add(b2);
			bookList.add(b3);
			bookList.add(b4);
			bookList.add(b5);
			bookList.add(b6);
			
			ColumnPositionMappingStrategy<Book> mappingStrategy=new ColumnPositionMappingStrategy<>();
			mappingStrategy.setType(Book.class);
			
			String[] columns = new String[] 
					{"name","authorName","NoOfPages","price"};
			mappingStrategy.setColumnMapping(columns);
			
			StatefulBeanToCsvBuilder<Book> builder=new StatefulBeanToCsvBuilder<Book>(writer);
			StatefulBeanToCsv<Book> beanWriter=builder.withMappingStrategy(mappingStrategy).build();
			
			beanWriter.write(bookList);
			writer.close();
			
			
		}catch(Exception e) {e.printStackTrace();}

	}

}
