package com.pack.recursion;

import java.util.Stack;

public class PopMiddleStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        PopMiddleStack popMiddleStack = new PopMiddleStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        popMiddleStack.checkStack(stack);
    }

    public void checkStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            System.out.print("stack is empty");
            return;
        }
        int mid = stack.size() / 2 + 1;
        solve(stack, mid);

        for (Integer integer : stack) {
            System.out.print(integer + " ");
        }
    }

    public void solve(Stack<Integer> s, int mid) {
        if (mid == 1) {
            s.pop();
        } else {
            int value = s.pop();
            solve(s, mid - 1);
            s.push(value);
        }
    }
}
