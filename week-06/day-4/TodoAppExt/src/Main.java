public class Main {
  public static void main(String[] args) {

    TodoIO.readFile();

    if (args.length == 0) {
      TodoIO.printDefault();
//  List tasks============================================

    } else if (args[0].equals("-l")) {
      TodoIO.listFiles();

//  Add files=============================================

    } else if (args[0].equals("-a") && args.length == 1) {
      System.out.println("Unable to add: no task provided");

    } else if (args[0].equals("-a") && args.length == 2) {
      TodoOps.add(args[1]);
      TodoIO.overwriteFile();
//  Complete tasks========================================

    } else if (args[0].equals("-c") && args.length == 1) {
      System.out.println("Unable to complete: no task provided");

    } else if (args[0].equals("-c") && args.length == 2) {

//  Removing tasks========================================

    } else if (args[0].equals("-r") && args.length == 1) {
      System.out.println("Unable to remove: no task provided");
    } else if (args[0].equals("-r") && args.length == 2) {

    }
  }
}