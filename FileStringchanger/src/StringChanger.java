import java.util.*;
import java.io.*;


public class StringChanger {

	public static void main(String[] args) 
	{
	    try 
	    {
	      File file = new File("src\\deviceCahceBody.json");
	      BufferedReader reader = new BufferedReader(new FileReader(file));
	      Scanner sc = new Scanner(System.in);
	      String line = "", oldText = "", newText = "A";
//	      System.out.println("Enter the string that needs to be replaced:");
//	      oldText=sc.next();
	      System.out.println("Enter the new device id:");
	      newText=sc.next();
	      StringBuilder content = new StringBuilder();
	      while((line = reader.readLine()) != null) {
	        content.append(line).append(System.lineSeparator());
	      }

	      reader.close();

	      String updatedContent = content.toString().replaceAll("\\b"+oldText+"\\b", newText);
	      System.out.println(updatedContent);
	      BufferedWriter writer = new BufferedWriter(new FileWriter(file));
	      writer.write(updatedContent);
	      writer.close();
	    }
	    catch (FileNotFoundException e) 
	    {
	        e.printStackTrace();
	      } catch (IOException e) {
	        e.printStackTrace();
	      }
	}
}
