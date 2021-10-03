package com.webstack.driver;

public class TestDriver {

	public static void main(String[] args) {
		
		int arr[]= {11,33,2,3,44,56};		
		
		System.out.println("Before Sorting :");
		printArray(arr);
		
		sort(arr);
		
		System.out.println("After Sorting : ");
		printArray(arr);
		
		System.out.println("Done...!");
	}
	
	private static void sort(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {			
			int minIndex = i;
			for(int j=i+1;j<arr.length ;j++) {
				if(arr[j] <= arr[minIndex]) {
					minIndex = j;
				}
			}
			System.out.println("--"+minIndex+"---"+arr[minIndex]);
			 int temp = arr[minIndex];
	         arr[minIndex] = arr[i];
	         arr[i] = temp;
		}
	}
	
	private static void printArray(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			System.out.println(arr[i]);
		}
	}
		

}
