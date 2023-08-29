/**
 * Detect Capital
 * We define the usage of capitals in a word to be right when one of the following cases holds:
 *
 * All letters in this word are capitals, like "USA".
 * All letters in this word are not capitals, like "leetcode".
 * Only the first letter in this word is capital, like "Google".
 * Given a string word, return true if the usage of capitals in it is right.
 *
 *
 *
 * Example 1:
 *
 * Input: word = "USA"
 * Output: true
 * Example 2:
 *
 * Input: word = "FlaG"
 * Output: false
 *
 */

package com.Utils;

public class DetectCapitalinString {
    public static boolean detectCapitalUse(String word) {
        boolean flag=false;
        if(word.equals(word.toUpperCase()))
        {
            flag=true;
        }
        else if(word.equals(word.toLowerCase()))
        {
            flag=true;
        }
        else if(Character.isUpperCase(word.charAt(0))){
            flag=true;
            for(int i=1;i<word.length();i++){
                if(Character.isUpperCase(word.charAt(i)))
                {
                    flag=false;
                    break;
                }

            }

        }

        return flag;
    }
}

