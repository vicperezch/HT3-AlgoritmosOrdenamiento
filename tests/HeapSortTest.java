package tests;

import src.HeapSort;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

/**
 * @author Víctor Pérez
 * @version 1.0.0
 * @since 27/01/24
 * Clase que prueba el algoritmo Heap Sort
 */
public class HeapSortTest {
    
    @Test
    public void heapSortTest() {
        HeapSort<Integer> heapSort = new HeapSort<>();
        Integer[] array = {8, 3, 2, 4, 1, 9, 10, 6, 7, 5};

        assertArrayEquals(new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, heapSort.sort(array, array.length, 0));
    }
}
