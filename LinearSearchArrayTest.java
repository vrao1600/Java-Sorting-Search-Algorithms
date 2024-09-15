package Algorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * The LinearSearchArrayTest class is responsible for testing the LinearSearchArray class.
 */
public class LinearSearchArrayTest {

    private LinearSearchArray<Integer> integerLinearSearchArray;
    private LinearSearchArray<String> stringLinearSearchArray;

    /**
     * Sets up the test environment by creating LinearSearchArray objects with integer and string arrays.
     */
    @BeforeEach
    public void setUp() {
        Integer[] integerArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] stringArray = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};

        integerLinearSearchArray = new LinearSearchArray<>(integerArray);
        stringLinearSearchArray = new LinearSearchArray<>(stringArray);
    }

    /**
     * Tests the search method on an integer array when the key is present.
     */
    @Test
    public void testSearch_integerArray_keyPresent() {
        assertEquals(3, integerLinearSearchArray.search(4));
        assertEquals(7, integerLinearSearchArray.search(8));
    }

    /**
     * Tests the search method on an integer array when the key is absent.
     */
    @Test
    public void testSearch_integerArray_keyAbsent() {
        assertEquals(-1, integerLinearSearchArray.search(15));
        assertEquals(-1, integerLinearSearchArray.search(-1));
    }

    /**
     * Tests the search method on a string array when the key is present.
     */
    @Test
    public void testSearch_stringArray_keyPresent() {
        assertEquals(2, stringLinearSearchArray.search("c"));
        assertEquals(6, stringLinearSearchArray.search("g"));
    }

    /**
     * Tests the search method on a string array when the key is absent.
     */
    @Test
    public void testSearch_stringArray_keyAbsent() {
        assertEquals(-1, stringLinearSearchArray.search("z"));
        assertEquals(-1, stringLinearSearchArray.search("aa"));
    }

    /**
     * Tests the search method on an empty array.
     */
    @Test
    public void testSearch_emptyArray() {
        LinearSearchArray<Integer> emptyLinearSearchArray = new LinearSearchArray<>(new Integer[0]);
        assertEquals(-1, emptyLinearSearchArray.search(1));
    }
}
