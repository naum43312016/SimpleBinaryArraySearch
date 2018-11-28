package com.naum.asafov;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10,25,5,6,3,1};
        Arrays.sort(arr);
        int index = Search.binarySearch(arr,5);
        if (index == - 1){
            System.out.println("Key not found");
        }else {
            System.out.println("Key found: " + arr[index]);
        }
    }
}
