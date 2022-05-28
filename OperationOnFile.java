import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;
public class OperationOnFile {
	
	public static void CreateMainFolder(String foldName) {
		File file = new File(foldName);
		if(!file.exists()) {
			file.mkdirs();
		    }
		}
	
	public static void CreateFile(String name) {
		CreateMainFolder("/Users/essehalagahkomlavi/Desktop/ess");
		Path pathOfFolder = Paths.get("/Users/essehalagahkomlavi/Desktop/ess/" + name);
		try {
		Files.createDirectories(pathOfFolder.getParent());
		Files.createFile(pathOfFolder);
		System.out.println(name +" file created successfully");
			
	} catch(IOException ex) {
		System.out.println("Failed to create the file" + name);
	}		
}
	
	
	public static void RetriveInAacendingOrder() {
		File file;
		File[] paths;
		file = new File("/Users/essehalagahkomlavi/Desktop/ess");
		paths = file.listFiles();
		List<File> listFile = Arrays.asList(paths);
		Collections.sort(listFile);
		for(File path: paths) {
			//print the each file name
			System.out.println("|==== " + path.getName());
		}
		
	}
	public  static void  DeleteFile(String path) {
		CreateMainFolder("/Users/essehalagahkomlavi/Desktop/ess");
		Path pathOfFolder = Paths.get("/Users/essehalagahkomlavi/Desktop/ess/" + path);
		try {
		Files.createDirectories(pathOfFolder.getParent());
		Files.delete(pathOfFolder);	
		System.out.println("File Deleted Successfully!");
			}catch (IOException ex) {
				System.out.println("File Not Found");
			  }	
						   
			}
		

	
	public static void SearchForFile(  String fileName) {
		
		File file = new File("/Users/essehalagahkomlavi/Desktop/ess");
		File[] cile = file.listFiles();
     boolean found = false;
		for(File fill : cile) {
			if(fill.getName().startsWith(fileName)) 
				System.out.println("File Found!!!");	
		      found = true;
		
		    }
		if(found == false) 
	        	System.out.println("File Not Found");	 
		}
		
    }


	