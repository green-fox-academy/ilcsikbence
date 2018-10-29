import java.util.*;

public class SolarSystem{
  public static void main(String... args){
    ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury","Venus","Earth","Mars","Jupiter","Uranus","Neptune"));
    int index = 5;
    System.out.println(putSaturn(planetList, index));
  }

  public static ArrayList putSaturn(ArrayList planetList, int index){
    planetList.add(index, "Saturn");
    return planetList;
  }

}