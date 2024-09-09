package com.cy.leetcodeplay.linkedlist.no21;

import com.cy.leetcodeplay.classes.ListNode;

/**
 * @Author: Lil-K
 * @Date: 2024/9/9
 * @Description: no.21. Merge Two Sorted Lists
 */
public class Solution {


	/**
	 *
	 * @param list1
	 * @param list2
	 * @return
	 */
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode res = new ListNode(Integer.MIN_VALUE);
		ListNode cur = res;

		ListNode node1 = list1;
		ListNode node2 = list2;

		while (node1 != null && node2 != null) {
			if (node1.val <= node2.val) {
				cur.next = node1;
				node1 = node1.next;
			} else {
				cur.next = node2;
				node2 = node2.next;
			}
			cur = cur.next;
		}

		/**
		 * 这里不用while循环时因为:
		 * 链表只需要挂接上一个node即可
		 */
		if (node1 != null) {
			cur.next = node1;
		} else if (node2 != null) {
			cur.next = node2;
		}

		return res.next;
	}
}
