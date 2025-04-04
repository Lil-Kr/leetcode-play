package com.cy.leetcodeplay.matrix.linkedlist.no23;

import com.cy.leetcodeplay.linkedlist.no23.Solution;
import com.cy.leetcodeplay.common.entity.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums1 = {1, 4, 5};
		int[] nums2 = {1, 3, 4};
		int[] nums3 = {2, 6};
		ListNode node1 = new ListNode(nums1);
		ListNode node2 = new ListNode(nums2);
		ListNode node3 = new ListNode(nums3);

		ListNode[] nodes = {node1, node2, node3};
		ListNode res1 = solution.mergeKLists2(nodes);
		System.out.println(res1);
		Assertions.assertEquals("1 -> 1 -> 2 -> 3 -> 4 -> 4 -> 5 -> 6 -> null", res1.toString());
	}
}