package com.casic.algorithm;

/**
 * 选择排序算法
 * Selection
 *           平均   最坏  最好
 * 时间复杂度：O(n²) O(n²) O(n²)
 * 空间复杂度：O(1)
 * 稳定性： 不稳
 * @date 2020年03月23日10:20:35
 * @author niugaofeng
 */
public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = {5, 3, 6, 8, 1, 7, 9, 4, 2};

        sort(arr);

        Utils.print(arr);
    }

    public static void sort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = findMinPos(arr,i);
            Utils.swap(arr,i,minPos);
        }
    }

    private static int findMinPos(int[] a,int minPos){
        for (int i = minPos+1; i < a.length; i++) {
            minPos = a[i] < a[minPos] ? i : minPos;
        }
        return minPos;
    }
}
