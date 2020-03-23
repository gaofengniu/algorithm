package com.casic;

/**
 * 选择排序算法
 * 时间复杂度:O(n²)
 * 空间复杂度:O(1)
 * 稳定性：不稳
 * Java
 * @date 2020年03月23日10:20:35
 * @author niugaofeng
 */
public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = {5, 3, 6, 8, 1, 7, 9, 4, 2};

        sort(arr);

        print(arr);
    }

    public static void sort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i+1; j < arr.length; j++) {
                minPos = arr[j] < arr[minPos] ? j : minPos;
            }
            swap(arr,i,minPos);
        }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

   public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
