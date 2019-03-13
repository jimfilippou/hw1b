import java.io.IOException;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * First Exercise
 */
class Exercise1 {

  private int _query;
  private ArrayList<Integer> _target;

  public Exercise1(int query, ArrayList<Integer> list) {
    this._query = query;
    this._target = list;
  }

  public int[] getAnswers() {
    Splitter s = new Splitter();
    Result res = s.searchFirstLast(_target, _query);
    int[] finalRes = s.fetchResults(res);
    System.out.println(finalRes);
    return finalRes;
  }
}