package src;

public interface ISort<T extends Comparable<T>> {
    public T[] sort(T[] arr);
}
