import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class HoarePartitionTest {

    @Test
    void testSortedArray() {
        int[] a = {10, 17, 19, 21, 44, 55, 57, 63, 65, 67};
        int p = HoarePartition.partition(a, 0, a.length - 1);
        assertPartitioned(a, p);
    }

    @Test
    void testUnsortedArray() {
        int[] a = {84, 3, 7, 1, 9, 6, 2, 5};
        int p = HoarePartition.partition(a, 0, a.length - 1);
        assertPartitioned(a, p);
    }

    @Test
    void testEmptyArray() {
        int[] a = {};
        assertEquals(-1, HoarePartition.partition(a, 0, 0));
    }

    private void assertPartitioned(int[] a, int p) {
        int maxLeft = Integer.MIN_VALUE;
        for (int i = 0; i <= p; i++)
            maxLeft = Math.max(maxLeft, a[i]);

        int minRight = Integer.MAX_VALUE;
        for (int i = p + 1; i < a.length; i++)
            minRight = Math.min(minRight, a[i]);

        assertTrue(maxLeft <= minRight);
    }
}
