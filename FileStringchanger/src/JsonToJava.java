import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.FileReader;
import java.io.IOException;

public class JsonToJava {
  public static void main(String[] args) throws IOException {
    Gson gson = new Gson();
    FileReader reader = new FileReader("src\\example.json");
    Example jsonObject = gson.fromJson(reader, Example.class);
    jsonObject.getBoth();
  }
}