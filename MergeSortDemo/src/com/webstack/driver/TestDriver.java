package com.webstack.driver;

public class TestDriver {

	public static void main(String[] args) {
		 
		int arr[]= {4,6,3,2,7,8,5,1};
		
		System.out.println("Before Sorting :");
		printArray(arr);
		
		mergeSort(arr,0,arr.length-1);
		
		System.out.println("After Sorting : ");
		printArray(arr);
		
		System.out.println("Done...!");
	}

	private static void mergeSort(int[] arr, int i, int j) {
		if(i<j) {
			int mid = (i+j)/2;
			mergeSort(arr, i, mid);
			mergeSort(arr, mid+1, j);
			merge(arr,i,mid,j);
		}
	}

	private static void merge(int[] arr, int low, int mid, int high) {
		int i=low;
		int j=mid+1;
		int k=low;
		int b[]=new int[arr.length];
		while(i<=mid && j<=high) {
			if(arr[i]<arr[j]) {
				b[k]=arr[i];
				i++;
			}else {
				b[k]=arr[j];
				j++;
			}
			k++;
		}
		while(i<=mid) {
			b[k]=arr[i];
			k++;
			i++;
		}
		while(j<=high) {
			b[k]=arr[j];
			k++;
			j++;
		}
		
		for(i=low;i<=high;i++) {
			arr[i]=b[i];
		}
	}

	private static void printArray(int arr[]) {		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	
}
