package Algorithms;

/**
 * The Searchable interface represents a data structure that can be searched for a specific key.
 *
 * @param <T> the type of the key to be searched
 */
public interface Searchable<T extends Comparable<T>> {
    
    /**
     * Searches for the specified key in the data structure.
     *
     * @param key the key to search for
     * @return the index of the key if found, or -1 if not found
     */
    public int search(T key);
}
