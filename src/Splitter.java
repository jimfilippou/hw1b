import java.util.Arrays;
import java.util.List;

/**
 * Splitter
 */
public class Splitter {

  private int _query;

  public Result searchFirstLast(List<Integer> target, int query) {
    this._query = query;
    int[] arr = new int[target.size()];
    arr = toIntArray(target);
    int first = first(arr, 0, arr.length);
    int last = last(arr, 0, arr.length, arr.length);
    return new Result(first, last);
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