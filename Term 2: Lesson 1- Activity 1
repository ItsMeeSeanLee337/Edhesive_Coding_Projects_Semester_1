import java.util.Scanner;
import java.util.ArrayList;
class Main 
{
  public static void main (String[] args) 
  {
    Scanner console = new Scanner (System.in);
    ArrayList utensils = new ArrayList();
    System.out.println("Please enter words, enter STOP to stop the loop.");
    int listLength = 0;
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
        listLength++;
        utensils.add(userString);
      }
    }
    System.out.println(utensils.size());
    System.out.println(utensils);
    if (utensils.size() > 2)
    {
      utensils.remove(listLength - 1);
      utensils.remove(0);
      System.out.println(utensils);
    }
  }
}
