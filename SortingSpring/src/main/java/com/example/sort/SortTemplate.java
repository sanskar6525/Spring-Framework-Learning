package com.example.sort;

import org.springframework.stereotype.Component;

@Component
//Interface that defines the methods that the different Sorting classes will be implementing
public interface SortTemplate {
	void sort(int[] arr);
	void display(int[] arr);

}