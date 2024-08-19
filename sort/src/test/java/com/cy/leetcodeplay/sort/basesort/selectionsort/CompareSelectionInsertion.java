package com.cy.leetcodeplay.sort.basesort.selectionsort;

import com.cy.common.helper.Helper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @Author: Lil-K
 * @Date: 2024/8/14
 * @Description:
 */
@Slf4j
class CompareSelectionInsertion {

  @Test
  public void test_1() {
    int n = 1_000_000;
    Integer[] arr = Helper.generateRandomNumbers(n, 0, 4); // 大量重复元素
//    Integer[] arr = Helper.generateNearlyOrderedArray( n, 3);
    Integer[] arr2 = Arrays.copyOf(arr, arr.length);

    Helper.testSort(arr,
      "com.cy.leetcodeplay.sort.basesort.selectionsort.SelectionSort",
      "selectionSortToMin");

    Helper.testSort(arr2,
      "com.cy.leetcodeplay.sort.basesort.insertionsort.InsertionSort",
      "sortOptimization");
  }

  @Test
  public void test_2() {
    int n = 1_000_000;
    Integer[] arr = Helper.generateRandomNumbers(n, 0, 4); // 大量重复元素
    Integer[] arr2 = Arrays.copyOf(arr, arr.length);
    Integer[] arr3 = Arrays.copyOf(arr, arr.length);
    Integer[] arr4 = Arrays.copyOf(arr, arr.length);
    Integer[] arr5 = Arrays.copyOf(arr, arr.length);

    Helper.testSort(arr,
      "com.cy.leetcodeplay.sort.advanced.merge.MergeSort",
      "mergeSort");

    Helper.testSort(arr2,
      "com.cy.leetcodeplay.sort.advanced.merge.MergeSortBU",
      "sort");

    /**
     * StackOverflowError
     */
//    Helper.testSort(arr3,
//      "com.cy.leetcodeplay.sort.advanced.quicksort.QuickSortBase",
//      "quicksort");

    Helper.testSort(arr4,
      "com.cy.leetcodeplay.sort.advanced.quicksort.QuickSort2Ways",
      "quicksort");

    Helper.testSort(arr5,
      "com.cy.leetcodeplay.sort.advanced.quicksort.QuickSort3Ways",
      "quicksort");
  }

}
