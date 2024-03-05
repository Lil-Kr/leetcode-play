package com.cy.leetcodeplay.sort.advanced.merge;


import java.util.Arrays;

/**
 * @Author: Lil-K
 * @Date: 2023/8/28
 * @Description: 归并排序 nlogn
 */
public class MergeSort {

    public static void sort(Comparable[] arr) {
        if (null == arr) {
            return;
        }
        sort(arr,0, arr.length - 1);
    }

    /**
     * 递归使用归并排序, 对 arr[l...r] 的范围进行排序
     * @param arr
     */
    private static void sort(Comparable[] arr, int l, int r) {
        if (l >= r) {
            return;
        }

        /**
         * 计算中间位置的 index
         */
        int mid = l + (r - l) / 2;

        sort(arr, l, mid);
        sort(arr, mid + 1, r);

        merge(arr, l, mid, r);
    }

    /**
     * 归并过程
     * @param arr
     * @param l
     * @param mid
     * @param r
     */
    private static void merge(Comparable[] arr, int l, int mid, int r) {
        /**
         * 复制一个临时空间, 这个空间是从0开始的
         */
        Comparable[] aux = Arrays.copyOfRange(arr, l, r + 1);

        /**
         *
         */
        int i = l, j = mid + 1;

        /**
         *
         */
        for (int k = l; k <= r; k++) {
            if (i > mid) {// 当k还没结束时, i > mid, 说明
                arr[k] = aux[j - l];
                j++;
            } else if (j > r) {
                arr[k] = aux[i - l];
                i++;
            } else if (aux[i - l].compareTo(aux[j - l]) < 0) {
                arr[k] = aux[i - l];
                i++;
            } else {
                arr[k] = aux[j - l];
                j++;
            }
        }
    }
}