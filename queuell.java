public class QueueLL{
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;
    static Node tail = null;

    public static boolean isEmpty() {
        return head == null && tail == null;
    }

    // add (enqueue)
    public static void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // remove (dequeue)
    public static int remove() {
        if (isEmpty()) {
            System.out.println("empty queue");
            return -1;
        }
        int front = head.data;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
        return front;
    }

    // peek
    public static int peek() {
        if (isEmpty()) {
            System.out.println("empty queue");
            return -1;
        }
        return head.data;
    }

    public static void main(String[] args) {
        QueueLL q = new QueueLL();

        q.add(3);
        q.add(5);
        q.add(7);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
