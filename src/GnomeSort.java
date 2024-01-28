package src;

/**
 * @author Víctor Pérez
 * @version 1.0.0
 * @since 24/01/24
 * Clase que contiene el algoritmo Gnome Sort
 */
public class GnomeSort<T extends Comparable<T>> implements ISort<T> {

    /**
     * @param arr Array a ordenar
     * @param index Índice de inicio
     * @param lenght Tamaño del array
     * @return Array ordenado
     * Utiliza el Gnome Sort para ordenar un array
     */
    @Override
    public T[] sort(T[] arr, int lenght, int index) {
        while (index < arr.length) { 
            if (index == 0 || arr[index].compareTo(arr[index - 1]) >= 0) {
                index++; 
                
            } else { 
                T temp = arr[index]; 
                arr[index] = arr[index - 1]; 
                arr[index - 1] = temp; 
                index--; 
            } 
        } 

        return arr; 
    }
    
}
