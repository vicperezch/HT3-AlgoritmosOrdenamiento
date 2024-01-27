package src;
import java.util.Arrays;

/**
 * @author Nils Muralles
 * @version 1.0.0
 * @since 25/01/24
 * Clase que contiene el algoritmo Merge Sort
 */
public class MergeSort<T extends Comparable<T>> implements ISort<T> {

    /**
     * @param arr Array a ordenar
     * @return Array ordenado
     * Utiliza el Merge Sort para ordenar un array
     */
    @Override
    public T[] sort(T[] arr, int lenght, int middle) {

        if (lenght <= 1 || arr == null) {
            return arr;
        } 

        T[] leftArr = Arrays.copyOfRange(arr, 0, middle);
        T[] rightArr = Arrays.copyOfRange(arr, middle, lenght);

        leftArr = sort(leftArr, leftArr.length, leftArr.length / 2);
        rightArr = sort(rightArr, rightArr.length, rightArr.length / 2);
        merge(leftArr, rightArr, arr);

        return arr;
    }

    /**
     * Método auxiliar que une los subarrays ordenados
     * @param leftArr Array con primera mitad de elementos
     * @param rightArr Array con segunda mitad de elementos
     * @param arr Array original
     */
    public void merge(T[] leftArr, T[] rightArr, T[] arr) {
        int leftIndex = 0;
        int rightIndex = 0;
        int originalIndex = 0;

        while (leftIndex < leftArr.length && rightIndex < rightArr.length) {
            if (leftArr[leftIndex].compareTo(rightArr[rightIndex]) < 0) {
                arr[originalIndex++] = leftArr[leftIndex++];
            } else {
                arr[originalIndex++] = rightArr[rightIndex++];
            }
        }
        while (leftIndex < leftArr.length) {
            arr[originalIndex++] = leftArr[leftIndex++]; 
        }
        while (rightIndex < rightArr.length) {
            arr[originalIndex++] = rightArr[rightIndex++];
        }
    }
    
}
