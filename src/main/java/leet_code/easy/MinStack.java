package leet_code.easy;

import java.util.Objects;
import java.util.Stack;

/**
 * This class provides solution for a puzzle described <a href="https://leetcode.com/problems/min-stack/">here</a>
 */
public class MinStack {

    private final Stack<Integer> stack;
    private final Stack<Integer> minStack;


    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if (minStack.empty()) {
            minStack.push(val);
        } else if (val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {
        var popped = stack.pop();
        if (Objects.equals(popped, minStack.peek())) {
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
