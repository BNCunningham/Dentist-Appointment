//


public class DentalAppointment{

Person patient;
Date date;
Time time;
int duration;
Time end;


  public DentalAppointment(Person patient, Date date, Time time)
  {
    this.patient = patient;
    this.date = date;
    this.time = time;
    this.duration = 30;
    this.end = time;
    end.add(duration);


/*
    if(duration > 240)
    {
      System.out.println("Appointment duration has been set to 30 minutes. Appointments cannot exceed 240 minutes.");
      duration = 30;
    }
    else
    {
      this.duration = duration;
    }
*/


  }
  public DentalAppointment(String firstname, String lastname, String zipcode, String day, String month, String year, int hours, int minutes)
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

}
