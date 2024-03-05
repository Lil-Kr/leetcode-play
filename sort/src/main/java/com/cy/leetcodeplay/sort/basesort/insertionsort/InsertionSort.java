package com.cy.leetcodeplay.sort.basesort.insertionsort;


import com.cy.common.util.CommonUtil;

/**
 * @Author: Lil-K
 * @Date: 2023/8/26
 * @Description: 插入排序
 * * 假设第一个元素是有序的
 * * 第二个元素与第一个元素相比较, check位置是不是是有序的, 此时数组的左边已经是排好序的顺序了
 *
 * * 更适合近乎有序的数字序列进行排序
 * * 插入排序还可以用于其他算法的子过程进行运用
 */
public class InsertionSort<E extends Comparable<E>> {

    /**
     *
     * @param arr
     */
    public static void sort(Comparable[] arr) {
        if(arr == null) {
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            /**
             * 与选择排序不同的是, 第二层循环是可以提前结束的
             * 所以
             */
            for (int j = i; j > 0 && arr[j].compareTo(arr[j-1]) < 0; j--) {
                CommonUtil.swap(arr, j, j-1);
            }
        }
    }

    public static void sortOptimization(Comparable[] arr) {
        if(arr == null) {
            return;
        }
        int n = arr.length - 1;
        sortOptimization(arr, 0, n);
    }

    /**
     * 改良版
     * @param arr
     */
    public static void sortOptimization(Comparable[] arr, int l, int r) {
        for (int i = l + 1; i <= r; i++) {
            Comparable temp = arr[i];
            int j = i;
            /**
             * 与选择排序不同的是, 第二层循环是可以提前结束的
             * 所以
             */
            for (; j > 0 && arr[j - 1].compareTo(temp) > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = temp;
        }
    }
}