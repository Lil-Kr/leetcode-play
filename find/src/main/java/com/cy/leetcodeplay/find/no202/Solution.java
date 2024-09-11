package com.cy.leetcodeplay.find.no202;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: Lil-K
 * @Date: 2024/9/5
 * @Description: no.202. Happy Number
 */
public class Solution {


	/**
	 * 解法一
	 * @param n
	 * @return
	 */
	public boolean isHappy(int n) {
		if (n == 1) return true;
		int sum = n;

		Set<Integer> res = new HashSet<>();
		while (true) {
			sum = getNext(sum);
			if (sum == 1) {
				return true;
			}

			if (!res.contains(sum)) {
				res.add(sum);
			} else {
				return false;
			}
		}
	}

	private static int getNext(int n) {
		int sum = 0;
		while (n > 0) {
			// 取个位数
			int digit = n % 10;
			sum += digit * digit;
			n /= 10;
		}
		return sum;
	}

	/**
	 * 解法二: 快慢指针
	 * @param n
	 * @return
	 */
	public boolean isHappy2(int n) {
		int slow = n;
		int fast = getNext(n);

		while (fast != 1 && slow != fast) {
			slow = getNext(slow);
			fast = getNext(getNext(fast));
		}

		return fast == 1;
	}
}
