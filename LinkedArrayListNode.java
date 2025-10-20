import java.util.ArrayList;
import java.util.List;

public class LinkedArrayListNode<T> {
    public List<T> arrayBlock;
    public LinkedArrayListNode<T> next;
    private int DEFAULT_BLOCK_SIZE = 64;

    public LinkedArrayListNode() {
        arrayBlock = new ArrayList<T>(DEFAULT_BLOCK_SIZE);
        next = null;
    }

    public <T>void add(int index,T data) {
        arrayBlock.set(index, data);
    }
}
