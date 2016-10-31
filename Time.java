//Brionna Cunningham; Susanna Pritchett

import java.util.Scanner;

public class Time{

  int hours;
  int minutes;

  public Time(){
    hours = 0;
    minutes = 0;
  }

  public Time(int hours, int minutes){
    this.hours = hours;
    this.minutes = minutes;
  }

  public int getHours(){
    return hours;
  }

  public int getMinutes(){
    return minutes;
  }

  public static void main(String [] args){

    /*Scanner sc = new Scanner(System.in);

    System.out.println("Enter your appointment time in military time.");

    System.out.print("Hour: ");
    hours = sc.nextInt();

    System.out.print("Minute: ");
    minutes = sc.nextInt();*/

    Time defaulttime = new Time();
    Time a = new Time(20,3);
    Time b = new Time(14,55);
    Time c = new Time(8,0);
    Time d = new Time(10,15);

    defaulttime.Display();
    a.Display();
    b.Display();
    c.Display();
    d.Display();


  }

  public void Display(){
    if(minutes < 10){
      System.out.println(this.getHours() + ":0" + this.getMinutes());
    }
    else{
      System.out.println(this.getHours() + ":" + this.getMinutes());
    }
  }
}
