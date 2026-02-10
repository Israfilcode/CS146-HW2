public class HoarePartition {

    // Pivot = middle element
    // Returns index p such that:
    // a[lo..p] <= a[p+1..hi]
    public static int partition(int[] a, int lo, int hi) {
        if (a == null || a.length == 0) return -1;
        if (lo < 0 || hi >= a.length || lo > hi)
            throw new IllegalArgumentException();

        int pivot = a[lo + (hi - lo) / 2];
        int i = lo - 1;
        int j = hi + 1;

        while (true) {
            do { i++; } while (a[i] < pivot);
            do { j--; } while (a[j] > pivot);

            if (i >= j) return j;

            swap(a, i, j);
        }
    }

    private static void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}
