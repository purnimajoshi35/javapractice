package com.purnima.practice.sorting;

public class InsertionSort {

	public static void main(String[] args) {
		
		int arr[] = {5,2,4,7,13,6,1,3};
		int i = 0;
		int key = 0;
		
		for(int j = 1; j<arr.length; j++)
		{
			key = arr[j];
			i = j-1;
			
			while(i>=0 && key<arr[i])
			{
				arr[i+1] = arr[i];
				i=i-1;
			}
			arr[i+1]=key;
		}
		
		for(int x = 0; x<arr.length; x++)
		{
			System.out.print(arr[x]+" ");
		}

	}

}
