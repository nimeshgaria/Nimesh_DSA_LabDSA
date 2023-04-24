package org.glearning;

import java.util.Stack;

public class BalancedBrackets {
    public static boolean isBalanced(String input){
        Stack<Character> stack = new Stack<>();

        for(int index = 0; index < input.length(); index++){
            char ch = input.charAt(index);
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            } else if(ch == ')' || ch == '}' || ch == ']')  {
                char top = stack.pop();
                if(
                        (ch == ')' && top != '(') ||
                                (ch == '}' && top != '{')||
                                (ch == ']' && top != '[')
                ){
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
