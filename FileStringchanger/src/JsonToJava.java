import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JsonToJava 
{
	static Device  jsonObject;
public static Device getJsonObject() throws FileNotFoundException 
{	Gson gson = new Gson();
	FileReader reader = new FileReader("src\\deviceCahceBody.json");
	jsonObject = gson.fromJson(reader, Device.class);
	return jsonObject;
}
public static void setJsonObject(Device jsonObject) {
	JsonToJava.jsonObject = jsonObject;
}
  
}