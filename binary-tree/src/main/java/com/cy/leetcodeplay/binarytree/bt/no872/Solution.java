package com.cy.leetcodeplay.binarytree.bt.no872;

import com.cy.leetcodeplay.common.entity.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Lil-K
 * @Date: 2025/9/1
 * @Description: no.872. Leaf-Similar Trees
 * link: https://leetcode.com/problems/leaf-similar-trees/description/
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 *
	 * @param root1
	 * @param root2
	 * @return
	 */
	public boolean leafSimilar(TreeNode root1, TreeNode root2) {
		if (root1 == null || root2 == null) return false;

		List<Integer> leaves1 = new ArrayList<>();
		List<Integer> leaves2 = new ArrayList<>();

		dfs(root1, leaves1);
		dfs(root2, leaves2);
		return leaves1.equals(leaves2);
	}

	private void dfs(TreeNode node, List<Integer> list) {
		if (node == null) return;

		if (node.left == null && node.right == null) {
			list.add(node.val);
		}
		dfs(node.left, list);
		dfs(node.right, list);
	}


}