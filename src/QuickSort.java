package src;

/**
 * @author Víctor Pérez
 * @version 1.0.0
 * @since 27/01/24
 * Clase que contiene el algoritmo Quick Sort
 */
public class QuickSort<T extends Comparable<T>> implements ISort<T> {

    /**
     * @param arr Array a ordenar
     * @param begin Índice de inicio
     * @param end Índice de fin
     * @return Array ordenado
     * Utiliza el Quick Sort para ordenar un array
     */
    @Override
    public T[] sort(T[] arr, int begin, int end) {
        if (begin < end) {
            int pi = partition(arr, begin, end);
 
            sort(arr, begin, pi - 1);
            sort(arr, pi + 1, end);
        }

        return arr;
    }

    
    /**
     * @param arr Array a ordenar
     * @param begin Índice de inicio
     * @param end Índice de fin
     * @return Índice del pivote
     * Realiza dos particiones del array y las ordena
     */
    public int partition(T arr[], int begin, int end) {
        T pivot = arr[end];
        int i = begin - 1;

        for (int j = begin; j < end; j++) {
            if (arr[j].compareTo(pivot) <= 0 ) {
                i++;

                T swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        T swapTemp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = swapTemp;

        return i + 1;
    }
}
