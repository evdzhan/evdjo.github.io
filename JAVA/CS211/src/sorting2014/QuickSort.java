package sorting2014;

import java.util.ArrayList;
import java.util.List;

public class QuickSort implements Sorter{

	@Override
	public void sort(Comparable[] items, int cutoff) {
	  quicksort(items,0,items.length-1);
	 
		
	}

	 public void quicksort(Comparable[] items,int first,int last) {
		int arrSize = last - first + 1 ;
		if( arrSize < 2) { return; }
		
		 
		
		int pivot =  first + ((last - first)/2)  ;
		
		pivot = parition(items,first,last,pivot);
		
		quicksort(items,first,pivot-1);
		quicksort(items,pivot+1,last);
		
		 
		
	}

	public int parition(Comparable[] items,int left,int right,int pivotIndex) {
		//Comparable pivot = items[pivotIndex] ;
		swap(items,pivotIndex,left);
		int swap = left + 1 ;
		for(int i = swap; i <= right; i ++) {
			if(items[left].compareTo(items[i]) > 0) {
				swap(items,swap,i);
				swap++;
			}
			
		}
		swap(items,left,swap-1);
		return swap-1;
		
	}
	public void swap(Comparable[] items,int a,int b) {
		Comparable temp = items[a] ;
		items[a]=items[b];
		items[b]=temp;
	}
	
 

	 
	 
	
}
