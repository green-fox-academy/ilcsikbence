public class TodoPrint {
  public static void main(String... args){
    String todoText = " - Buy milk\n";
    // Add "My todo:" to the beginning of the todoText
    // Add " - Download games" to the end of the todoText
    // Add " - Diablo" to the end of the todoText but with indention

    // Expected outpt:

    // My todo:
    //  - Buy milk
    //  - Download games
    //      - Diablo

    StringBuilder newTodoText = new StringBuilder(todoText);

    newTodoText.append(" - Download games\n").append("   - Diablo").insert(0, "My todo:\n");

    System.out.println(newTodoText);
  }
}