package sorter;

import java.util.ArrayList;
import java.util.List;

public class MergeSorter<T extends Number> implements Sorter<T>{

    @Override
    public List<T> customSort(List<T> list) {
        if(list.size() == 1){
            return list;
        }
        var middle = list.size() / 2;
        var leftList = customSort(list.subList(0, middle));
        var rightList = customSort(list.subList(middle, list.size()));
        return mergeList(leftList, rightList);
    }

    private List<T> mergeList(List<T> listLeft, List<T> listRight){
        List<T> mergedList = new ArrayList<>();

        int leftIndex = 0, rightIndex = 0;
        while (leftIndex < listLeft.size() && rightIndex < listRight.size()){
            T numberLeft = listLeft.get(leftIndex);
            T numberRight = listRight.get(rightIndex);
            if(compare(numberLeft, numberRight) < 0){
                mergedList.add(numberLeft);
                leftIndex ++;
            }
            else{
                mergedList.add(numberRight);
                rightIndex ++;
            }
        }
        if(leftIndex == listLeft.size()){
            mergedList.addAll(rightIndex + leftIndex, listRight.subList(rightIndex, listRight.size()));
        }
        else if(rightIndex == listRight.size()){
            mergedList.addAll(leftIndex + rightIndex, listLeft.subList(leftIndex, listLeft.size()));
        }

        return mergedList;
    }
}
