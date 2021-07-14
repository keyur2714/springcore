package com.webstack.driver;

import com.webstack.util.MyBinarySearch;

public class TestDriver {

	public static void main(String str[]) {
		System.out.println("Hello Radhe Krishna...!");
		
		int input[] = {11,22,33,12,3,5,6,4};
		
		MyBinarySearch myBinarySearch=new MyBinarySearch();

		int element = 33;
		int index = myBinarySearch.binarySerach(input, element);
		
		if(index == -1) {
			System.out.println(element +" Not Found in Array.");
		}else {
			System.out.println(element +" Found at index : " + index);
		}		
		
	}
	
}
