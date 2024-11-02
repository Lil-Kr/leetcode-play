package com.cy.leetcodeplay.linkedlist.no147;

import com.cy.leetcodeplay.common.entity.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {4, 2, 1, 3};
		ListNode nodes = new ListNode(nums);
		ListNode res1 = solution.insertionSortList(nodes);
		System.out.println(res1.toString());
		Assertions.assertEquals("1 -> 2 -> 3 -> 4 -> null", res1.toString());
	}
}