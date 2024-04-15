package exo3;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BinarySearchBranchCovergeTest {
    @Test
    public void TestBinarySearchElementInMiddle() {
        int[] array = {1, 3, 5, 7, 9};
        int index = BinarySearch.binarySearch(array, 5);
        assertEquals(2, index);

    }
    @Test
    public void TestBinarySearchElementAtBeginning() {
        int[] array = {1, 3, 5, 7, 9};
        int index = BinarySearch.binarySearch(array, 1);
        assertEquals(0, index);
    }
    @Test
    public void TestBinarySearchElementAtEnd() {
        int[] array = {1, 3, 5, 7, 9};
        int index = BinarySearch.binarySearch(array, 9);
        assertEquals(4, index);
    }
    @Test
    public void TestBinarySearchElementNotInArray() {
        int[] array = {1, 3, 5, 7, 9};
        int index = BinarySearch.binarySearch(array, 0);
        assertEquals(-1, index);
    }
    @Test
    public void TestBinarySearchNullArray() {
        assertThrows(NullPointerException.class, () -> {
            BinarySearch.binarySearch(null, 5);
        });
    }

}
