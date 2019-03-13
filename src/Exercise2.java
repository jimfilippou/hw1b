import java.io.IOException;
import java.io.*;
import java.util.*;

class Exercise2 {

  private int[] unorderedTable;

  public Exercise2(ArrayList<Integer> A) {
    unorderedTable = new int[A.size()];
    for (int i = 0; i < unorderedTable.length; i++) {
      unorderedTable[i] = A.get(i);
    }
  }

  public int[] getAnswers() {
    QuickSort.quickSort(unorderedTable);
    return unorderedTable;
  }

}