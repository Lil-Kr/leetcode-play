package com.cy.leetcodeplay.sort.advanced.quicksort;


import com.cy.common.util.CommonUtil;

/**
 * @Author: Lil-K
 * @Date: 2023/9/1
 * @Description: 基本的快速排序
 *  基本思想:
 *      1. 选第一个元素, 定义为 v
 *      2. 从第二个元素开始, 向后遍历完整个数组, 在遍历完成之后, v 这个元素已经在排好序后的正确位置
 *      3. 此时就会将数组切割为 3 段, arr[l ... p - 1] <= arr[p] <= arr[p + 1 ... r]
 *  缺点:
 *      1. 在对近乎是排序好的数组进行快排时, 递归过程中, 容易出现不平衡的现象
 *      2.
 */
public class QuickSortBase {

    /**
     * 快速排序
     * @param arr
     */
    public static void quicksort(Comparable[] arr) {
        if(null == arr) {
            return;
        }

        int length = arr.length;
        quicksort(arr, 0, length - 1);
    }

    /**
     * arr[l ... r]
     * @param arr
     * @param l
     * @param r
     */
    private static void quicksort(Comparable[] arr, int l, int r) {
        if (l >= r) {
            return;
        }

        /**
         * 计算每次 partition 之后, 排好序的位置
         */
        int p = partition(arr, l, r);

        quicksort(arr, l, p-1);
        quicksort(arr, p+1, r);
    }


    private static int partition(Comparable[] arr, int l, int r) {
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