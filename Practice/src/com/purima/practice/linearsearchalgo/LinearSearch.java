package com.purima.practice.linearsearchalgo;

public class LinearSearch {
	
	
	static int search(int arr[], int length, int x)
	{
		int i;
		
		for(i=0; i<length; i++)
		{
			if(arr[i]==x)
			{
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		
		int arr[]={2,4,3,7,5,8,1};

		int length = arr.length;
		
		int search_element = 10;
		
		int index = LinearSearch.search(arr, length, search_element);
		
		System.out.println(index);
	}

}
