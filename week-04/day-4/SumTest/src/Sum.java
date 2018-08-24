import java.util.ArrayList;

public class Sum {

  public int sum(ArrayList<Integer> arrayList) {
    int zero = 0;
    for (int i = 0; i < arrayList.size(); i++) {
      zero += arrayList.get(i);
    }
    return zero;

  }
}