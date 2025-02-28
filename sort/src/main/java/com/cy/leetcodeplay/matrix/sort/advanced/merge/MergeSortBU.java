package com.cy.leetcodeplay.matrix.sort.advanced.merge;

import com.cy.leetcodeplay.matrix.common.util.PrintString;

import java.util.Arrays;

/**
 * @Author: Lil-K
 * @Date: 2023/8/31
 * @Description: 自底向上归并排序
 * 不需要递归的方式
 * 从始至终没有使用数组随机访问元素, 没有交换元素
 */
public class MergeSortBU {

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{8, 6, 2, 3, 1, 5, 7, 4};
        sort(arr);
        System.out.println(PrintString.printArray(arr));
    }

    public static void sort(Comparable[] arr) {
        if (null == arr) {
            return;
        }
        int n = arr.length;

        sort(arr, 0, n);
    }

    /**
     * arr[l....r] 范围内的数组进行排序
     * 核心逻辑就是计算 每一次归并的元素索引, 找到 每次的 l index, mid index, r index
     * @param arr
     * @param l
     * @param r
     */
    private static void sort(Comparable[] arr, int l, int r) {

        /**
         * 从 索引为 1 的位置开始
         * 第一层for循环:
         *  * 计算每次参与归并的 左(右)半边的元素个数, 默认从1开始时, 左(右)半边各有1个元素参与归并(也就是它自身)
         *  * 从 1(参与的元素个数) 开始, 一直循环到 参与排序的元素 <= 右边界 r
         *
         *  第二层循环:
         *  * 计算出归并的元素范围: [l...r]
         *  * 每次循环完成之后, 计算下一组归并的开始位置, 2 * mergeSize + i
         *  * 最后一次循环计算的右边界: 有可能会超出整个数组的范围
         */
        for (int mergeSize = 1; mergeSize <= r; mergeSize = 2 * mergeSize) {

            /**
             * 这里的i是当前待归并的范围元素的 左边界 l
             * i: 表示下一次待归并的数组的左边界, 每轮循环都需要计算
             * i + mergeSize < r --> 判断右半部分是否还存在元素, 没有就结束
             */
            for (int i = 0; i + mergeSize < r; i += 2 * mergeSize) {
                int l1 = i;
                int mid = i + mergeSize - 1;
                int r1 = Math.min(i + 2 * mergeSize - 1, r - 1);// 计算归并子数组的右边界
                if (arr[mid].compareTo(arr[mid + 1]) > 0)
                    merge(arr, l1, mid, r1);
            }
        }
    }

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
         *
         */
        for (int k = l; k <= r; k++) {
            if (i > mid) {
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