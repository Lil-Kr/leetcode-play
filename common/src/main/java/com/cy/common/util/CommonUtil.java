package com.cy.common.util;

/**
 * @Author: Lil-K
 * @Date: 2023/9/3
 * @Description:
 */
public class CommonUtil {

    /**
     * swap two arr[i] and arr[j] position
     * @param arr
     * @param i
     * @param j
     */
    public static void swap(Comparable[] arr, int i, int j) {
        Comparable temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void swap(Integer[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
