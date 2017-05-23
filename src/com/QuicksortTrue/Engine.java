package com.QuicksortTrue;

import java.util.List;

/**
 * Created by RENT on 2017-05-23.
 */
public class Engine {
    private int[] numbers = {10,15,4,3,7,8,2,65};
    private int number;

    public void quicksort (int low, int high) {
        //Get the pivot element form the list
        int i = low;
        int j = high;
        int pivot = numbers[low + (high-low)/2];
        //Dividing into two lists
        while (i<=j){
            // If the current value from the left list is smaller than the pivot
            // element, then get the next element from the left list
            while (numbers[i] < pivot){
                i++;
            }
            // If the current value from the right list is larger than the pivot
            // element then get the next element from the right list
            while (numbers[j] > pivot){
                i--;
            }
            // If we have found a value in the left list which is larger than
            // the pivot element and if we have found a value in the right list
            // which is smaller than the pivot element then we exchange the
            // values.
            // As we are done we can increase i and j
            if (i <= j) {
                exchange(i, j);
                i++;
                j--;
            }
        }
        // Recursion
        if (low < j)
            quicksort(low, j);
        if (i < high)
            quicksort(i, high);
    }

    private void exchange(int i, int j) {
        //swapping two numbers
        int temp = numbers[i];
        numbers[i] = numbers [j];
        numbers[j] = temp;
    }
}




