//Rahul Singh Thakur
import java.util.EmptyStackException;

public class ListStack implements DStack {
    Node head;
    int length;

    class Node {
        double data;
        Node next;
    }

    public ListStack() {
        head = null;
        length = 0;
    }

    @Override
    public boolean isEmpty() {
        return (length == 0);
    }

    @Override
    public boolean push(double data) {
        Node oldHead = head;
        head = new Node();
        head.data = data;
        head.next = oldHead;
        length++;
        return true;

    }

    @Override
    public double pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            double data = head.data;
            head = head.next;
            length--;
            return data;
        }

    }

    @Override
    public double peek() {
        if (isEmpty()) throw new EmptyStackException();
        return head.data;
    }

}

