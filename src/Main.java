package src;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Arrays;

/**
 * @author Nils Muralles & Víctor Pérez
 * @version 1.0.0
 * @since 24/01/24
 * Clase principal donde se desarrolla el programa
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean menu = true;
        CSV data = new CSV();

        while (menu) { 
            System.out.println("\n---ALGORITMOS DE ORDENAMIENTO---");
            System.out.println("1. Ordenar datos\n2. Salir");
            System.out.print("Seleccione una opción: ");
            

            try {
                int op = input.nextInt();
                input.nextLine();    

                switch (op) {
                    case 1:
                        System.out.print("\n¿Cuántos datos desea ordenar? ");
                        int datos = input.nextInt();
                        input.nextLine();

                        try {
                            System.out.println("\n---ELIJA SU MÉTODO DE ORDENAMIENTO---");
                            System.out.println("1. Gnome Sort\n2. Merge Sort\n3. Quick Sort\n4. Radix Sort\n5. Heap Sort");
                            System.out.print("Seleccione una opción: ");
                            int opcion = input.nextInt();
                            input.nextLine();

                            try {
                                data.addData(datos);
                                Integer[] numbers = data.readData(datos);
                                Integer[] sortedArray = new Integer[datos];
                                System.out.println("\nArreglo original: " + Arrays.toString(numbers));

                                switch (opcion) {
                                    case 1:
                                        GnomeSort<Integer> gnomeSort = new GnomeSort<>();
                                        sortedArray = gnomeSort.sort(numbers, numbers.length, 0);
                                        break;
                                
                                    case 2:
                                        MergeSort<Integer> mergeSort = new MergeSort<>();
                                        sortedArray = mergeSort.sort(numbers, numbers.length, numbers.length/2);
                                        break;

                                    case 3:
                                        QuickSort<Integer> quickSort = new QuickSort<>();
                                        sortedArray = quickSort.sort(numbers, 0, numbers.length - 1);
                                        break;

                                    case 4:
                                        RadixSort<Integer> radixSort = new RadixSort<>();
                                        sortedArray = radixSort.sort(numbers, 0, 0);
                                        break;

                                    case 5:
                                        HeapSort<Integer> heapSort = new HeapSort<>();
                                        sortedArray = heapSort.sort(numbers, numbers.length, 0);
                                        break;

                                    default:
                                        input.nextLine();
                                        System.out.println("\nSeleccione una opción válida");
                                        break;
                                }

                                System.out.println("Arreglo ordenado: " + Arrays.toString(sortedArray));
                            
                            data.clear();

                            } catch (InputMismatchException e) {
                                input.nextLine();
                                System.out.println("\nDebe introducir un número");

                            } catch (IOException e) {
                                input.nextLine();
                                System.out.println("No se pudo acceder a los datos del CSV");

                            } 
                            
                        } catch (InputMismatchException e) {
                            input.nextLine();
                            System.out.println("\nDebe seleccionar un número");
                        }

                        break;
                    
                    case 2:
                        menu = false;
                        break;

                    default:
                        System.out.println("\nSeleccione una opción del menú");
                        break;
                }

            } catch (InputMismatchException e) {
                input.nextLine();
                System.out.println("\nDebe seleccionar un número");
            }
        
        }
        input.close();
    }
}