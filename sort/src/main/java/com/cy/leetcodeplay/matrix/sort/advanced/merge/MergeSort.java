package com.cy.leetcodeplay.matrix.sort.advanced.merge;


import com.cy.leetcodeplay.matrix.sort.basesort.insertionsort.InsertionSort;

import java.util.Arrays;

/**
 * @Author: Lil-K
 * @Date: 2023/8/28
 * @Description: 归并排序 nlogn, 自顶向下
 */
public class MergeSort {

    private static InsertionSort insertionSort = new InsertionSort();

    public static void mergeSort(Comparable[] arr) {
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
        /**
         * 递归到底的情况
         */
        if (l >= r) {
            return;
        }

//        if (r - l <= 15) {
//            insertionSort.sortOptimization(arr);
//        }

        /**
         * 计算中间位置的 index
         */
        int mid = l + (r - l) / 2;

        sort(arr, l, mid);
        sort(arr, mid + 1, r);
        if (arr[mid].compareTo(arr[mid + 1]) > 0) { // arr nearly order
            merge(arr, l, mid, r);
        }
    }

    /**
     * 归并过程
     * 将 [l ... mid] 和 [mid+1 ... r] 两部分进行归并
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
         * 锁定左部分的开始位置(i)和右部分的开始位置(j)
         */
        int i = l, j = mid + 1;

        /**
         * 注意需要处理左半部分和右半部分是否扫面完成
         *
         */
        for (int k = l; k <= r; k++) {
            if (i > mid) {// i > mid 说明左半部分已经处理完
                arr[k] = aux[j - l];// j - l 得到正确的索引位置, 因为取值范围是 [l ... r + 1)
                j++;
            } else if (j > r) {// 说明右半部分已经处理完
                arr[k] = aux[i - l]; // i -l 得到正确的索引位置
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