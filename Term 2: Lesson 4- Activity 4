public class Vehicle
{
  private int location;
  public Vehicle (int i)
  {
    if ((i > -20) && (i < 20))
    {
      location = i;
    }
    else
    {
      location = 0;
    }
  }
  public Vehicle ()
  {
    location = 0;
  }
  public void forward ()
  {
    if (location < 20)
    {
      location++;
    }
  }
  public void backward ()
  {
    if (location > -20)
    {
      location--;
    }
  }
  public int getLocation ()
  {
    return location;
  }
  public String toString ()
  {
    String locationString = "";
    for (int i = -20; i < location; i++)
    {
      locationString += " ";
    }
    locationString += "@";
    return locationString;
  }
}
