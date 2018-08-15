public class Counter {
  public Counter(int numberInit) {
    defValue = numberInit;
    resetValue = numberInit;
  }
  int defValue;
  int resetValue;

  public int add(int number) {
    defValue += number;
    return defValue;
  }

  public int add() {
    defValue ++;
    return defValue;
  }

  public int get() {
    return defValue;
  }

  public int reset() {
    defValue = resetValue;
    return defValue;
  }

}