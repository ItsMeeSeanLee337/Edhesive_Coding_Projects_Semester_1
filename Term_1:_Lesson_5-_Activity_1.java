import Java.util.scanner;
class Main 
{
  public static void main (String[] args) 
  {
    Scanner console = new Scanner (System.in);
    System.out.println("Please enter two integers");
    double d1 = console.nextDouble();
    double d2 = console.nextDouble();
    double sum = d1-d2;
    System.out.println(d1 + " - " + d2 + " = " + sum);
  }
}
