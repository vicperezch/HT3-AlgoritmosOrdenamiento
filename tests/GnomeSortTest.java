package tests;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;
import src.GnomeSort;

/**
 * @author Nils Muralles & Víctor Pérez
 * @version 1.0.0
 * @since 25/01/24
 * Clase que prueba el algoritmo Gnome Sort
 */
public class GnomeSortTest {

    /**
     * Prueba el algoritmo Gnome Sort
     */
    @Test
    public void testGnomeSort() {
        GnomeSort<Integer> gnomeSort = new GnomeSort<>();
        Integer[] array = {5, 3, 2, 4, 1, 10, 9, 8, 7, 6};

        assertArrayEquals(new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, gnomeSort.sort(array));
    }
}
