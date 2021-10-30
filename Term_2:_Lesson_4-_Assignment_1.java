public class Fraction
{
  private int numerator;
  private int denominator;
  public Fraction ()
  {
    numerator = 1;
    denominator = 1;
  }
  public Fraction (int n, int d)
  {
    if (n > 0)
    {
      numerator = n;
    }
    else
    {
      numerator = 1;
    }
    if (d > 0)
    {
      denominator = d;
    }
    else
    {
      denominator = 1;
    }
  }
  public String toString ()
  {
    return numerator + "/" + denominator;
  }
  public String mixedNumber ()
  {
    if ((numerator / denominator) > 0)
    {
      if (numerator % denominator == 0)
      {
        return (numerator / denominator) + "";
      }
      else
      {
        return (numerator / denominator) + " " + (numerator % denominator) + "/" + denominator;
      }
    }
    else
    {
      return numerator + "/" + denominator;
    }
  }
  public void add (int n, int d)
  {
    if ((n > 0) && (d > 0))
    {
      numerator = (numerator * d + n * denominator);
      denominator = (denominator * d);
    }
  }
}
