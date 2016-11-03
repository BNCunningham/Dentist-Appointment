//Brionna Cunningham; Susanna Pritchett

import java.util.Scanner;

public class DentalAppointment{

Person person;
Date date;
Time time;
int duration;
Time end;

String firstname;
String lastname;
String zipcode;
int day;
int month;
int year;
int hours;
int minutes;


  public DentalAppointment(Person person, Date date, Time time, Time end, int duration)
  {
    this.person = person;
    this.date = date;
    this.time = time;
    this.end = end;
    this.duration = duration;
    //this.end = end;
    //end.add(duration);
  }

  public DentalAppointment(String firstname, String lastname, String zipcode, int day, int month, int year, int hours, int minutes, int duration)
  {

    this.firstname = firstname;
    this.lastname = lastname;
    this.zipcode = zipcode;
    this.day = day;
    this.month = month;
    this.year = year;
    this.hours = hours;
    this.minutes = minutes;
    this.duration = 30;

  }

  public Person getPerson(){
    return person;
  }

  public Date getDate(){
    return date;
  }

  public Time getTime(){
    return time;
  }

  public Time getEnd(){
    return end;
  }

  public static void main(String[] args)
  {

      Scanner sc = new Scanner(System.in);

      for(int i = 0; i < 3; i++){

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

      sc.nextLine();//we gotta skip a line when transitioning from nextint to nextline

      System.out.print("Please enter a duration between 30 and 240 minutes: ");
      int duration = 0;
      while(true){
      String durationstring = sc.nextLine();
      if(durationstring.equals("")) {
        System.out.println("Appointment duration has been automatically set to 30 minutes.");
        duration = 30;
        break;
      }
      else{
        duration = Integer.parseInt(durationstring);
        if(duration > 240 || duration < 30){
            System.out.println("Appointments cannot exceed 240 minutes or be less than 30 minutes.");
            System.out.print("Please enter a duration between 30 and 240 minutes: ");
          }
        else{
          break;
        }
      }
    }

      Time end = new Time(hours,minutes);
      end.AddTime(duration);

      DentalAppointment newapp = new DentalAppointment(person,date,time,end,duration);

      newapp.Display();

    }

  }

  public void Display(){

    /*System.out.println(this.getPerson());
    System.out.println(this.getDate());
    System.out.println(this.getTime());
    System.out.println(this.getEnd());*/

    System.out.println("Appointment for " + person.firstname + " " + person.lastname + " (Zipcode " + person.zipcode + "):");
    System.out.print("Appointment takes place on ");
    date.Display();
    System.out.print(" at ");
    time.Display();
    System.out.println(" and will last for " + duration + " minutes.");
    System.out.print("The appointment will last until ");
    end.Display();
    System.out.println();
  }
}
