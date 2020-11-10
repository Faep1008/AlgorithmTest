package com.leetcode.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * 自除数
 * [一句话功能简述]
 * @Title: SelfDividingNumbers_728.java
 * @Package com.leetcode.algorithm
 * @Description: JUST CODING
 * @author Faep
 * @date 2018年8月2日
 * @version V1.0
 */
 /**
  *[题目描述]自除数 是指可以被它包含的每一位数除尽的数。
  *例如，128 是一个自除数，因为 128 % 1 == 0，128 % 2 == 0，128 % 8 == 0。
  *还有，自除数不允许包含 0 。
  *给定上边界和下边界数字，输出一个列表，列表的元素是边界（含边界）内所有的自除数。
  *每个输入参数的边界满足 1 <= left <= right <= 10000。
 */
public class SelfDividingNumbers_728 {
	
	public List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> list = new ArrayList<>();
		for (int i = left; i <= right; i++) {
			if(isSelfDividingNumber(i))
				list.add(i);
		}
		return list;
	}
	
	public boolean isSelfDividingNumber(int num){
		String snum = num + "";
		if(snum.contains("0"))
			return false;
		for (int i = 0; i < snum.length(); i++) {
			int n = Integer.parseInt(snum.charAt(i) + "");
			if(num % n == 0)
				continue;
			else
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int left = 1;
		int right = 22;
		List<Integer> list = new SelfDividingNumbers_728().selfDividingNumbers(left, right);
		System.out.println(list);
	}

}
