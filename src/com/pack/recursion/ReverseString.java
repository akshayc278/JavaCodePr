package com.pack.recursion;

public class ReverseString {
    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        String output = reverseString.reverse(6, "akshay");
        System.out.println(output);

    }

    public String reverse(int n, String str) {
        if (n == 1) {
            return str.substring(0, 1);
        } else {
            return str.charAt(n - 1) + reverse(n - 1, str);
        }
    }

}
