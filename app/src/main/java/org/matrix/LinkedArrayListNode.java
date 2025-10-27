package app.src.main.java.org.matrix;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LinkedArrayListNode<T> {
    public List<T> arrayBlock;
    public LinkedArrayListNode<T> next;
    private int DEFAULT_BLOCK_SIZE = 1;
    private int currentIndex = 0;

    public LinkedArrayListNode() {
        arrayBlock = new ArrayList<T>(DEFAULT_BLOCK_SIZE);
        next = null;
    }

    public void add(T data) {
        arrayBlock.add(data);
        currentIndex += 1;
    }

    public void setNext(LinkedArrayListNode<T> nxt) {
        next = nxt;
    }

    public boolean isFull() {
        return currentIndex == DEFAULT_BLOCK_SIZE;
    }

    public String toString() {
        List<String> values = arrayBlock.stream().map(String::valueOf).toList();
        return String.join(",", values);
    }
}
