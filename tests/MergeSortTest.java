package tests;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;
import src.MergeSort;

/**
 * @author Nils Muralles
 * @version 1.0.0
 * @since 25/01/24
 * Clase que prueba el algoritmo Merge Sort
 */
public class MergeSortTest {
    @Test
    public void testSort() {
        MergeSort<Integer> mergeSort = new MergeSort<>();
        Integer[] array = {5, 3, 2, 4, 1, 10, 9, 8, 7, 6, 11};

        assertArrayEquals(new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11}, mergeSort.sort(array, array.length, array.length / 2));
    }
}
