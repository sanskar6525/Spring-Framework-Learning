package com.example.sort;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.example.sort.SortTemplate;

@Component
public class SortingLaunch 
{
	SortTemplate sortTemplate;
	
	public SortingLaunch()
	{
		this.sortTemplate=new BubbleSort();
	}
	public void run(int[] arr)
	{
		System.out.println("Sorting started: "+sortTemplate);
		sortTemplate.sort(arr);
		sortTemplate.display(arr);
	}

}
