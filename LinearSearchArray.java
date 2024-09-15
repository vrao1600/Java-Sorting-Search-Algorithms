package Algorithms;

/**
 * This class provides a linear search implementation for an array.
 *
 * @param <T> the type of elements in the array
 */
public class LinearSearchArray<T extends Comparable<T>> implements Searchable<T> {
    /**
     * The array to be searched
     */
    private T[] array; // the array to be searched

    /**
     * Constructor to initialize the array.
     *
     * @param array the array to be searched
     */
    public LinearSearchArray(T[] array) {
        this.array = array;
    }

    /**
     * Searches for the specified key in the array using linear search.
     *
     * @param key the key to search for
     * @return the index of the key if found, or -1 if not found
     */
    @Override
    public int search(T key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].compareTo(key) == 0) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Main method for testing the linear search implementation.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 4, 5, 8};
        LinearSearchArray<Integer> intSearch = new LinearSearchArray<>(intArray);
        Integer key = 4;
        int index = intSearch.search(key);
        System.out.println("Key element: " + key);
        System.out.println("Linear search index: " + index);
    }
}
