//Brionna Cunningham; Susanna Pritchett


public class Date
{
  int month;
  int day;
  int year;

  public Date()
  {
    month = 1;
    day = 1;
    year = 2000;
  }
  public Date(int month, int day, int year)
  {
    this.month = month;
    this.day = day;
    this.year = year;
  }
  public int getMonth()
  {
    return month;
  }
  public int getDay()
  {
    return day;
  }
  public int getYear()
  {
    return year;
  }
  public static void main(String args [])
  {
    Date fate = new Date();
    Date deet = new Date(5, 6, 7854);
    fate.pnt();
    deet.pnt();
  }
  public void pnt()
  {
    System.out.println(this.getMonth() + "/" + this.getDay() + "/" + this.getYear());
  }
}
