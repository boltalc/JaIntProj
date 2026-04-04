import java.io.*;
import java.util.*;
public class FileMan{
    public static void main(String args[]){
	int wordCount = 0;

	try{
	    BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
	    String line = reader.readLine();

	    String[] words = line.trim().split("\\s");
	    
		if(!line.trim().isEmpty()){
		    wordCount += words.length;
		}
	    reader.close();

	    BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
	    writer.write("Word Count: " + wordCount);
	    writer.close();
	}catch(FileNotFoundException e){
	    System.out.println("Input file not found.");
	}catch(IOException e){
	    System.out.println("Error reading or writing file.");
	}
    }
}
