import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class MostProductiveYear {

  public static void main(String[] args) {
    MostProductiveYear mostProductiveYear = new MostProductiveYear();
    System.out.println(mostProductiveYear.mostProductive("marvel"));
  }

  /**
   * Write a method that helps you find the most productive year for a film studio.
   * The method should take one argument, which is the name of the film studio.
   * The method should try to open the related data file named `studioname`.csv,
   * which is a comma separated file with 3 columns: name of the movie, release year, director
   *
   *  - If we do not have any data about the studio, the method should return an error message.
   *  - If we have found data, the method should return an information message about the most productive year for that studio.
   *
   * Examples:
   *
   * If we call the method with 'marvel':
   * should return 'marvel has made the most movies in 2017.'
   *
   * If we call the method with 'ghibli':
   * should print 'Cannot find studio, please try again later.'
   *
   * Hint:
   *  - You can find some example files in this folder (marvel.csv and paramount.csv)
   *  - Most productive year: The year in which the studio has made the most movies.
   */
  public String mostProductive(String filename) {

    List<String> list;
    List<String> years = new ArrayList<>();
    List<Integer> timesYears = new ArrayList<>();
    HashMap<String, Integer> hashMap = new HashMap<>();
    Path path = Paths.get(filename + ".csv");

    try {
      list = Files.readAllLines(path);
    } catch (Exception ex) {
      return ("Cannot find studio, please try again later.");
    }

    for (int i = 0; i < list.size(); i++) {
      years.add(list.get(i).split(",")[1]);
    }

    for (String i: years) {
      if (hashMap.containsKey(i))
        hashMap.put(i, hashMap.get(i) + 1);
      else
        hashMap.put(i, 1);
    }

    timesYears.addAll(hashMap.values());
    Collections.sort(timesYears);

    for (String year : hashMap.keySet()) {
      if (hashMap.get(year).equals(timesYears.get(timesYears.size() - 1))) {
        return filename + " has made the most movies in " + year + ".";
      }
    }
    return null;
  }
}