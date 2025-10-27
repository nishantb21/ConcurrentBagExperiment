package app.src.main.java.org.matrix;

import java.util.ArrayList;
import java.util.List;

public class ConcurrentBag<T> {
    List<LinkedArrayList<T>> listOfLinkedLists;

    public ConcurrentBag(int numThreads) {
        listOfLinkedLists = new ArrayList<LinkedArrayList<T>>();

        for (int i = 0; i < numThreads; i++){
            listOfLinkedLists.add(new LinkedArrayList<T>());
        }
    }

    LinkedArrayList<T> getLinkedArrayListAtPos(int idx) {
        return listOfLinkedLists.get(idx);
    }

    public void addItem(int threadIdx, T elem) {
        listOfLinkedLists.get(threadIdx).addElement(elem);
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < listOfLinkedLists.size(); i++) {
            s.append("THREAD NUM: " + i);
            s.append(listOfLinkedLists.get(i).toString());
            s.append("\n");
        }


        return s.toString();
    }
}
