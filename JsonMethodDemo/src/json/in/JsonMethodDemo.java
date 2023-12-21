package json.in;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.HashMap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class JsonMethodDemo {
	public static void main(String[] args) throws FileNotFoundException {
		FileReader read=new FileReader("C:\\Users\\DELL\\eclipse-workspace\\JsonMethodDemo\\src\\new.json");
		JSONArray jarr = (JSONArray)JSONValue.parse(read);
		System.out.println(jarr);
		System.out.println(jarr.size());
		System.out.println(jarr.get(3));
		JSONArray jarr1 = (JSONArray)jarr.get(3);
		System.out.println(jarr1);
		System.out.println(jarr1.get(0));
		JSONObject jo = (JSONObject)jarr1.get(0);
		System.out.println(jo.get("village"));
		
		JSONObject obj=new JSONObject();
		obj.put(101, "azad");
		obj.put(102, "ravi");
		obj.put(103, "meghraj");
		System.out.println(obj);
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(101, "azad");
		hm.put(102, "ravi");
		hm.put(103, "meghraj");
		System.out.println(hm);
		String str = JSONValue.toJSONString(hm);
		System.out.println(str);
		JSONObject obj1 = (JSONObject)JSONValue.parse(str);
		System.out.println(obj1.get("102"));

	}

}
