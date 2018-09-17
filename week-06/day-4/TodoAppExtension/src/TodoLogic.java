import java.util.ArrayList;

public class TodoLogic {
  static ArrayList<Todo> tasks = new ArrayList<>();

  static void addTask(String todoText, boolean isDone) {
    tasks.add(new Todo(todoText, isDone));
  }

  static void updateTask(int todoID, String todoText, boolean isDone) {
    tasks.set(todoID - 1, new Todo(todoText, isDone));
  }
}