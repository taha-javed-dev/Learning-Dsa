package iii_stack;

import java.util.ArrayDeque;

public class EvaluatePostfix {

    public static void main(String[] args) {
        String expression = "3 4 * 2 5 * +";
        System.out.println(evaluatePostfix(expression));
    }

    public static boolean isOperator(String token) {
        return token.equals("+") 
        || token.equals("*") 
        || token.equals("/") 
        || token.equals("-") 
        || token.equals("^"); 
    }
    public static int evaluatePostfix(String expression){
       String[] tokens = expression.split(" ");

       ArrayDeque<Integer> stack = new ArrayDeque<>();
       for(String token: tokens){
        if (isOperator(token)) {
            int result = 0;
            int second = stack.pop();
            int first = stack.pop();
            switch (token) {
                case "+":
                    result = first + second;
                    break;
                case "*":
                    result = first * second;
                    break;
                case "/":
                    result = first / second;
                    break;
                case "-":
                    result = first / second;
                    break;
                 case "^":
                    result = (int) Math.pow(first, second);
                    break;
            }
            stack.push(result);
        } else {
            stack.push(Integer.parseInt(token));
        }
       }
       return stack.pop();
    }
}