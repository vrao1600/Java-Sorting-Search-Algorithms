package Algorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InsertionSortArrayTest {
    private InsertionSortArray<Integer> sortableIntArray;
    private InsertionSortArray<Integer> sortableIntArray2;  // for even-sized array
    private InsertionSortArray<String> sortableStringArray;
    private InsertionSortArray<String> sortableStringArray2;  // for even-sized array

    @BeforeEach
    void setUp() {
        sortableIntArray = new InsertionSortArray<>(new Integer[]{5, 2, 8, 9, 1});
        sortableIntArray2 = new InsertionSortArray<>(new Integer[]{11, 5, 2, 8});
        sortableStringArray = new InsertionSortArray<>(new String[]{"Zebra", "Monkey", "Elephant", "Ant", "Dog"});
        sortableStringArray2 = new InsertionSortArray<>(new String[]{"Lion", "Zebra", "Monkey", "Elephant"});
    }

    @Test
    void testSortIntegers() {
        sortableIntArray.sort();
        assertArrayEquals(new Integer[]{1, 2, 5, 8, 9}, sortableIntArray.getArray());

        // test with an already sorted array
        sortableIntArray = new InsertionSortArray<>(new Integer[]{1, 2, 3, 4, 5});
        sortableIntArray.sort();
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, sortableIntArray.getArray());

        // test with a reversely sorted array
        sortableIntArray = new InsertionSortArray<>(new Integer[]{5, 4, 3, 2, 1});
        sortableIntArray.sort();
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, sortableIntArray.getArray());

        // test with an array with duplicate values
        sortableIntArray = new InsertionSortArray<>(new Integer[]{5, 3, 2, 3, 5});
        sortableIntArray.sort();
        assertArrayEquals(new Integer[]{2, 3, 3, 5, 5}, sortableIntArray.getArray());

        // test with an even-sized array
        sortableIntArray2.sort();
        assertArrayEquals(new Integer[]{2, 5, 8, 11}, sortableIntArray2.getArray());
    }

    @Test
    void testSortStrings() {
        sortableStringArray.sort();
        assertArrayEquals(new String[]{"Ant", "Dog", "Elephant", "Monkey", "Zebra"}, sortableStringArray.getArray());

        // test with an already sorted array
        sortableStringArray = new InsertionSortArray<>(new String[]{"Ant", "Dog", "Elephant", "Monkey", "Zebra"});
        sortableStringArray.sort();
        assertArrayEquals(new String[]{"Ant", "Dog", "Elephant", "Monkey", "Zebra"}, sortableStringArray.getArray());

        // test with a reversely sorted array
        sortableStringArray = new InsertionSortArray<>(new String[]{"Zebra", "Monkey", "Elephant", "Dog", "Ant"});
        sortableStringArray.sort();
        assertArrayEquals(new String[]{"Ant", "Dog", "Elephant", "Monkey", "Zebra"}, sortableStringArray.getArray());

        // test with an array with duplicate values
        sortableStringArray = new InsertionSortArray<>(new String[]{"Zebra", "Monkey", "Ant", "Monkey", "Ant"});
        sortableStringArray.sort();
        assertArrayEquals(new String[]{"Ant", "Ant", "Monkey", "Monkey", "Zebra"}, sortableStringArray.getArray());

        // test with an even-sized array
        sortableStringArray2.sort();
        assertArrayEquals(new String[]{"Elephant", "Lion", "Monkey", "Zebra"}, sortableStringArray2.getArray());
    }
}
