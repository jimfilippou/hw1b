import java.io.IOException;
import java.io.File;
import java.util.List;

/**
 * First Exercise
 */
class One {
  private static final String FILENAME = "/home/jimfilippou/Desktop/hw1b/data/data.txt";

  public static void main(String[] args) {
    try {
      File f = new File(FILENAME);
      List<Integer> list = Utilities.convertFileSequenceToList(f);
      Splitter splitter = new Splitter();
      try {
        splitter.searchFirstLast(list, 5).provideResults();
      } catch (Exception err) {
        err.printStackTrace();
      }
    } catch (IOException err) {
      err.printStackTrace();
    }
  }

}