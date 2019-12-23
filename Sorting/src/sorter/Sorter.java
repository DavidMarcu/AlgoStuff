package sorter;
import java.util.Comparator;
import java.util.List;

public interface Sorter<T extends Number> extends Comparator<T> {
    List<T> customSort(List<T> list);

    default int compare(T number1, T number2) {
        int returnValue = 0;
        if(number1.doubleValue() < number2.doubleValue()){
            returnValue = -1;
        }
        else if(number1.doubleValue() > number2.doubleValue()){
            returnValue = 1;
        }
        return returnValue;
    }
}
