public class Todo extends ID {

  int todoID;
  String task;
  boolean isDone;

  public Todo(String task, boolean isDone) {
    super();
    this.task = task;
    this.isDone = isDone;
    todoID = getId();
  }

  public boolean setDone() {
    return isDone = true;
  }

  public String setTask() {
    return task = "";
  }

  public String ifIsDone() {
    if (isDone == true) {
      return "X";
    } else {
      return " ";
    }
  }

  public String toString() {
    return " -  [" + ifIsDone() + "] " + task;
  }
}