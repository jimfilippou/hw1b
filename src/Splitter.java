import java.util.List;

/**
 * Splitter class
 */
public class Splitter {

  private int _query;

  public Result searchFirstLast(List<Integer> target, int query) {
    this._query = query;

    // Convert List<Integer> to array of integers
    int[] arr = new int[target.size()];
    arr = toIntArray(target);

    boolean edgeMatch = arr[0] == arr[arr.length - 1] && arr[0] == _query;
    boolean isEmpty = arr.length == 0;
    
    if (edgeMatch == true)
      return new Result(arr[0], arr[arr.length - 1]);

    if (isEmpty == true)
      throw new Error("Array can't be empty");

    int first = first(arr, 0, arr.length - 1 );
    int last = last(arr, 0, arr.length - 1, arr.length);
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