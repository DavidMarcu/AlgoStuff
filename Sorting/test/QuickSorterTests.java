import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import sorter.QuickSorter;
import sorter.Sorter;

public class QuickSorterTests {

    @DisplayName("quick sort with integers successful")
    @Test
    public void quickSortIntegers(){
        Sorter<Integer> integerSorter = new QuickSorter<>();
        List<Integer> integers = new ArrayList<>(List.of(2, 4, 6, 1, 3, 5));
        List<Integer> sortedIntegers = List.of(1, 2, 3, 4, 5, 6);
        Assertions.assertEquals(integerSorter.customSort(integers), sortedIntegers);
    }

    @DisplayName("quick sort with doubles successful")
    @Test
    public void mergeSortWithDoubles(){
        Sorter<Double> quickSorter = new QuickSorter<>();
        List<Double> doubles = new ArrayList<>(List.of(1.1, 1.2, -1.1, 0d, -1.2));
        List<Double> sortedDoubles = List.of(-1.2, -1.1, 0d, 1.1, 1.2);
        assertEquals(quickSorter.customSort(doubles), sortedDoubles);
    }

    @DisplayName("quick sort with mixed successful")
    @Test
    public void mergeSortWithMixed(){
        Sorter<Number> quickSorter = new QuickSorter<>();
        List<Number> mixedNumbers = new ArrayList<>(List.of(1.1, 1.2, -1.1, 0, -1.2, 5, 1, 8, 12, 4, 19, -3, -2, 0));
        List<Number> sortedMixedNumbers = List.of(-3, -2, -1.2, -1.1, 0, 0, 1, 1.1, 1.2, 4, 5, 8, 12, 19);
        assertEquals(quickSorter.customSort(mixedNumbers), sortedMixedNumbers);
    }
}
