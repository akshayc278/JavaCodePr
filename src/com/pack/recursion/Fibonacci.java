package com.pack.recursion;

public class Fibonacci {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        //int output = fibonacci.fibo(5);
        int output = fibonacci.fibo(8);
        System.out.println(output);
    }

    public int fibo(int n) {
        if (n == 0) {
            return 0;
        }
        // Base cases return itself 0 and 1
        else if (n == 1) {
            return 1;
        } else {
            return fibo(n - 1) + fibo(n - 2);
            // Recursive calls
        }
    }
}
