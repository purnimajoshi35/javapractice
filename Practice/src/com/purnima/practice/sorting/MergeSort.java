package com.purnima.practice.sorting;

public class MergeSort {
	
	 // Merges two subarrays of arr[]. 
    // First subarray is arr[l..m] 
    // Second subarray is arr[m+1..r] 
    void merge(int arr[], int l, int m, int r) 
    { 
    	
    	System.out.println(arr.length+ " "+l+ " "+m+" "+r);
    	//System.out.println(l+ " "+m+" "+r);
    	//System.out.print(m+ " ");
    	//System.out.println(r+ " ");
        // Find sizes of two subarrays to be merged 
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
        System.out.println(n1+" "+n2);
        //System.out.println(n2);
        /* Create temp arrays */
        int L[] = new int [n1]; 
        
        int R[] = new int [n2]; 
  
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i) 
        {
            L[i] = arr[l + i]; 
            //System.out.print(L[i]+" ");
            
        }
       // System.out.print("");
        for (int j=0; j<n2; ++j) 
        {
            R[j] = arr[m + 1+ j]; 
           // System.out.print(R[j]+" ");
        }
        //System.out.print("");
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
  
        // Initial index of merged subarry array 
        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                arr[k] = L[i]; 
                //System.out.println(arr[k]);
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
  
    // Main function that sorts arr[l..r] using 
    // merge() 
    void sort(int arr[], int l, int r) 
    { 
    	System.out.println(arr.length+" "+l+" "+r);
        if (l < r) 
        { 
            // Find the middle point 
            int m = (l+r)/2; 
            
            // Sort first and second halves 
            sort(arr, l, m); 
            
            sort(arr , m+1, r); 
            
            //System.out.println(r);
            // Merge the sorted halves 
            merge(arr, l, m, r); 
        } 
    } 
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
  
    // Driver method 
    public static void main(String args[]) 
    { 
        int arr[] = {2, 4, 5, 7, 1, 2, 3, 6}; 
  
        System.out.println("Given Array"); 
        printArray(arr); 
  
        MergeSort ob = new MergeSort(); 
        ob.sort(arr, 0, arr.length-1); 
  
        System.out.println("\nSorted array"); 
        printArray(arr); 
    } 
} 