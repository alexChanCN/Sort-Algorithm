package com.cs.study.sort;

import java.util.Arrays;
import java.util.HashMap;

public class InsertSort {
    public static void insertSort(int[] arr){
        int i,j,temp, len = arr.length;
        for(i =1;i<len;i++){
            temp = arr[i];
            for(j = i -1;j>=0&&arr[j]>temp;j--){
                arr[j+1] = arr[j];
            }
            arr[j+1] =temp;
        }
    }
    public static void main(String[] args) {
        int[] a = {2,4,4,5,1,0,10,9};
        insertSort(a);
        System.out.println(Arrays.toString(a));
    }
}
