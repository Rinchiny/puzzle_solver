package leet_code.medium;

import java.util.Stack;

/**
 * This class provides solution for a puzzle described <a href="https://leetcode.com/problems/evaluate-reverse-polish-notation/">here</a>
 */
public class EvaluateReversePolishNotation {

    public int evalRPN(String[] tokens) {
        var stack = new Stack<Integer>();
        for (String token : tokens) {
            switch (token) {
                case "+":
                    stack.push(stack.pop()+stack.pop());
                    break;
                case "-":
                    var b = stack.pop();
                    stack.push(stack.pop() - b);
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    var del = stack.pop();
                    stack.push(stack.pop() / del);
                    break;
                default:
                    stack.push(Integer.valueOf(token));
            }
        }
        return stack.pop();
    }
}
