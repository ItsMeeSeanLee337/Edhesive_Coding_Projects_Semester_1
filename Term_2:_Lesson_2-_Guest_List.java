import java.util.ArrayList;
import java.util.Scanner;
class Main 
{
  public static void main (String[] args) 
  {
    Scanner console = new Scanner (System.in);
    System.out.println("Please enter host name:");
    String hostName = console.nextLine();
    ArrayList<String> guestList = new ArrayList<String>();
    System.out.println("Press 1 to view the complete guest list.");
    System.out.println("Press 2 to add guests to the list.");
    System.out.println("Press 3 to remove guests from the list");
    System.out.println("Press 4 to end list alterations and print out the host name and all guest names.");
    int userInput = console.nextInt();
    while (userInput != 4)
    {
      if (userInput == 1)
      {
        viewList(guestList);
      }
      else if (userInput == 2)
      {
        addGuest(guestList);
      }
      else
      {
        removeGuest(guestList);
      }
      System.out.println("Press 1 to view the complete guest list.");
      System.out.println("Press 2 to add guests to the list.");
      System.out.println("Press 3 to remove guests from the list");
      System.out.println("Press 4 to end list alterations and print out the host name and all guest names.");
      userInput = console.nextInt();
    }
    endList(guestList, hostName);
  }
  public static void viewList (ArrayList<String> guestList)
  {
    for (String name : guestList)
    {
      System.out.print(name);
    }
  }
  public static void addGuest (ArrayList<String> guestList)
  {
    Scanner console = new Scanner (System.in);
    if (guestList.size() >= 20)
    {
      System.out.println("There can be no more than 20 guests. Remove guests before adding more.");
    }
    else
    {
      System.out.println("Enter the name of the guest that you wish to add: ");
      String guestName = console.nextLine();
      guestList.add(guestName);
    }
  }
  public static void removeGuest (ArrayList<String> guestList)
  {
    Scanner console = new Scanner (System.in);
    if (guestList.size() < 1)
    {
      System.out.println("You cannot remove any names from the list when there is only one name. Add more names before removing from the list.");
    }
    else
    {
      System.out.println("Please enter the name of the guest that you wish to remove: ");
      String guestName = console.nextLine();
      guestList.remove(guestName);
    }
  }
  public static void endList (ArrayList<String> guestList, String hostName)
  {
    System.out.println("Host name: " + hostName);
    System.out.println("Guest list size: " + guestList.size());
    int guestNumber = 1;
    for (String guestName : guestList)
    {
      System.out.println("Guest " + guestNumber + ": " + guestName);
      guestNumber++;
    }
  }
}
