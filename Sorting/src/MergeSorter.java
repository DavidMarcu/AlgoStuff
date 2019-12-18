import java.util.List;

public class MergeSorter implements Sorter{

    @Override
    public List<Object> customSort(List<Object> list) {
        if(list.size() == 1){
            return list;
        }
        var middle = list.size() / 2;
        var leftList = customSort(list.subList(0, middle));
        var rightList = customSort(list.subList(middle, list.size()));
        return
    }
}
