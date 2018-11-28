package com.naum.asafov;

/**
 *
 * Simple binary search of array
 */
public class Search {
    public static int binarySearch(int[] arr,int key){
        int low = 0;
        int high = arr.length - 1;
        while (low <= high){
            int middle = (low + high) / 2;
            int middleVal = arr[middle];
            if (key > middleVal){
                low = middle + 1;
            }else if (key < middleVal){
                high = middle - 1;
            }else {
                //Found, return index
                return  middle;
            }
        }

        //Not found
        return -1;
    }
}
