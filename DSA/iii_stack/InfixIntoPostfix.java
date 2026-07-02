// package stack;

// import java.util.ArrayDeque;

// public class InfixIntoPostfix {
//     public static void main(String[] args) {
        
//     }

//     public static boolean isOperator(String token) {
//         return token.equals("+") 
//         || token.equals("*") 
//         || token.equals("/") 
//         || token.equals("-") 
//         || token.equals("^"); 
//     }

//     public static int infixIntoPrifix(String expression) {

//         String[] tokens = expression.split(" ");
//         StringBuilder sb = new StringBuilder();
//         ArrayDeque<Integer> stack = new ArrayDeque<>();

//         for (String token : tokens) {
//             if ("(" == token) {
//                 sb.append(token);
//             } else if (")" == token) {
//                 while (!stack.isEmpty() && stack.peek() != "(") {
                    
//                 }
//             } else if (condition) {
                
//             } else { //Operand

//             }
//         }
//         return 0;
//     }

// }
