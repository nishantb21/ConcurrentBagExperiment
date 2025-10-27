package app.src.main.java.org.matrix;

import java.util.ArrayList;
import java.util.List;

public class LinkedArrayListNode<T> {
    public List<T> arrayBlock;
    public LinkedArrayListNode<T> next;
    private int DEFAULT_BLOCK_SIZE = 64;
    private int currentIndex = 0;

    public LinkedArrayListNode() {
        arrayBlock = new ArrayList<T>(DEFAULT_BLOCK_SIZE);
        next = null;
    }

    public void add(T data) {
        arrayBlock.set(currentIndex, data);
        currentIndex += 1;
    }

    public void setNext(LinkedArrayListNode<T> nxt) {
        next = nxt;
    }
}
