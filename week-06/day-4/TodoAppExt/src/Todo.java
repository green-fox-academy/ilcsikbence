public class Todo extends ID {
  int todoID;
  String task;
  boolean isDone;

  public Todo(String task) {
    todoID = getId();
    this.task = task;
    isDone = false;
  }

  public boolean setDone() {
    return isDone = true;
  }

  public String toString() {
    return todoID + " " + task + " " + isDone;
  }
}