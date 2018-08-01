package com.leetcode.algorithm;

/**
 * To Lower Case
 * [一句话功能简述]
 * @Title: ToLowerCase.java
 * @Package com.leetcode.algorithm
 * @Description: JUST CODING
 * @author Faep
 * @date 2018年7月31日
 * @version V1.0
 */
 /**
  *[题目描述]实现函数 ToLowerCase()，该函数接收一个字符串参数 str，并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。
 */
public class ToLowerCase {

	/**
	 * ASCII
	 * A -> 65
	 * Z -> 90
	 * a -> 97
	 * z -> 122
	 * @param str
	 * @return
	 */
	public String toLowerCase(String str) {
		
		StringBuffer ret = new StringBuffer();
		for(int i = 0; i < str.length(); i++){
			char c = str.charAt(i);
			int val = c;
			if(val < 91 && val > 64)
				val = val + 32;
			c = (char)val;
			
			ret.append(c+"");
		}
		
		return ret.toString();
	}

	public static void main(String[] args) {
		String ret = new ToLowerCase().toLowerCase("al&phaBET");
		System.out.println(ret);
	}

}
