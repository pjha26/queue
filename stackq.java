import java.util.Queue;
import java.util.*;
class MyStack {
    //this code is  a shorter and cleaner version use of two queues
    Queue<Integer> q1 = new LinkedList<>();  
    Queue<Integer> q2 = new LinkedList<>();

    public void push(int x) {
        if (!q1.isEmpty()) {
            q1.add(x);
        } else {
            q2.add(x);
        }
    }

    public int pop() {
        if (empty()) return -1;
        Queue<Integer> active = q1.isEmpty() ? q2 : q1;
        Queue<Integer> helper = q1.isEmpty() ? q1 : q2;
        while (active.size() > 1) {
            helper.add(active.remove());
        }
        return active.remove();
    }

    public int top() {
        if (empty()) return -1;
        Queue<Integer> active = q1.isEmpty() ? q2 : q1;
        Queue<Integer> helper = q1.isEmpty() ? q1 : q2;
        while (active.size() > 1) {
            helper.add(active.remove());
        }
        int top = active.remove();
        helper.add(top);
        return top;
    }

    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();
    }
    public static void main(String[] args) {
        
    }
}
