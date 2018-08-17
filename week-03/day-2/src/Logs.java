import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Logs {
  public static void main(String[] args) {
    ArrayList<String> arrayList = new ArrayList<String>();
    Path filePath = Paths.get("log.txt");

    try {
      arrayList.addAll(Files.readAllLines(filePath));
    } catch (Exception ex) {
      System.out.println("oops");
    }

    System.out.println(ipAddress(arrayList));
    System.out.println(ratioGETPOST(arrayList));
  }

  public static ArrayList<String> ipAddress (ArrayList<String> lines){

    ArrayList<String> uniqueList = new ArrayList<>();

    for (int i = 0; i < lines.size(); i++) {
      String ip = lines.get(i).split("   ")[1];

      if (!uniqueList.contains(ip)){
        uniqueList.add(ip);
      }
    }
    return uniqueList;
  }

  public static double ratioGETPOST(ArrayList<String> lines){

    double getZero = 0;
    double postZero = 0;
    double result;

    for (int i = 0; i < lines.size(); i++) {
      String GETPOST = lines.get(i).split("   ")[2].split(" ")[0];

      if (GETPOST.equals("GET")){
        getZero += 1;
      } else {
        postZero += 1;
      }
    }

    result = getZero / postZero;
    return result;
  }
}