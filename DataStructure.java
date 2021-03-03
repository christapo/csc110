import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.SortedMap;
import java.util.TreeMap;

public class DataStructure {
	public static void main(String[] args) throws IOException {
		
		var fileName = "C:\\school\\CSC110\\W6Homework\\Sample500.csv";
		var filePath = Paths.get(fileName);

		if(!Files.exists(filePath)){		
			System.out.println("**** Error: Could not find the file in the path "+ fileName);
			return;
		}	
		System.out.println("Success:  file was found in the path "+ fileName);
		
		var bufferReader = Files.newBufferedReader(filePath); 
		var dataLine = bufferReader.readLine(); 
		if(dataLine == null){ 
			System.out.println("Success:  There is no data in the file"+ fileName);
			bufferReader.close();
			return;
		}
		System.out.println("Data : "+ dataLine);

		
		var userList = new ArrayList<String>();
		


		 
		var arrayList  = new ArrayList<String>();  //using ArrayList data structure
		for (var userData : userList) {  
			arrayList.add(userData) ;
		}          
		
		var arrayElementsCount = arrayList.size();
		System.out.println("The Size of the elements = "+ arrayElementsCount);
		 
		var sortedMap  = new TreeMap<String, String>(); //using TreeMap data structure
		for (var userData : userList) {  
			var dataElement = userData.split(",");
			sortedMap.put(dataElement[2], userData);
		} 

		   
		//still needs sorting and sum, average, etc.

	}
}
