package com.cy.leetcodeplay.array.no374;

/**
 * @Author: Lil-K
 * @Date: 2024/8/22
 * @Description: NO.374 Guess Number Higher or Lower
 *
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return       -1 if num is higher than the picked number
 * 			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */
public class Solution {


	public int guessNumber(int n) {
		int l = 0, r = n;

		while (l <= r) {
			int mid = l + (r - l) / 2;
			/**
			 * 系统给的默认函数, 解题时不需要考虑
			 */
			int res = guess(mid);

			if (res == -1) { // mid > pick
				r = mid;
			} else if (res == 1) { // mid < pick
				l = mid + 1;
			} else {
				return mid;
			}
		}
		return 0;
	}

	/**
	 * 忽略此函数
	 * 系统内置函数, 这里是为了让代码不出错
	 * @param mid
	 * @return
	 */
	private int guess(int mid) {
		return 0;
	}


}
