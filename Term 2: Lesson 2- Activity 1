import java.util.Scanner;
import java.util.ArrayList;
class Main 
{
  public static void main (String[] args) 
  {
    Scanner console = new Scanner (System.in);
    ArrayList<String> animalNames = new ArrayList<String>();
    System.out.println("Please enter words, enter STOP to stop the loop.");
    int stopValue = 1;
    String userString = "";
    while (stopValue != 0)
    {
      userString = console.next();
      if (userString.equals("STOP"))
      {
        stopValue--;
      }
      else
      {
        animalNames.add(userString);
      }
    }
    for (String names : animalNames)
    {
      if (names.indexOf("a") != -1)
      {
        System.out.println(names);
      }
    }
  }
}
