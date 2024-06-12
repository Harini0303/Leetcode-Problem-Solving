//problem : https://leetcode.com/problems/longest-common-prefix/description/

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        Arrays.sort(strs);

        int c = 0;
        String first = strs[0], last = strs[n - 1];

        while (c < first.length()) {
            if (first.charAt(c) == last.charAt(c)) {
                c++;
            } else {
                break;
            }
        }
        
        return first.substring(0, c);
    }
}


