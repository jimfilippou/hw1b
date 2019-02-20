import java.util.List;

/**
 * Splitter
 */
public class Splitter {

  public Result searchFirstLast(List<Integer> target, int query) {
    int[] targetArray = new int[target.size()];
    targetArray = toIntArray(target);
    // System.out.println(targetArray[0]);
    return new Result(0, 0);
  }

  private int[] toIntArray(List<Integer> list) {
    int[] ret = new int[list.size()];
    int i = 0;
    for (Integer e : list)
      ret[i++] = e;
    return ret;
  }

}

class Result {
  int x;
  int y;

  Result(int x, int y) {
    this.x = x;
    this.y = y;
  }
}