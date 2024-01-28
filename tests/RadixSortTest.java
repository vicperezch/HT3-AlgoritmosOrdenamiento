package tests;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;
import src.RadixSort;

/**
 * @author Nils Muralles
 * @version 1.0.0
 * @since 27/01/24
 * Clase que prueba el algoritmo Radix Sort
 */
public class RadixSortTest {
    @Test
    public void testSort() {
        RadixSort<Integer> radixSort = new RadixSort<>();
        Integer[] array = {1456, 278, 2053, 831, 2999, 472, 1947, 1166, 2388, 57};

        assertArrayEquals(new Integer[] {57, 278, 472, 831, 1166, 1456, 1947, 2053, 2388, 2999}, radixSort.sort(array, 0, 0));
    }
}
