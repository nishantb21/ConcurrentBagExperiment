package app.src.main.java.org.matrix;

public class LinkedArrayList<T> {
    public LinkedArrayListNode<T> head;

    public LinkedArrayList() {
        head = null;
    }

    void add(T elem) {
        LinkedArrayListNode<T> newHead = new LinkedArrayListNode<T>();
        newHead.setNext(head);
        head = newHead;
    }
}
