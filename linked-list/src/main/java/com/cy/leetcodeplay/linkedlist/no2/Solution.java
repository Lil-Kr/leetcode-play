package com.cy.leetcodeplay.linkedlist.no2;

import com.cy.leetcodeplay.classes.ListNode;

/**
 * @Author: Lil-K
 * @Date: 2024/9/9
 * @Description: no.2. Add Two Numbers
 */
public class Solution {

	/**
	 *
	 * @param l1
	 * @param l2
	 * @return
	 */
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if (l1 == null || l2 == null) {
			return null;
		}

		int curry = 0;
		ListNode dummy = new ListNode(-1);
		ListNode cur = dummy;
		while (l1 != null || l2 != null) {
			int sum = curry;

			if (l1 != null) {
				sum += l1.val;
				l1 = l1.next;
			}

			if (l2 != null) {
				sum += l2.val;
				l2 = l2.next;
			}
			curry = sum / 10;
			cur.next = new ListNode(sum % 10);
			cur = cur.next;
		}

		if (curry > 0) cur.next = new ListNode(curry);
		return dummy.next;
	}

}
