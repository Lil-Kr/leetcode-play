package com.cy.leetcodeplay.array.no4;

/**
 * @Author: Lil-K
 * @Date: 2024/9/29
 * @Description: no.4. Median of Two Sorted Arrays
 */
public class Solution {

	/**
	 *
	 * @param nums1
	 * @param nums2
	 * @return
	 */
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {

		int n1 = nums1.length, n2 = nums2.length;
		if (n1 < 1 && n2 < 1) return 0.0;

		int[] mergeArray = merge(nums1, nums2, n1 + n2);

		int l = 0, r = n1 + n2 - 1;
		int mid = l + (r - l) / 2;
		if ((n1 + n2) % 2 == 0) {
			return (mergeArray[mid] + mergeArray[mid + 1]) / 2.0;
		} else {
			return (double)mergeArray[mid];
		}
	}


	public int[] merge(int[] nums1, int[] nums2, int len) {
		int[] merge = new int[len];

		int p1 = 0, p2 = 0;
		int l = 0;
		while (p1 < nums1.length && p2 < nums2.length) {
			if (nums1[p1] > nums2[p2]) {
				merge[l] = nums2[p2];
				p2++;
			} else {
				merge[l] = nums1[p1];
				p1++;
			}
			l++;
		}

		if (p1 < nums1.length) {
			for (int i = p1; i < nums1.length; i++) {
				merge[l] = nums1[i];
				l++;
			}
		} else if (p2 < nums2.length) {
			for (int i = p2; i < nums2.length; i++) {
				merge[l] = nums2[i];
				l++;
			}
		}
		return merge;
	}
}