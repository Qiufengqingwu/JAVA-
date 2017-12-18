package com.svse.d;

import java.util.HashMap;
import java.util.Map;

public class Demo1 {
public static void main(String[] args) {
	Map<String,String> map= new HashMap<String, String>();
	map.put("¹·", "Ã«");
	map.put("Å£", "Ñò");
	map.put("º£", "Ìì");
	
	System.out.println("map:"+map);
	
}
}
