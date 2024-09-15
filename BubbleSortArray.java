package Algorithms;

import java.util.Arrays;

/**
 * This class provides a bubble sort implementation for an array.
 *
 * @param <T> the type of elements in the array
 */
public class BubbleSortArray<T extends Comparable<T>> implements Sortable<T> {
    /**
     * The array to be sorted.
     */
    private T[] array;

    /**
     * Constructor to initialize the array.
     *
     * @param array the array to be sorted
     */
    public BubbleSortArray(T[] array) {
        this.array = array;
    }

    /**
     * Sorts the elements in the array in ascending order using bubble sort.
     */
    @Override
    public void sort() {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    // Swap array[j] and array[j + 1]
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    /**
     * Returns the sorted array.
     *
     * @return the sorted array
     */
    public T[] getArray() {
        return array;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.array);
    }

    /**
     * Main method for testing the bubble sort implementation.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        Integer[] intArray = {5, 1, 4, 2, 8};
        BubbleSortArray<Integer> intSort = new BubbleSortArray<>(intArray);
        System.out.println("Original array: " + Arrays.toString(intArray));
        intSort.sort();
        System.out.println("Sorted array: " + Arrays.toString(intSort.getArray()));
    }
}
