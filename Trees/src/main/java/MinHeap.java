import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinHeap {
    private List<Integer> heap;

    public MinHeap() {
        heap = new ArrayList<>();
    }

    public int extractMin(){
        int lastElement = heap.size() - 1;
        Collections.swap(heap, 0, lastElement);
        int min = heap.get(lastElement);
        heap.remove(lastElement);
        int index = 0;
        int indexToCompare = getIndexToCompareExtract(index);
        Pair<Integer, Integer> childrenMin = getIndexAndValueMinChild(indexToCompare);
        while (heap.get(index) > childrenMin.getValue()){
            Collections.swap(heap, index, childrenMin.getIndex());
            index = indexToCompare;
            indexToCompare = getIndexToCompareExtract(index);
            childrenMin = getIndexAndValueMinChild(indexToCompare);
        }
        return min;
    }


    public List<Integer> insert(int number) {
        heap.add(number);
        int index = heap.size() - 1;
        int indexToCompare = getIndexToCompare(index);
        while (number < heap.get(indexToCompare)) {
            Collections.swap(heap, index, indexToCompare);
            index = indexToCompare;
            indexToCompare = getIndexToCompare(indexToCompare);
        }
        return heap;
    }

    public List<Integer> copyOf(){
        return new ArrayList<>(heap);
    }

    private int getIndexToCompare(int index) {
        if (index == 0) {
            return index;
        }
        return index % 2 == 0 ? index / 2 - 1 : index / 2;
    }

    private int getIndexToCompareExtract(int index) {
        if(2 * index + 1 >= heap.size() - 1){
            return index;
        }
        return 2 * index + 1;
    }

    private Pair<Integer, Integer> getIndexAndValueMinChild(int firstChildIndex){
        int minChildValue = Math.min(heap.get(firstChildIndex), heap.get(firstChildIndex + 1));

        if(minChildValue == heap.get(firstChildIndex)){
            return new Pair<>(firstChildIndex, minChildValue);
        }
        else{
            return new Pair<>(firstChildIndex + 1, minChildValue);
        }
    }
}
