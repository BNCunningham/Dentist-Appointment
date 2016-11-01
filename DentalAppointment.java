//Brionna Cunningham; Susanna Pritchett

import java.util.Scanner;

public class DentalAppointment{

Person patient;
Date date;
Time time;
int duration;
//Time end;


  public DentalAppointment(Person patient, Date date, Time time, int duration)
  {
    this.patient = patient;
    this.date = date;
    this.time = time;
    this.duration = 30;
    //this.end = end;
    //end.add(duration);

  }
  public DentalAppointment(String firstname, String lastname, String zipcode, String day, String month, String year, int hours, int minutes, int duration)
  {
    this.firstname = firstname;
    this.lastname = lastname;
    this.zipcode = zipcode;
    this.day = day;
    this.month = month;
    this.year = year;
    this.hours = hours;
    this.minutes = minutes;
    duration = 30;

  }

  public void main(String[] args)
  {
      Scanner sc = new Scanner(System.in);

      System.out.print("First name (optional; empty will return \"X\"): ");
      String firstname = sc.nextLine();

      System.out.print("Last name (optional; empty will return \"X\"): ");
      String lastname = sc.nextLine();

      System.out.print("Zipcode (optional; empty will return \"X\"): ");
      String zipcode = sc.nextLine();

      Person person = new Person(firstname,lastname,zipcode);



      System.out.print("Enter appointment month: ");
      int month = sc.nextInt();

      System.out.print("Enter appointment day: ");
      int day = sc.nextInt();

      System.out.print("Enter appointment year: ");
      int year = sc.nextInt();

      Date date = new Date(month,day,year);



      System.out.print("Enter hour: ");
      int hours = sc.nextInt();

      System.out.print("Enter minutes: ");
      int minutes = sc.nextInt();

      Time time = new Time(hours,minutes);



      System.out.print("Please enter a duration between 30 and 240 minutes: ");
      duration = sc.nextInt();

      if(duration <= 240)
      {
        this.duration = duration;
      }
      else
      {
        if(duration > 240 || duration < 30)
        {
          while(duration > 240 || duration < 30){
            System.out.println("Appointments cannot exceed 240 minutes or be less than 30 minutes.");
            System.out.print("Please enter a duration between 30 and 240 minutes: ");
            duration = sc.nextInt();
          }
        }
        else if(Integer.toString(duration.length()) < 1){
        System.out.println("Appointment duration has been automatically set to 30 minutes.");
        duration = 30;
        }
      }

      int endhour = hours;
      int endmin = minutes + duration;

      if(endmin > 60){
        if(endmin >= 60 && endmin < 120){
          endhour = endhour + 1;
          endmin = endmin - 60;
          if(endhour == 24){
            endhour = 0;
          }
        }
        if(endmin >= 120 && endmin < 180){
          endhour = endhour + 2;
          endmin = endmin - 120;
          if(endhour == 25){
            endhour = 1;
          }
        }
        if(endmin >= 180 && endmin < 240){
          endhour = endhour + 3;
          endmin = endmin - 180;
          if(endhour == 26){
            endhour = 2;
          }
        }
        if(endmin == 240){
          endhour = endhour + 4;
          endmin = endmin - 240;
          if(endhour == 27){
            endhour = 3;
          }
        }
      }

      Time end = new Time(endhour,endmin);

        person.Display();
        time.Display();
        date.Display();
        end.Display();

  }

  public void Display(){

    System.out.println(this.Person());
    System.out.println(this.Date());
    System.out.println(this.Time());
    System.out.println(this.Time());
  }
}
