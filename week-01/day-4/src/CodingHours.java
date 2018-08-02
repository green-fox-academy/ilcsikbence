public class CodingHours {
  public static void main(String[] args) {
    // An average Green Fox attendee codes 6 hours daily
    // The semester is 17 weeks long
    //
    // Print how many hours is spent with coding in a semester by an attendee,
    // if the attendee only codes on workdays.
    //
    // Print the percentage of the coding hours in the semester if the average
    // work hours weekly is 52

    // 1 week contains 5 workdays

    int dailyHours = 6;
    int workdaysNum = 5;
    int weekNum = 17;

    // This is the result of the average Green Fox Student's hours spent on coding.
    int avgHoursSpent = dailyHours*workdaysNum*weekNum;
    System.out.println(avgHoursSpent);

    double avgWorkHours = 52;
    double avgWorkHoursAll = avgWorkHours * weekNum;

    // This is the percentage of the coding hours in the semester if the average
    // work hours weekly is 52
    double percHours = avgHoursSpent / avgWorkHoursAll * 100;
    System.out.println(percHours + "%");


  }
}