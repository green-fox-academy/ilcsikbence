import static java.lang.Integer.parseInt;

public class Main {
  public static void main(String[] args) {

    TodoIO.readTasks();

    if (args.length == 0) {
      TodoIO.printDefault();

    } else if (args[0].equals("-l")) {
      TodoIO.readFile();

    } else if (args[0].equals("-a") && args.length == 1) {
      System.out.println("Unable to add: no task provided");

    } else if (args[0].equals("-a") && args.length == 2) {
      TodoLogic.addTask(args[1], false);
      TodoIO.writeFile();

    } else if (args[0].equals("-c") && args.length == 1) {
      System.out.println("Unable to complete: no task provided");

    } else if (args[0].equals("-c") && args.length == 2) {
      TodoIO.completeTask(parseInt(args[1]));

    } else if (args[0].equals("-r") && args.length == 1) {
      System.out.println("Unable to remove: no task provided");

    } else if (args[0].equals("-r") && args.length == 2) {
      TodoIO.removeTask(parseInt(args[1]));
    }
  }
}