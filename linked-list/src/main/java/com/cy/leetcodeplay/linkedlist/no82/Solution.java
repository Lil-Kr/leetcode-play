package com.cy.leetcodeplay.linkedlist.no82;

import com.cy.leetcodeplay.classes.ListNode;

/**
 * @Author: Lil-K
 * @Date: 2024/9/9
 * @Description:
 */
public class Solution {

	/**
	 * 删除重复的元素
	 * @param head
	 * @return:
	 */
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null) {
			return null;
		}

		ListNode dummy = new ListNode(-1);
		dummy.next = head;
		ListNode prev = dummy;

		while (head != null) {
			if (head.next != null && head.val == head.next.val) {
				// 跳过所有重复的节点
				while (head.next != null && head.val == head.next.val) {
					head = head.next;
				}
				prev.next = head.next;
			} else {
				prev = prev.next;
			}
			head = head.next;
		}

		return dummy.next;
	}
}
