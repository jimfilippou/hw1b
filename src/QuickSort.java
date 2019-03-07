
class QuickSort {

    // O(n^2)
    public static void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private static void quickSort(int[] array, int lo, int hi) {
        
        if (hi <= lo)
            return;

        int lowerIndex = lo;
        int greaterIndex = hi;
        int element = array[lo];
        int i = lo;

        while (i <= greaterIndex) {
            if (array[i] < element)
                swap(array, lowerIndex++, i++);
            else if (array[i] > element)
                swap(array, i, greaterIndex--);
            else
                i++;
        }

        quickSort(array, lo, lowerIndex - 1);
        quickSort(array, greaterIndex + 1, hi);
    }

    // Ο(1)
    private static void swap(int[] array, int i, int j) {
        int a = array[i];
        array[i] = array[j];
        array[j] = a;
    }
}