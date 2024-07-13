package com.example.sort;

import java.util.Arrays;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSort implements SortTemplate{

	
	public void sort(int[] arr) 
	{
		System.out.println("Array before sorting: "+Arrays.toString(arr));
		int n=arr.length;
		int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) 
        {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) 
            {
                if (arr[j] > arr[j + 1]) 
                {
                    // Swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were
            // swapped by inner loop, then break
            if (swapped == false)
                break;
        }
	}

	public void display(int[] arr) 
	{
		System.out.println("Sorting by Bubble Sort: ");
		 int size=arr.length;
	     for (int i = 0; i < size; i++)
	    	 System.out.print(arr[i] + " ");
	     
	     System.out.println();
		
	}

}
