package com.leetcode.algorithm;
/**
 * Excel表列序号
 * [一句话功能简述]
 * @Title: ExcelSheetColumnNumber_171.java
 * @Package com.leetcode.algorithm
 * @Description: JUST CODING
 * @author Faep
 * @date 2018年8月2日
 * @version V1.0
 */
 /**
  *[题目描述]给定一个Excel表格中的列名称，返回其相应的列序号。
  *例如，
    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 
    ZY -> 701
    ZZ -> 702
    AAA -> 703
    ...
 */
public class ExcelSheetColumnNumber_171 {
	// 理解成26进制
	public int titleToNumber(String s) {
		int res = 0;
		for (int i = 0; i < s.length(); i++) {
			res = res * 26 + (s.charAt(i) - 'A' + 1);
		}
		return res;
	}

	public static void main(String[] args) {
		int ret = new ExcelSheetColumnNumber_171().titleToNumber("ZZZ");
		System.out.println(ret);
	}

}
