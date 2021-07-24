package XMLToJavaObjectAndThenToJSON;

import org.json.*;

public class XMLToJavaObjectAndThenToJSON {
	
	public static String xml="<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>"+
			"<student><firstName>John</firstName>"+
			"<lastName>Wick</lastName>"+
			"<marks>78.0</marks>"+
			"</student>";
	
	public static void main(String[] args) {
		try {
			
			JSONObject json=XML.toJSONObject(xml);
			String jsonString=json.toString(4);
			System.out.println(jsonString);
			
		}catch(JSONException e) {System.out.println(e);}
			
			
		

		
		
		

	}

}
