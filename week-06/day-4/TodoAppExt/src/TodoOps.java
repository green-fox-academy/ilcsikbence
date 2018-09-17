public class TodoOps {

  public void remove(int index) {
    TodoIO.todosList.remove(index - 1);
  }

  public static void add(String task) {
    TodoIO.todosList.add(new Todo(task));
    TodoIO.IDsList.add(new Todo(task).todoID);
  }

  public static void replace(String task, int ID) {
    for (int i = 0; i < TodoIO.todosList.size(); i++) {
      if (TodoIO.todosList.contains(TodoIO.todosList.get(i).todoID)) {
        TodoIO.todosList.set(i, new Todo(task));
      }
    }
  }

  public static void complete(int index) {
    TodoIO.todosList.get(index - 1).setDone();
  }
}
