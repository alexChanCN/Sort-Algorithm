package com.cs.study.sort;

import java.util.Arrays;

public class MergeSort {
    public static void merge(int[] arr,int low,int mid,int high){
        int i =low,j =mid+1,k=0;
        int[] temp = new int[high-low+1];
        while(i<=mid && j<=high){
           if(arr[i] <arr[j]) {
               temp[k++] = arr[i++];
           }
           else
               temp[k++] = arr[j++];
        }
        while (i<= mid){
            temp[k++] = arr[i++];
        }
        while (j<=high){
            temp[k++] = arr[j++];
        }
        for(int x = 0;x<high-low+1;x++){
            arr[x+low] = temp[x];
        }
    }

    public static void mergeSort(int[] arr,int low,int high){
        int mid = (low + high) / 2;
        if(low<high){
            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,4,2,1,6,7,0,9,8,5};
        mergeSort(arr,0,9);
        System.out.println(Arrays.toString(arr));
    }
}
