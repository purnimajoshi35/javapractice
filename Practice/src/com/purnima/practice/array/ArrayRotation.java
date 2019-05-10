package com.purnima.practice.array;

public class ArrayRotation {
	
	
	
	

	public static void main(String[] args) {
		
      int arr[]= new int[]{ 1, 2, 3, 4, 5, 6, 7 };
      
      int temp = 0;
      
      int d = 2;
      
      
      
      for(int i = 0;i<d;i++)
      {   
    	  
    	  temp= arr[0];
    	  
    	  for(int j=0;j<arr.length-1;j++)
    	  {
    		  arr[j]= arr[j+1];
    	  }
    	  
    	  arr[arr.length-1]= temp;
      }
      
      for(int i = 0; i<= arr.length-1;i++)
    	  
      {
    	  System.out.print(arr[i]+" ");
      }
		
		
	}

}
