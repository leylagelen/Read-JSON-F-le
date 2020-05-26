package SecondPackage;

import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class datafromjson {

	 public static void main(String[] args) {
	     //Create New Parser 
		 JSONParser parser = new JSONParser();

	       try {
	    	    //Your .json file path
	            Object obj = parser.parse(new FileReader("C:data1.json"));

	            JSONObject jsonObject = (JSONObject) obj;
	            //My array's name in json file 
	            JSONArray companyList = (JSONArray) jsonObject.get("users");

	            for (int i = 0; i < companyList.size(); i++) {
	                
	            	JSONObject objx = (JSONObject) companyList.get(i);

	                System.out.println(objx.get("email") + " " + objx.get("password") + " " + objx.get("tel"));

	            }
	        }catch (Exception e) {
	            e.printStackTrace();
	        }
	 }
}
