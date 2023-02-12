
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import model.Device;

import java.io.FileWriter;

public class JavaToJson 
{
  public static void main(String[] args) throws Exception 
  {
	  	String filepath = "src\\deviceCahceBody.json";
		JsonToJava ja=new JsonToJava();
		//
	    Device javaObject = ja.getJsonObject(filepath);
	    System.out.println(javaObject.getOwnership().getAccountId());
	    
	    javaObject.setDeviceId("AQAAAAGGLUhN1AAAAAHUBt0C");
	    //javaObject.setSoftware(null);
	    GsonBuilder gsonBuilder = new GsonBuilder().serializeNulls();
	    gsonBuilder.setPrettyPrinting();

	    Gson gson = gsonBuilder.create();

	    // Convert the Java object to a JSON string
	    String json = gson.toJson(javaObject);
	    FileWriter writer = new FileWriter("src\\deviceCahceBody.json");
	    writer.write(json);
	    writer.close();
  }
}
