package com.cs.study.sort;

import java.util.Arrays;

public class ShellSort {
    public static void shellSort(int[] arr){
        int len = arr.length,i,j,gap;
        for(gap = len/2;gap>0;gap/=2 ){
            for(i = gap;i < len;i+=gap){
                int temp = arr[i];
                for(j =i -gap;j>=0 && arr[j]>temp;j-=gap){
                    arr[j+gap] = arr[j];
                }
                arr[j+gap] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {2,4,3,5,1,0,10,6,};
        shellSort(a);
        System.out.println(Arrays.toString(a));
    }
}
