import java.util.Random;

class QuickSort {

   /**
 * 3-way quicksort
 * <p/>
 * Choose a value an put the greater values to the right, lowers to the
 * left, and equals in the center. recursive. O(n^2) but avg O(n log n). Memory: In place
 */
public static void quickSort(int[] array) {
    shuffleArray(array);
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

// O(n)
private static void shuffleArray(int[] ar) {
    Random rnd = new Random();
    for (int i = ar.length - 1; i > 0; i--) {
        int index = rnd.nextInt(i + 1); // random between 0 and i
        swap(ar, i, index);
    }
}

private static void swap(int[] array, int i, int j) {
    int a = array[i];
    array[i] = array[j];
    array[j] = a;
}
}