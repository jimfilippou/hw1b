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
      Splitter splitter = new Splitter();
      try {
        splitter.searchFirstLast(list, 20).provideResults();
      } catch (Exception err) {
        err.printStackTrace();
      }
    } catch (IOException err) {
      err.printStackTrace();
    }
  }

}