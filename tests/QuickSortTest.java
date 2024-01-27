package tests;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;
import src.QuickSort;

/**
 * @author Víctor Pérez
 * @version 1.0.0
 * @since 27/01/24
 * Clase que prueba el algoritmo Quick Sort
 */
public class QuickSortTest {
    
    @Test
    public void quickSortTest() {
        QuickSort<Integer> quickSort = new QuickSort<>();
        Integer[] array = {8, 3, 2, 4, 1, 9, 10, 6, 7, 5};

        assertArrayEquals(new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, quickSort.sort(array, 0, array.length - 1));
    }
}
