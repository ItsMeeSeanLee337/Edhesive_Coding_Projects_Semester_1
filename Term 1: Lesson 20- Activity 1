import java.util.Scanner;
import java.lang.Math;
class Main 
{
  public static void main (String[] args) 
  {
    Scanner console = new Scanner (System.in);
    double latitude;
    double longitude;
    double north = -90;
    double south = 90;
    double east = -180;
    double west = 180;
    int num = 1;
    while (num == 1)
    {
      System.out.println("Please enter the latitude:");
      latitude = console.nextDouble();
      System.out.println("Please enter the longitude:");
      longitude = console.nextDouble();
      if ((latitude < -90 || latitude > 90) || (longitude < -180 || longitude > 180))
      {
        System.out.println("Incorrect Latitude or Longitude");
        num = 1;
      }
      else
      {
        if (latitude > north)
        {
          north = latitude;
        }
        if (latitude < south)
        {
          south = latitude;
        }
        if (longitude > east)
        {
          east = longitude;
        }
        if (longitude < west)
        {
          west = longitude;
        }
        System.out.println("Would you like to enter another location?");
        num = console.nextInt();
      }
    }
    System.out.println("Farthest North: " + north);
    System.out.println("Farthest South: " + south);
    System.out.println("Farthest East: " + east);
    System.out.println("Farthest West: " + west);
  }
}
