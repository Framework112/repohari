package com.comcast.crm.generic.fileutility;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Jsonutility {

	public String getDatafromJsonfile(String key) throws IOException, ParseException
	{
		FileReader filer=new FileReader("./comproperties/jsonsss.json");
		JSONParser jp=new JSONParser();
		Object obj = jp.parse(filer);
		JSONObject jobj=(JSONObject)obj;
		String data=(String)jobj.get(key);
		return data;
	}
	
}
