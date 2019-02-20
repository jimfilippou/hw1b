import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.util.List;

/**
 * First Exercise
 */
class One {
  private static final String FILENAME = "/Users/jimfilippou/Projects/hw1b/data/1.1-sm.txt";

  public static void main(String[] args) {
    try {
      File f = new File(FILENAME);
      List<Integer> list = Utilities.convertFileSequenceToList(f);
      Splitter s = new Splitter();
      s.searchFirstLast(list, 5);
    } catch (IOException err) {
      err.printStackTrace();
    }
  }

}