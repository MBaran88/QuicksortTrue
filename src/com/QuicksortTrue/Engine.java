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

        }

    }

}


