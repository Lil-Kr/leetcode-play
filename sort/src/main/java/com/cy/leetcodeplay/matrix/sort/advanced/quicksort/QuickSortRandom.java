package com.cy.leetcodeplay.matrix.sort.advanced.quicksort;


import com.cy.leetcodeplay.matrix.common.util.CommonUtil;

/**
 * @Author: Lil-K
 * @Date: 2023/9/3
 * @Description: 随机快速排序
 */
public class QuickSortRandom {

    public static void quicksort(Comparable[] arr) {
        if(null == arr) {
            return;
        }

        int length = arr.length;
        quicksort(arr, 0, length - 1);
    }

    private static void quicksort(Comparable[] arr, int l, int r) {
        if (l >= r) {
            return;
        }

        /**
         * 计算每次 partition 之后, 排好序的位置
         */
        int p = partition(arr, l, r);

        quicksort(arr, l, p - 1);
        quicksort(arr, p + 1, r);
    }

    /**
     *
     * @param arr
     * @param l
     * @param r
     * @return
     */
    private static int partition(Comparable[] arr, int l, int r) {
        CommonUtil.swap(arr,l,(int)(Math.random() * (r - l + 1)) + l);

        /**
         * 定于数组的第一个元素
         */
        Comparable v = arr[l];

        /**
         * 第一个元素排序之后, 正确的位置, 从0开始
         */
        int j = l;

        for (int i = l + 1; i <= r; i ++) {
            if (arr[i].compareTo(v) < 0) {
                CommonUtil.swap(arr, i, j + 1);
                j++;
            }
        }

        CommonUtil.swap(arr, l, j);
        return j;
    }

}