import java.util.Scanner;
class Main 
{
  public static void main (String[] args) 
  {
    Scanner console = new Scanner (System.in);
    System.out.println("Please enter the time in seconds");
    int totalTime = console.nextInt(); 
    realTime(totalTime);
  }
  public static void realTime (int totalTime)
  {
    int numberOfHours = (totalTime / 3600);
    int numberOfMinutes = ((totalTime - (numberOfHours * 3600)) / 60);
    int numberOfSeconds = (totalTime - ((numberOfHours * 3600) + (numberOfMinutes * 60)));
    System.out.println("Hours: " + numberOfHours);
    System.out.println("Minutes: "+ numberOfMinutes);
    System.out.println("Seconds: " + numberOfSeconds);
  }
}
