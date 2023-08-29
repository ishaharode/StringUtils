/**
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
 *
 * Given a string s, return true if it is a palindrome, or false otherwise.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 * Example 2:
 *
 * Input: s = "race a car"
 * Output: false
 * Explanation: "raceacar" is not a palindrome.
 * Example 3:
 *
 * Input: s = " "
 * Output: true
 * Explanation: s is an empty string "" after removing non-alphanumeric characters.
 * Since an empty string reads the same forward and backward, it is a palindrome.
 */
package com.Utils;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        boolean flag=true;
        String str = s.toLowerCase();
        str = str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(str);
        for(int i=0,j=str.length()-1;i<str.length();i++,j--)
        {
            if(i>j){
                break;
            }
            if(str.charAt(i)!=str.charAt(j)){

                flag=false;
                break;
            }


        }

        return flag;
    }
}
