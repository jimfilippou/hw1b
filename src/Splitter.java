import java.util.Arrays;
import java.util.List;

/**
 * Splitter
 */
public class Splitter {

  private int _query;

  public Result searchFirstLast(List<Integer> target, int query) {
    this._query = query;
    int[] targetArray = new int[target.size()];
    targetArray = toIntArray(target);
    System.out.println(Arrays.toString(targetArray));
    System.out.println(first(targetArray, 0, targetArray.length));
    System.out.println(last(targetArray, 0, targetArray.length, targetArray.length));
    return new Result(0, 0);
  }

  private int first(int arr[], int low, int high) {
    if (high >= low) {
      int mid = low + (high - low) / 2;
      if ((mid == 0 || _query > arr[mid - 1]) && arr[mid] == _query)
        return mid;
      else if (_query > arr[mid])
        return first(arr, (mid + 1), high);
      else
        return first(arr, low, (mid - 1));
    }
    return -1;
  }

  private int last(int arr[], int low, int high, int n) {
    if (high >= low) {
      int mid = low + (high - low) / 2;
      if ((mid == n - 1 || _query < arr[mid + 1]) && arr[mid] == _query)
        return mid;
      else if (_query < arr[mid])
        return last(arr, low, (mid - 1), n);
      else
        return last(arr, (mid + 1), high, n);
    }
    return -1;
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