package com.webstack.util;

public class MyBinarySearch {

	//int input[] = {11,22,33,12,3,5,6,4};
	//int input[] = {3,4,5,6,11,12,22,33};
	//element = 5
	public int binarySerach(int arr[],int element) {
		arr = this.sort(arr);
		int left = 0;
		int right = arr.length - 1;
		int mid = -1;
		while(left <= right) {
			mid = (left + right) / 2;
			if(arr[mid] == element) {
				return mid;
			}else {
				if(element > arr[mid]) {
					left = mid + 1;
				}else {
					right = mid - 1;
				}
			}
		}
		return -1;
	}
	
	private int[] sort(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] >= arr[j]) {
					arr[i] = arr[i] + arr[j];
					arr[j] = arr[i] - arr[j];
					arr[i] = arr[i] - arr[j];
				}
			}
		}
		return arr;
	}
	
}
