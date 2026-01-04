import java.util.*;
/* public class queuestacks {
    static class Queue{
        static Stack<Integer>s1= new Stack<>();
        static Stack<Integer>s2=new Stack<>();
        public static boolean isEmpty(){
            return s1.isEmpty();
        }
        //add
        public static void main(String[] args) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
                s1.push(data);
                while (!s2.isEmpty()) {
                    s1.push(s2.pop());
                }
            }
            //remove
            public static int remove(){
                if (isEmpty()) {
                    System.out.println("queue empty");
                    return -1;
                }
                return s1.pop();
            }
            //peek
            public static int push(){
                if(isEmpty()){
                    System.out.println("queue Empty");
                    return -1;
                }
                return s1.peek();
        }
    }

}
}  */
import java.util.Stack;

public class MyQueue {

    private Stack<Integer> s1 = new Stack<>();
    private Stack<Integer> s2 = new Stack<>();

    public void push(int x) {
        s1.push(x);
    }

    public int pop() {
        shift();
        return s2.pop();
    }

    public int peek() {
        shift();
        return s2.peek();
    }

    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }

    private void shift() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
    }

    // MAIN METHOD (runs in VS Code)
    public static void main(String[] args) {

        MyQueue q = new MyQueue();

        q.push(1);
        q.push(2);
        q.push(3);

        System.out.println(q.pop());   // 1
        System.out.println(q.peek());  // 2
        System.out.println(q.empty()); // false
    }
}



