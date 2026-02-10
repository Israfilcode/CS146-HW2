import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LomutoPartitionTest {

    @Test
    void testSortedArray() {
        int[] a = {10, 17, 19, 21, 44, 55, 57, 63, 65, 67};
        int p = LomutoPartition.partition(a, 0, a.length - 1);
        assertPartitioned(a, p);
    }

    @Test
    void testUnsortedArray() {
        int[] a = {84, 3, 7, 1, 9, 6, 2, 5};
        int p = LomutoPartition.partition(a, 0, a.length - 1);
        assertPartitioned(a, p);
    }

    @Test
    void testEmptyArray() {
        int[] a = {};
        assertEquals(-1, LomutoPartition.partition(a, 0, 0));
    }

    private void assertPartitioned(int[] a, int p) {
        int pivot = a[p];
        for (int i = 0; i < p; i++)
            assertTrue(a[i] <= pivot);
        for (int i = p + 1; i < a.length; i++)
            assertTrue(a[i] > pivot);
    }
}
