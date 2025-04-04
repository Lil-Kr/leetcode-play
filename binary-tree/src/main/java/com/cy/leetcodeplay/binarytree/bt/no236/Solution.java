package com.cy.leetcodeplay.binarytree.bt.no236;

import com.cy.leetcodeplay.common.entity.TreeNode;

/**
 * @Author: Lil-K
 * @Date: 2024/10/16
 * @Description: no.236. Lowest Common Ancestor of a Binary Tree
 *
 * 1. 如果在左子树找到了 p 或 q，在右子树找到了另一个节点，那么当前节点就是最近公共祖先.
 * 2. 如果在当前节点或其左右子树中找到了 p 或 q，而另一侧没有找到，则继续递归查找.
 * 3. 递归的基准条件是当前节点为 null（到达叶子节点的终点）或者当前节点是 p 或 q 本身.
 */
public class Solution {

	/**
	 *
	 * @param root
	 * @param p
	 * @param q
	 * @return
	 */
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if (root == null || root.val == p.val || root.val == q.val) {
			return root;
		}

		// 在左子树中查找 p 和 q
		TreeNode left = lowestCommonAncestor(root.left, p, q);
		// 在右子树中查找 p 和 q
		TreeNode right = lowestCommonAncestor(root.right, p, q);

		// 如果左右子树都找到了 p 或 q，则当前节点是 LCA
		if (left != null && right != null) {
			return root;
		}

		// 如果左子树找到 p 或 q，返回左子树结果；否则返回右子树结果
		return left != null ? left : right;
	}
}
