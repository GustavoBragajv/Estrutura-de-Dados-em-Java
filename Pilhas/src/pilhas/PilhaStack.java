import java.util.Stack;

public class PilhaStack {
    public static void main(String[] args) {
        Stack<Integer> pilhaStack = new Stack<Integer>();


        System.out.println(pilhaStack.isEmpty());

        pilhaStack.push(1);
        pilhaStack.push(15);
        pilhaStack.push(99);
        pilhaStack.push(25);

        System.out.println(pilhaStack.isEmpty());
        System.out.println(pilhaStack.size());
        System.out.println(pilhaStack.toString());
        System.out.println(pilhaStack.peek());
        System.out.println(pilhaStack.pop());

        System.out.println(pilhaStack.toString());

    }
}
