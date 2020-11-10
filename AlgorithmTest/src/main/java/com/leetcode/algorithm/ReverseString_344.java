package com.leetcode.algorithm;
/**
 * 反转字符串
 * [一句话功能简述]
 * @Title: ReverseString_344.java
 * @Package com.leetcode.algorithm
 * @Description: JUST CODING
 * @author Faep
 * @date 2018年8月2日
 * @version V1.0
 */
 /**
  *[题目描述]请编写一个函数，其功能是将输入的字符串反转过来。
 */
public class ReverseString_344 {
	
	public String reverseString(String s) {
		StringBuilder sb = new StringBuilder();
		char[] cs = s.toCharArray();
		for (int i = cs.length - 1; i >= 0; i--) {
			sb.append(cs[i]+"");
		}
        return sb.toString();
    }

	public static void main(String[] args) {
		String str = "hello";
		String res = new ReverseString_344().reverseString(str);
		System.out.println(res);
	}

}
