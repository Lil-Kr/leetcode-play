package com.cy.leetcodeplay.matrix.linkedlist.no160;

import com.cy.leetcodeplay.linkedlist.no160.Solution;
import com.cy.leetcodeplay.common.entity.ListNode;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums1 = {4, 1, 8, 4, 5};
		int[] nums2 = {5, 6, 1, 8, 4, 5};
		ListNode node1 = new ListNode(nums1);
		ListNode node2 = new ListNode(nums2);

		ListNode res1 = solution.getIntersectionNode(node1, node2);
	}
}