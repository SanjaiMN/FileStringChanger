import com.google.gson.*;

import model.Device;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class JsonToJava 
{
	//getting json file as input and returning java object.
	public Device getJsonObject(String filepath) throws FileNotFoundException 
	{	
		Device jsonObject=new Device();
		Gson gson = new Gson();
		FileReader reader = new FileReader(filepath);
		jsonObject = gson.fromJson(reader, Device.class);
		//System.out.println(jsonObject);
		return jsonObject;
	}
}