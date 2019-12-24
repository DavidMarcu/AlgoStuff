package sorter;

import java.util.Collections;
import java.util.List;

// For quicksorter the collection needs to be modifiable otherwise it will throw UnsupportedOperationException
public class QuickSorter<T extends Number> implements Sorter<T> {

    @Override
    public List<T> customSort(List<T> list) {
        quicksort(list, 0, list.size() - 1);
        return list;
    }

    private void quicksort(List<T> list, int left, int right) {
        if(left >= right)
            return;
        int partition = getPartition(list, left, right);
        quicksort(list, left, partition - 1);
        quicksort(list, partition + 1, right);
    }

    private int getPartition(List<T> list, int left, int right) {
        T pivot = list.get(right);
        int originalRight = right;
        right--;
        while(left <= right){
            boolean leftSwap = true, rightSwap = true;
            if(compare(list.get(left), pivot) < 0){
                left++;
                leftSwap = false;
            }
            if(compare(list.get(right), pivot) > 0){
                right--;
                rightSwap = false;
            }
            if(leftSwap && rightSwap){
                Collections.swap(list, left, right);
                left++;
                right--;
            }
        }
        Collections.swap(list, left, originalRight);
        return left;
    }
}
