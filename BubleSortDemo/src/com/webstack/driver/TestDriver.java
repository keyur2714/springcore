package com.webstack.driver;

public class TestDriver {

	public static void main(String[] args) {
		int arr[]= {2,3,1,55,23,45,12};
		
		System.out.println("Before Sorting :");
		printArray(arr);
		
		sort(arr);
		
		System.out.println("After Sorting : ");
		printArray(arr);
		
		System.out.println("Done...!");
	}
	
	public static void sort(int arr[]) {
		boolean isSwap;
		for(int i=0;i<arr.length-1;i++) {
			isSwap = false;
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[i] >= arr[j]) {
					arr[i]=arr[i]+ arr[j];
					arr[j]=arr[i]- arr[j];
					arr[i]=arr[i]-arr[j];
					isSwap = true;
				}
			}
			if(! isSwap) {
				break;
			}
		}
	}

	private static void printArray(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			System.out.println(arr[i]);
		}
	}
		
}
