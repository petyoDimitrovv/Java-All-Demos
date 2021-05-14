package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        int[] arr = {11, 4, 28 , 12, 13 , 45 ,3, -1};

        sort(arr);
        }

    private static void sort(int[] arr) {
        mergeSort(arr, 0, arr.length -1 );
    }

    private static void mergeSort(int[] arr, int start, int end) {
        if(start >= end){
            return;
        }
        int middle = (start + end) / 2 ;
        mergeSort(arr, start, middle);
        mergeSort(arr, middle + 1, end);
    }
}

