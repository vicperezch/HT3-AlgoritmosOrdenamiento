package src;

public interface ISort<T extends Comparable<T>> {
    public T[] sort(T[] arr, int index1, int index2);
}
