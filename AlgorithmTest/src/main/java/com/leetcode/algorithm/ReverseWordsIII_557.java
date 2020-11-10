package com.leetcode.algorithm;
/**
 * 反转字符串中的单词 III
 * [一句话功能简述]
 * @Title: ReverseWordsIII_557.java
 * @Package com.leetcode.algorithm
 * @Description: JUST CODING
 * @author Faep
 * @date 2018年8月2日
 * @version V1.0
 */
 /**
  *[题目描述]给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
  *示例 1:
  *输入: "Let's take LeetCode contest"
  *输出: "s'teL ekat edoCteeL tsetnoc" 
 */
public class ReverseWordsIII_557 {
	public String reverseWords(String s) {
        String[] words = s.split(" ");
        String str = "";
        for (int i = 0; i < words.length; i++) {
			String word = resever(words[i]);
			str = str + word + " ";
		}
        str = str.substring(0, str.length() - 1);
        return str;
    }
	
	public String resever(String str){
		StringBuilder sb = new StringBuilder();
		char[] cs = str.toCharArray();
		for (int i = cs.length - 1; i >= 0; i--) {
			sb.append(cs[i]+"");
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String s = "enuk$)g*)(mex%y*ocdafa)ev%konbr(ucvu*kjh$kyz*djrk)rniq##jbqtwhu*r&q#gsd#ivkni (xkpffov(frqu)!&sf&stbw)@s! eq&tj)vguf!y$sstm^! @mx%khlj$jpqs*uxwxvgu vjmlw^ubivqyyljta%q&$f@mcvc&(owvgyehq#qph*fak tqxtey kexylyiwh%!bxpcqo@zgg&tklpw%phs)cbo@(&^^wn w*xhpxa@d!!vwavwqchbfmpl&z@$kztz#nc%@!tv$htr!&d(wbj^tcfpu!z)!hyf^&sc!c)z%bgufbj#obhlykh ih$vxc*to#*wombce*eo)pqftfps^c(&kf%clklc f&$murkgdhnos$%ovvaqc&las%r%s*x^cpqvk&xlbmxejlsyt^(ck$ @)ks$i!dotdz)skwc&s^zk!ma!z@ymd%d)(flj^)va*tr^xnjgd!x b!al&bvewa#wtr^pov v$aie%x&&bx#@mnwrvu&^v$je(#se&y)x$wmgzmi!%eixawazf%*g$obyggoybw#ygjg**u(it@^b)@raa#ua(w*wxensgd u(a%qinf#wgoxt(q!&rz)ktpuqrjswqr^kispf*gzv#nkyg icd)xfhdpwwvm@i$%&ov(xkbe)igwajs@v)nepqtbjtk $dexm*bapttglgj$azwcaobdj&$ol#jnoq(f&twe@ulovnliefy%(%uncco%z#%%&w@xanjxdd";
		String ret = new ReverseWordsIII_557().reverseWords(s);
		System.out.println(ret);
	}

}
