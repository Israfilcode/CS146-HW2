public class LomutoPartition {

    // Pivot = a[hi]
    // Returns final pivot index
    public static int partition(int[] a, int lo, int hi) {
        if (a == null || a.length == 0) return -1;
        if (lo < 0 || hi >= a.length || lo > hi)
            throw new IllegalArgumentException();

        int pivot = a[hi];
        int i = lo - 1;

        for (int j = lo; j < hi; j++) {
            if (a[j] <= pivot) {
                i++;
                swap(a, i, j);
            }
        }
        swap(a, i + 1, hi);
        return i + 1;
    }

    private static void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}
