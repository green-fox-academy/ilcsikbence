public class SecondsInADay {
  public static void main(String[] args) {
    int currentHours = 14;
    int currentMinutes = 34;
    int currentSeconds = 42;

    // Write a program that prints the remaining seconds (as an integer) from a
    // day if the current time is represented by the variables

    int allHours = 23;
    int allMinutes = 59;
    int allSeconds = 60;

    int remHours = allHours - currentHours;
    int remMinutes = allMinutes - currentMinutes;
    int remSeconds = allSeconds - currentSeconds;

    int hoursToSec = remHours * 3600;
    int minsToSec = remMinutes * 60;

    int all = remSeconds + hoursToSec + minsToSec;

    System.out.println("The remaining time of the day: " + all + " seconds.");

  }
}