package Algorithms;

/**
 * The Sortable interface represents a data structure that can be sorted.
 *
 * @param <T> the type of elements in the data structure
 */
public interface Sortable<T extends Comparable<T>> {

    /**
     * Sorts the elements in the data structure in ascending order.
     */
    public void sort();
}
