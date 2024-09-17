package com.cy.leetcodeplay.stack.no394;

import java.util.Stack;

/**
 * @Author: Lil-K
 * @Date: 2024/9/17
 * @Description: no.394. Decode String
 */
public class Solution {

	/**
	 *
	 * @param s
	 * @return
	 */
	public String decodeString(String s) {
		Stack<Integer> numStack = new Stack<>();
		Stack<String> strStack = new Stack<>();
		StringBuilder curString = new StringBuilder();
		int k = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (Character.isDigit(ch)) {
				k = k * 10 + (ch - '0');
			} else if (ch == '[') {
				numStack.push(k);
				strStack.push(curString.toString());
				curString = new StringBuilder();
				k = 0;
			} else if (ch == ']') { // pop decode
				String pop = strStack.pop();
				StringBuilder decodedString = new StringBuilder(pop);
				int time = numStack.pop();
				for (int j = 0; j < time; j++) {
					decodedString.append(curString);
				}
				curString = decodedString;
			} else {
				curString.append(ch);
			}
		}
		return curString.toString();
	}
}
