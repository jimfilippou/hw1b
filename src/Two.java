import java.io.IOException;
import java.io.File;
import java.util.List;

class Two {

  private static final String FILENAME = "/Users/jimfilippou/Projects/hw1b/data/1.2-sm.txt";

  public static void main(String[] args) {
    try {
      File f = new File(FILENAME);
      List<Integer> list = Utilities.convertFileSequenceToList(f);
    } catch (IOException err) {
      err.printStackTrace();
    }
  }
}