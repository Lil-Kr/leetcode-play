package com.cy.leetcodeplay.question.bt.no105;

import com.alibaba.fastjson2.JSONArray;
import com.cy.common.entity.TreeNode;
import com.cy.common.helper.Helper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] preorder = {3, 9, 20, 15, 7}, inorder = {9, 3, 15, 20, 7};
		TreeNode res1 = solution.buildTree(preorder, inorder);

		List<Integer> inOrderArray = Helper.getInOrderArray(res1);
		Assertions.assertEquals(JSONArray.toJSONString(inorder), JSONArray.toJSONString(inOrderArray));
	}
}