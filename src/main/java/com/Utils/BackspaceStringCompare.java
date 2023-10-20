/**
 Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.

 Note that after backspacing an empty text, the text will continue empty.



 Example 1:

 Input: s = "ab#c", t = "ad#c"
 Output: true
 Explanation: Both s and t become "ac".
 Example 2:

 Input: s = "ab##", t = "c#d#"
 Output: true
 Explanation: Both s and t become "".
 Example 3:

 Input: s = "a#c", t = "b"
 Output: false
 Explanation: s becomes "c" while t becomes "b".
 */

package com.Utils;
import java.util.*;
public class BackspaceStringCompare {
    public static boolean backspaceCompare(String s, String t) {

        Stack<Character> typedTextS = new Stack<Character>();
        for(int i =0;i<=s.length()-1;i++)
        {

            if(s.charAt(i)=='#'&& !typedTextS.isEmpty())
            {
                typedTextS.pop();

            }
            else if(s.charAt(i)=='#'&& typedTextS.isEmpty())
            {
                //do nothing

            }
            else
            {
                typedTextS.push((Character)s.charAt(i));
            }

        }
        System.out.println("String S is ="+typedTextS);

        Stack<Character> typedTextT = new Stack<Character>();
        for(int i =0;i<=t.length()-1;i++)
        {

            if(t.charAt(i)=='#' && !typedTextT.isEmpty())
            {
                typedTextT.pop();

            }
            else if(t.charAt(i)=='#' && typedTextT.isEmpty())
            {
                //do nothing

            }
            else{
                typedTextT.push((Character)t.charAt(i));
            }

        }
        System.out.println("String T is ="+typedTextT);
        boolean output;
        if(typedTextS.isEmpty() && typedTextT.isEmpty())
        {
            output=true;

        }


        output = typedTextS.equals(typedTextT);
        System.out.println(output);
        return output;

    }
}

