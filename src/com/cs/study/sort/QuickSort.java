package com.cs.study.sort;

import java.util.Arrays;

public class QuickSort {
    public static int partition(int[] arr ,int low ,int high){
        int key = arr[low];
        while (low<high){
            while (arr[high] > key && high>low ) high--;
            arr[low] = arr[high];
            while (arr[low] < key && high>low) low++;
            arr[high] = arr[low];
        }
        arr[low] = key;
        return low;
    }

    public static void quickSort(int[] arr, int low, int high){
        if(low>= high) return;
        int pivot = partition(arr,low,high);
        quickSort(arr,low,pivot);
        quickSort(arr,pivot+1,high);

    }

    public static void main(String[] args) {
        int[] arr = {3,4,2,1,6,7,0,9,8,5};
        quickSort(arr,0,9);
        System.out.println(Arrays.toString(arr));
    }
}
