package com.cy.leetcodeplay.binarytree.bt.no113;

import com.cy.leetcodeplay.common.entity.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Lil-K
 * @Date: 2024/10/3
 * @Description: no.113. Path Sum II
 * link: https://leetcode.com/problems/path-sum-ii/
 *
 * 这是一个典型的树的 回溯 问题. 你需要从根节点开始向下递归遍历每一条路径, 计算当前路径上的节点值之和, 直到到达叶子节点.
 * 如果路径和等于目标值 targetSum, 则将该路径添加到结果列表中.
 * 使用 深度优先搜索（DFS） 来遍历树, 并且使用回溯法来保存并恢复当前路径.
 */
public class Solution {

	private List<List<Integer>> res = new ArrayList<>();

	/**
	 * solution1:
	 * @param root
	 * @param targetSum
	 * @return
	 */
	public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
		if (root == null) return res;

		dfs(root, targetSum, new ArrayList<>());
		return res;
	}

	public void dfs(TreeNode node, int targetSum, List<Integer> curList) {
		if (node == null) return;
		/**
		 * 加入list
		 */
		curList.add(node.val);

		if (node.left == null && node.right == null && node.val == targetSum) {
			// 递归到底时, 最后一个 node.val == targetSum, 说明从 root 到 end 中, 存在一条路径sum == targetSum
			res.add(new ArrayList<>(curList));
		} else {
			/**
			 * 减去自身 node.val
			 */
			dfs(node.left, targetSum - node.val, curList);
			dfs(node.right, targetSum - node.val, curList);
		}
		// backtrack
		curList.remove(curList.size() - 1);
	}
}