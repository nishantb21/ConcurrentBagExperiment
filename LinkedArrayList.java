public class LinkedArrayList<T> {
    public LinkedArrayListNode<T> head;

    public LinkedArrayList() {
        head = null;
    }

    void add(T elem) {
        LinkedArrayListNode<T> newHead = new LinkedArrayListNode<T>();
        newHead.setNext(null );
        if (head == null) {
            
            head = newHead;
        } else {

        }
    }
}
