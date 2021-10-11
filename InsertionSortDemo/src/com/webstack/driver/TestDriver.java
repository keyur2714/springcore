package com.webstack.driver;

public class TestDriver {

	public static void main(String[] args) {
		int arr[]= {24,21,23,6,9};	
					   
		System.out.println("Before Sorting :");
		printArray(arr);
		
		sort(arr);
		
		System.out.println("After Sorting : ");
		printArray(arr);
		
		System.out.println("Done...!");
		
	}

	private static void sort(int arr[]) {
		int length = arr.length;
		
		for(int i=1;i<length;i++) {
			int key = arr[i];
			int j=i-1;
			while(j>=0 && arr[j] > key) {
				arr[j+1]=arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}
	
	private static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
