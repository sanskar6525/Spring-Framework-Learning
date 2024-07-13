package com.example.sort;

import org.springframework.stereotype.Component;

@Component
public class MergeSort implements SortTemplate{

	
	public void sort(int[] arr) {
		// TODO Auto-generated method stub
		
	}

	
	public void display(int[] arr) 
	{
		System.out.println("Sorting by Merge Sort: ");
		 int size=arr.length;
	     for (int i = 0; i < size; i++)
	    	 System.out.print(arr[i] + " ");
	     
	     System.out.println();
		
	}


}
