package com.Utils;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int k = FirstOccurrenceOfString.occurrence("sadbutsad","sad");
        System.out.println("k = " + k);
        String s="ab#c", t= "ad#c";
        Boolean Equals = BackspaceStringCompare.backspaceCompare(s,t);
        System.out.println("backSpace Comparison of String ="+Equals);
    }
}