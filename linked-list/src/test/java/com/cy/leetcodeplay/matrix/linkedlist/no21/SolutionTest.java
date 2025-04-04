package com.cy.leetcodeplay.matrix.linkedlist.no21;

import com.cy.leetcodeplay.linkedlist.no21.Solution;
import com.cy.leetcodeplay.common.entity.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] list1 = {1,2,4}, list2 = {1,3,4};
		ListNode node1 = new ListNode(list1);
		ListNode node2 = new ListNode(list2);
		ListNode res1 = solution.mergeTwoLists(node1, node2);
		Assertions.assertEquals("1 -> 1 -> 2 -> 3 -> 4 -> 4 -> null", res1.toString());

		List<Integer> res = new ArrayList<>();
		res.stream().mapToInt(Integer::intValue);
	}
}