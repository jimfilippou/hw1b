import java.io.IOException;
import java.io.File;
import java.util.Arrays;
import java.util.List;

class Two {

  // private static final String FILENAME =
  // "/Users/jimfilippou/Projects/hw1b/data/1.2-sm.txt";
  private static final String FILENAME = "/home/jimfilippou/Desktop/hw1b/data/1.2-sm.txt";

  public static void main(String[] args) {
    try {
      File f = new File(FILENAME);
      List<Integer> list = Utilities.convertFileSequenceToList(f);
      int[] arr = new int[list.size()];
      arr = Two.toIntArray(list);

      System.out.println(Arrays.toString(arr));
      QuickSort.quickSort(arr);
      System.out.println(Arrays.toString(arr));

    } catch (IOException err) {
      err.printStackTrace();
    }
  }

  private static int[] toIntArray(List<Integer> list) {
    int[] ret = new int[list.size()];
    int i = 0;
    for (Integer e : list)
      ret[i++] = e;
    return ret;
  }
}