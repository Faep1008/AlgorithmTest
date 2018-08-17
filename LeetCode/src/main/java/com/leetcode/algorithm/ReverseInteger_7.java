package com.leetcode.algorithm;
/**
 * 反转整数
 * [一句话功能简述]
 * @Title: ReverseInteger_7.java
 * @Package com.leetcode.algorithm
 * @Description: JUST CODING
 * @author Faep
 * @date 2018年8月17日
 * @version V1.0
 */
 /**
  *[题目描述]给定一个 32 位有符号整数，将整数中的数字进行反转。
  *假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−231,  231 − 1]。根据这个假设，如果反转后的整数溢出，则返回 0。
 */
public class ReverseInteger_7 {
	public int reverse(int x) {
		boolean fs = false;
		if(x <0)
			fs = true;
		String v = x + "";
		if(fs)
			v = v.substring(1);
		String val = "";
		for (int i = v.length() - 1; i >= 0; i--) {
			val += v.charAt(i);
		}
		if(fs)
			val = "-" + val;
		try {
			return Integer.parseInt(val);
		} catch (NumberFormatException e) {
			return 0;
		}
    }
	public static void main(String[] args) {
		int val = new ReverseInteger_7().reverse(-123);
		System.out.println(val);
	}

}
