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
    Time d = new Time(10,10);

    d.AddTime(235);

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

  public void AddTime(int addedTime){

    int total = minutes + (hours * 60) + addedTime;
    int newhours = total / 60;
    int newmins = total % 60;

    if(newhours > 23){
      newhours = 24 % newhours;
    }

    hours = newhours;
    minutes = newmins;

    //nasty hardcode below LOL
    /*if(minutes > 60){
      if(addedTime >= 120 && addedTime < 179){
        hours = hours + 1;
        minutes = minutes - 60;
        if(hours == 24){
          hours = 0;
        }
      }
      if(minutes >= 180 && minutes < 239){
        hours = hours + 2;
        minutes = minutes - 120;
        if(hours == 25){
          hours = 1;
        }
      }
      if(minutes >= 240 && minutes < 299){
        hours = hours + 3;
        minutes = minutes - 180;
        if(hours == 26){
          hours = 2;
        }
      }
      if(minutes == 240){
        hours = hours + 4;
        minutes = minutes - 240;
        if(hours == 27){
          hours = 3;
        }
      }
    }*/
  }
}
