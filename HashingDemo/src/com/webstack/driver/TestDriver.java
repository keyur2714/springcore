package com.webstack.driver;

import java.util.HashMap;
import java.util.Map;

public class TestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String v1="A";
		String v2="B";
		String v3="C";
		String v4="P";
		String v5="Z";
		
		
		System.out.println("A Hash Code : "+v1.hashCode());
		System.out.println("B Hash Code : "+v2.hashCode());
		System.out.println("C Hash Code : "+v3.hashCode());
		System.out.println("P Hash Code : "+v4.hashCode());
		System.out.println("Z Hash Code : "+v5.hashCode());
		
		Map<String,String> map = new HashMap<String, String>(16); //16 Bucket 0--15
		
		
		
		
		
		map.put(v1, "Keyur");
		map.put(v2, "denish");
		map.put(v3, "vinit");
		map.put(v4, "ravi");
		map.put(v5, "shailendra");
		
		int len=map.size();
		
		System.out.println("Map Size : "+ map.size());
		
		System.out.println(65&(16-1));
		System.out.println(66&(16-1));
		System.out.println(67&(16-1));
		System.out.println(v4.hashCode()&(16-1));
		System.out.println(v5.hashCode()&(16-1));
		
		System.out.println("=============Done============");
		
	}

}
