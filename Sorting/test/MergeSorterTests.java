import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import sorter.MergeSorter;
import sorter.Sorter;

public class MergeSorterTests {

    @DisplayName("merge sort with integers successful")
    @Test
    public void mergeSortWithIntegers(){
        Sorter<Integer> mergeSorter = new MergeSorter<>();
        List<Integer> integers = List.of(5, 1, 8, 12, 4, 19, -3, -2);
        List<Integer> sortedIntegers = List.of(-3, -2, 1, 4, 5, 8, 12, 19);
        assertEquals(mergeSorter.customSort(integers), sortedIntegers);
    }

    @DisplayName("merge sort with doubles successful")
    @Test
    public void mergeSortWithDoubles(){
        Sorter<Double> mergeSorter = new MergeSorter<>();
        List<Double> doubles = List.of(1.1, 1.2, -1.1, 0d, -1.2);
        List<Double> sortedDoubles = List.of(-1.2, -1.1, 0d, 1.1, 1.2);
        assertEquals(mergeSorter.customSort(doubles), sortedDoubles);
    }

    @DisplayName("merge sort with mixed successful")
    @Test
    public void mergeSortWithMixed(){
        Sorter<Number> mergeSorter = new MergeSorter<>();
        List<Number> mixedNumbers = List.of(1.1, 1.2, -1.1, 0, -1.2, 5, 1, 8, 12, 4, 19, -3, -2, 0);
        List<Number> sortedMixedNumbers = List.of(-3, -2, -1.2, -1.1, 0, 0, 1, 1.1, 1.2, 4, 5, 8, 12, 19);
        assertEquals(mergeSorter.customSort(mixedNumbers), sortedMixedNumbers);
    }

    //Not implemented yet
    @Disabled
    @DisplayName("merge sort with 10000 random numbers successful")
    @Test
    public void mergeSortWith10000Numbers(){
        Sorter<Number> mergeSorter = new MergeSorter<>();
        List<Number> integers = List.of(1.1, 1.2, -1.1, 0, -1.2, 5, 1, 8, 12, 4, 19, -3, -2, 0);
        List<Number> sortedIntegers = List.of(-3, -2, -1.2, -1.1, 0, 0, 1, 1.1, 1.2, 4, 5, 8, 12, 19);
        assertEquals(mergeSorter.customSort(integers), sortedIntegers);
    }


}
