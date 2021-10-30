import java.util.Scanner;
class Main 
{
  public static void main (String[] args) 
  {
    Scanner console = new Scanner (System.in);
    double unixepoch = 0;
    System.out.println("Please give the number of seconds since the unix epoch:");
    int userinput = console.nextInt();
    int numberofsec = userinput%60;
//60 Seconds in a minute
//3600 Seconds in a hour
//86400 Seconds in a day
//2592000 Seconds in a 30 day month
//31104000 Seconds in a 360 day year
    double numberofyear = userinput/31104000;
    int numberofyear1 = (int)Math.floor(numberofyear);
    int numberofmonth1 = (int)Math.floor(((userinput-(numberofyear1*31104000))/2592000));
    int numberofday1 = (int)Math.floor((userinput-((numberofyear1*31104000)+(numberofmonth1*2592000)))/86400);
    int numberofhour1 = (int)Math.floor((userinput-((numberofyear1*31104000)+(numberofmonth1*2592000)+(numberofday1*86400)))/3600);
    int numberofmin1 = (int)Math.floor((userinput-((numberofyear1*31104000)+(numberofmonth1*2592000)+(numberofday1*86400)+(numberofhour1*3600)))/60);
    System.out.println("Year: " + (numberofyear1 + 1970));
    System.out.println("Month: " + numberofmonth1);
    System.out.println("Day: " + numberofday1);
    System.out.println("Hour: " + numberofhour1);
    System.out.println("Min: " + numberofmin1);
    System.out.println("Sec: " + numberofsec);
  }
}
