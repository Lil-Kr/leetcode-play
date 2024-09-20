package com.cy.leetcodeplay.linkedlist.no23;

import com.cy.leetcodeplay.classes.ListNode;

import java.util.PriorityQueue;

/**
 * @Author: Lil-K
 * @Date: 2024/9/20
 * @Description: no.23. Merge k Sorted Lists
 */
public class Solution {

	/**
	 * 解法一: 分治法
	 * 逐个merge两个链表
	 * @param lists
	 * @return
	 */
	public ListNode mergeKLists(ListNode[] lists) {
		if (lists == null || lists.length == 0) return null;

		ListNode nodes1 = lists[0];
		for (int i = 1; i < lists.length; i++) {
			nodes1 = merge(nodes1, lists[i]);
		}
		return nodes1;
	}

	private ListNode merge(ListNode nodes1, ListNode nodes2) {
		ListNode dummy = new ListNode(-1);
		ListNode prev = dummy;

		while (nodes1 != null && nodes2 != null) {
			if (nodes1.val > nodes2.val) {
				prev.next = nodes2;
				nodes2 = nodes2.next;
			} else { // left.val <= right.val
				prev.next = nodes1;
				nodes1 = nodes1.next;
			}
			prev = prev.next;
		}

		if (nodes1 != null) {
			prev.next = nodes1;
		} else if (nodes2 != null) {
			prev.next = nodes2;
		}
		return dummy.next;
	}

	/**
	 * 解法二: 使用最小堆构建最终的顺序
	 * 此解法性能优于第一种
	 */
	public ListNode mergeKLists2(ListNode[] lists) {
		if (lists == null || lists.length == 0) return null;

		/**
		 * 构建最小堆
		 */
		PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);

		for (ListNode list : lists) {
			if (list != null) minHeap.offer(list);
		}

		ListNode dummy = new ListNode(-1);
		ListNode cur = dummy;

		/**
		 * 不断从小顶堆中弹出最小值参与到下一轮的比较,
		 */
		while (!minHeap.isEmpty()) {
			ListNode node = minHeap.poll();
			cur.next = node;
			cur = cur.next;
			if (node.next != null) {
				minHeap.offer(node.next);
			}
		}

		return dummy.next;
	}
}
