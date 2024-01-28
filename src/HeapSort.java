package src;

/**
 * @author Víctor Pérez
 * @version 1.0.0
 * @since 27/01/24
 * Clase que contiene el algoritmo Heap Sort
 */
public class HeapSort<T extends Comparable<T>> implements ISort<T>{

    /**
     * @param arr Array a ordenar
     * @return Array ordenado
     * Utiliza el Heap Sort para ordenar un array
     */
    @Override
    public T[] sort(T[] arr, int lenght, int index) {
 
        for (int i = lenght / 2 - 1; i >= 0; i--) {
            heapify(arr, lenght, i);
        }
 
        for (int i = lenght - 1; i > 0; i--) {
            T temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
 
            heapify(arr, i, 0);
        }
        
        return arr;
    }

    /**
     * @param arr Array a ordenar
     * @param n Tamaño del array
     * @param i Índice del elemento
     * Crea los montículos necesarios para ordenar el array
     */
    public void heapify(T[] arr, int n, int i) {
        int largest = i; 
        int left = 2 * i + 1; 
        int right = 2 * i + 2; 
 
        if (left < n && arr[left].compareTo(arr[largest]) > 0) {
            largest = left;
        }
 
        if (right < n && arr[right].compareTo(arr[largest]) > 0) {
            largest = right;
        }
 
        if (largest != i) {
            T swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
 
            heapify(arr, n, largest);
        }
    }
}
