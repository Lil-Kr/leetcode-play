package com.cy.leetcodeplay.array.no859;

/**
 * @Author: Lil-K
 * @Date: 2024/9/2
 * @Description:
 */
public class Solution {

	public static void main(String[] args) {

	}

	public boolean buddyStrings(String s, String goal) {
		if (s.length() != goal.length()) {
			return false;
		}

		if(s.equals(goal)){ // "abc" and "abc" --> false,  aa and aa  --> true

		} else { // "abc" and "acb" --> true,  "abc" and "eaf"

		}


		return false;
	}
}
