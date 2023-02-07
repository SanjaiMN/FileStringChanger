
import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;

public class JavaToJson {
  public static void main(String[] args) throws IOException {
    Example javaObject = new Example();
    // Set values for the fields in the Example class

    Gson gson = new Gson();
    String json = gson.toJson(javaObject);

    FileWriter writer = new FileWriter("src\\example.json");
    writer.write(json);
    writer.close();
  }
}

class Example 
{
	int age;
	String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void getBoth()
	{
		System.out.println(this.age+" "+this.name);
	}
}