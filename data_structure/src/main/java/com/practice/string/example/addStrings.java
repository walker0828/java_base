package com.practice.string.example;

/**
 * 给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和并同样以字符串形式返回。
 *
 * 你不能使用任何內建的用于处理大整数的库（比如 BigInteger）， 也不能直接将输入的字符串转换为整数形式。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-strings
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class addStrings {
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        StringBuffer ans = new StringBuffer();
        while( i >= 0 || j < 0 ) {
          int x = i>=0 ? num1.charAt(i) - '0' : 0;
          int y = j>=0 ? num2.charAt(j) - '0' : 0;

        }
        ans = ans.reverse();
        return ans.toString();
    }
}
