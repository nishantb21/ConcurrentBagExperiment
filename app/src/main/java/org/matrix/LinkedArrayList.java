package app.src.main.java.org.matrix;

public class LinkedArrayList<T> {
    public LinkedArrayListNode<T> head;

    public LinkedArrayList() {
        head = null;
    }

    public void addBlock() {
        LinkedArrayListNode<T> newHead = new LinkedArrayListNode<T>();
        newHead.setNext(head);
        head = newHead;
    }

    public void addElement(T elem) {
        if (head == null || (head != null && head.isFull())) {
            addBlock();
        }
        head.add(elem);
    }

    public String toString() {
        LinkedArrayListNode<T> node = head;
        StringBuilder s = new StringBuilder();

        while (node != null) {
            s.append(node.toString());
            node = node.next;
            s.append("->");
        }

        return s.toString();
    }
}
