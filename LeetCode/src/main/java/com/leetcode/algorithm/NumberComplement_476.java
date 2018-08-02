package com.leetcode.algorithm;
/**
 * 数字的补数
 * [一句话功能简述]
 * @Title: NumberComplement_476.java
 * @Package com.leetcode.algorithm
 * @Description: JUST CODING
 * @author Faep
 * @date 2018年8月2日
 * @version V1.0
 */
 /**
  *[题目描述]给定一个正整数，输出它的补数。补数是对该数的二进制表示取反。
  *注意:
  *给定的整数保证在32位带符号整数的范围内。
  *你可以假定二进制数不包含前导零位。
 */
public class NumberComplement_476 {

	public int findComplement(int num) {
		// 现获取到二进制的表示
		String bs = Integer.toBinaryString(num);
		// 求取反后的二进制
		char[] cs = bs.toCharArray();
		for (int i = 0; i < cs.length; i++) {
			if(cs[i] == '0')
				cs[i] = '1';
			else
				cs[i] = '0';
		}
		int index = 0;
		double val = 0;
		for (int i = cs.length - 1; i >= 0; i--) {
			if(cs[i] == '1'){
				val += Math.pow(2, index);
			}
			index ++ ;
		}
		return (int)val;
	}
	
	public static void main(String[] args) {
		int index = 5;
		int val = new NumberComplement_476().findComplement(index);
		System.out.println(val);
		
	}

}
