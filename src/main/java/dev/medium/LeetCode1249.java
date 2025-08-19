package dev.medium;

//1 <= s.length <= 105
//s[i] is either '(' , ')', or lowercase English letter.

/* empty string
* contains only lowercase characters
* parentheses should valid
* */

//import org.apache.commons.lang3.StringUtils;

/* find '(' first
* we can put ')' if the '(' exist before
* we can find it by counting '('
* if ')' doesn't match with any '(' then we can remove it
* '(' also can't come with alone
* it has to meet ')'
* if '(' is come alone, then we have to remove it
* to find out this count '(' first, and when we meet ')' we can remove that count
* if we meet ')' without any count, then ')' should be removed
* if the '(''s count is not 0 after loop then '(' should be removed
* to find out this, we have to check the balance.
* if we find '(' and ')' balance, then we can put that parentheses
* if '(' not meet the balance, then we should remove it
* the parentheses will always match from the front
* so we can just remove after balanced parentheses '('
* so first time, put '(' and then remove '(' which is not matched*/
public class LeetCode1249 {
    public String minRemoveToMakeValid(String s) {
        /* s.length() >= 1 so we don't need to check empty string
        if (StringUtils.isEmpty(s)) {
            return "";
        }*/

        int balance = 0;
        int openCount = 0;
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch == ')') {
                if (openCount > 0) {
                    sb.append(ch);
                    --openCount;
                    ++balance;
                }
            } else if (ch == '(') {
                ++openCount;
                sb.append(ch);
            } else {
                sb.append(ch);
            }
        }

        StringBuilder result = new StringBuilder();
        for (char ch : sb.toString().toCharArray()) {
            if (ch == '(') {
                if (balance > 0) {
                    result.append(ch);
                    --balance;
                }
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }
}
