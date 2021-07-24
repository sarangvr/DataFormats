package CSVConvertion;

import java.io.FileReader;
import java.util.Arrays;
import java.util.List;
import com.opencsv.CSVReader;

public class CSVToJavaObject {

	public static void main(String[] args) throws Exception {
		
		String fileName="C:\\Users\\Dell\\Documents\\ECS Eclipse WorkSpace Latest(1)\\DataFormat\\src\\main\\resources\\Books.csv";
		
		try(CSVReader csvreader = new CSVReader(new FileReader(fileName))) {
			
			List<String[]> read = csvreader.readAll();
			read.forEach( x-> System.out.println(Arrays.toString(x)));
			
		}

	}

}
