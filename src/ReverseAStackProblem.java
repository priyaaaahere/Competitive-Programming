import java.util.Stack;

public class ReverseAStackProblem {
    public static void reverseStack(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
        int temp=stack.pop();
        reverseStack(stack);
        insertAtBottom(stack,temp);
    }
    private static void insertAtBottom(Stack<Integer> stack,int value){
        if(stack.isEmpty()){
            stack.push(value);
            return;
        }
        int temp=stack.pop();
        insertAtBottom(stack,value);
        stack.push(temp);
    }
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        reverseStack(stack);
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }

    }
}
