package com.cy.leetcodeplay.linkedlist.no25;

import com.cy.leetcodeplay.common.entity.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {1, 2, 3, 4, 5};
		int k = 2;
		ListNode nodes = new ListNode(nums);
		ListNode res1 = solution.reverseKGroup(nodes, k);
		System.out.println(res1);
		Assertions.assertEquals("2 -> 1 -> 4 -> 3 -> 5 -> null", res1.toString());
	}
}