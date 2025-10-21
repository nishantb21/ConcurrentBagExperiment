import java.util.ArrayList;
import java.util.List;

public class ConcurrentBag {
    List<LinkedArrayList<SimpleDataStructure>> listOfLinkedLists;

    public ConcurrentBag(int numThreads) {
        listOfLinkedLists = new ArrayList<LinkedArrayList<SimpleDataStructure>>();

        for (int i = 0; i < numThreads; i++){
            listOfLinkedLists.add(new LinkedArrayList<SimpleDataStructure>());
        }
    }

    LinkedArrayList<SimpleDataStructure> getLinkedArrayListAtPos(int idx) {
        return listOfLinkedLists.get(idx);
    }
}
