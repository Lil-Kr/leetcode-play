package com.cy.leetcodeplay.stack.no71;

import java.util.Stack;

/**
 * @Author: Lil-K
 * @Date: 2024/9/18
 * @Description: no.71. Simplify Path
 */
public class Solution {

	/**
	 *
	 * @param path
	 * @return
	 */
	public String simplifyPath(String path) {
		Stack<String> stack = new Stack<>();
		String[] components = path.split("/");
		for (String component : components) {
			// 如果是 ".." 并且栈不为空，则返回上一级目录
			if (component.equals("..")) {
				if (!stack.isEmpty()) {
					stack.pop();
				}
			} else if (!component.equals("") && !component.equals(".")) { // 如果是有效的文件夹名称，压入栈中
				stack.push(component);
			}
		}

		/**
		 * build simple path
		 */
		StringBuilder simple = new StringBuilder();
		for (String dir : stack) {
			simple.append("/").append(dir);
		}
		return simple.length() > 0 ? simple.toString() : "/";
	}
}
