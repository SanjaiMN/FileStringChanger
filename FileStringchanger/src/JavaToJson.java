
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class JavaToJson 
{
  public static void main(String[] args) throws Exception {
	 JsonToJava ja=new JsonToJava();
    Device javaObject = ja.getJsonObject();
    javaObject.setDeviceId("AQAAAAGGLUhN1AAAAAHUBt2C");
    GsonBuilder gsonBuilder = new GsonBuilder();
    gsonBuilder.setPrettyPrinting();

    // Create a Gson object from the GsonBuilder
    Gson gson = gsonBuilder.create();

    // Convert the Java object to a JSON string
    String json = gson.toJson(javaObject);
    FileWriter writer = new FileWriter("src\\deviceCahceBody.json");
    writer.write(json);
    writer.close();
  }
}
