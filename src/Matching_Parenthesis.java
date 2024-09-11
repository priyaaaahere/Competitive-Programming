import java.util.Stack;

public class Matching_Parenthesis {
    public static boolean hasDuplicateParenthesis(String expression){
        Stack<Character> stack=new Stack<>();
        for(char ch: expression.toCharArray()){
            if (ch==')'){
                int elementsInside=0;
                //Pop characters from the stack
                while(stack.peek() !='('){
                    stack.pop();
                    elementsInside++;
                }
                //Pop the opening parenthesis '('
                stack.pop();
                //If there were less than 1 element inside, it's a duplicate parenthesis
                if(elementsInside<1){
                    return true;//Duplicate parenthesis found
                }
            }
            else{
                stack.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String expr1="((a+b))";//Has duplicate parenthesis
        String expr2="(a+(b)/c)";//No duplicate parenthesis
        String expr3="(a+b*(c-d))";//No duplicate parenthesis
        System.out.println("Expression 1 has duplicate parentheses:"+hasDuplicateParenthesis(expr1));
        System.out.println("Expression 2 has duplicate parentheses:"+hasDuplicateParenthesis(expr2));
        System.out.println("Expression 3 has duplicate parentheses:"+hasDuplicateParenthesis(expr3));

    }
}
