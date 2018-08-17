package com.leetcode.algorithm;
/**
 * 回文数
 * [一句话功能简述]
 * @Title: PalindromeNumber_9.java
 * @Package com.leetcode.algorithm
 * @Description: JUST CODING
 * @author Faep
 * @date 2018年8月17日
 * @version V1.0
 */
 /**
  *[题目描述]判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
  *你能不将整数转为字符串来解决这个问题吗？
 */
public class PalindromeNumber_9 {
	
	public boolean isPalindrome(int x) {
		String str = x + "";
		String[] val = str.split("");
		for (int i = 0; i <= val.length/2; i++) {
			if(!val[i].equals(val[val.length- 1 - i]))
				return false;
		}
       return true;
    }

	public static void main(String[] args) {
		boolean val = new PalindromeNumber_9().isPalindrome(123021);
		System.out.println(val);
	}

}
