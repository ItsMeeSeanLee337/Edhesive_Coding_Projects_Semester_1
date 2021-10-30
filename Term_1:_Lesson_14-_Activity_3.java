import java.util.Scanner;
class Main 
{
  public static void main (String[] args) 
  {
    Scanner console = new Scanner (System.in);
    System.out.println("Please enter the first octet:");
    int octet1 = console.nextInt();
    System.out.println("Please enter the second octet:");
    int octet2 = console.nextInt();
    System.out.println("Please enter the third octet:");
    int octet3 = console.nextInt();
    System.out.println("Please enter the fourth octet:");
    int octet4 = console.nextInt();
    if ((octet1 < 0) || (octet1 > 255))
    {
      System.out.println("Octet 1 is incorrect");
    }
    if((octet2 < 0) || (octet2 > 255))
    {
      System.out.println("Octet 2 is incorrect");
    }
    if((octet3 < 0) || (octet3 > 255))
    {
      System.out.println("Octet 3 is incorrect");
    }
    if((octet4 < 0) || (octet4 > 255))
    {
      System.out.println("Octet 4 is incorrect");
    }
    if (((octet1 >= 0) && (octet1 <= 255)) && ((octet2 >= 0) && (octet2 <= 255)) && ((octet3 >= 0) && (octet3 <= 255)) && ((octet4 >= 0) && (octet4 <= 255)))
    {
      System.out.println("IP Address: " + octet1 + "." + octet2 + "." + octet3 + "." + octet4);
    }
  }
}
