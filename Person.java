//Brionna Cunningham; Susanna Pritchett

import java.util.Scanner;

public class Person{
  String firstname;
  String lastname;
  String zipcode;

  public Person(){
    firstname = "X";
    lastname = "X";
    zipcode = "X";
  }

  public Person(String firstname, String lastname, String zipcode){
    this.firstname = firstname;
    this.lastname = lastname;
    this.zipcode = zipcode;
  }

  public String getFirst()
  {
    return firstname;
  }

  public String getLast()
  {
    return lastname;
  }

  public String getZip(){
    return zipcode;
  }

  public static void main(String[] args){

    /*Scanner sc = new Scanner(System.in);

    System.out.print("This records personal information. To skip an argument, press Enter.");
    System.out.print("This argument will be displayed as \"X\".");

    System.out.print("Please enter your first name: ");
    firstname = sc.nextLine();

    System.out.print("Please enter your last name: ");
    lastname = sc.nextLine();

    System.out.print("Please enter your zipcode: ");
    zipcode = sc.nextLine();*/

    Person defaultperson = new Person();
    Person userdata = new Person("Eddy", "Borera", "666666");

    defaultperson.Display();
    userdata.Display();

  }

  public void Display(){
    System.out.println("First name: " + this.getFirst());
    System.out.println("Last name: " + this.getLast());
    System.out.println("Zipcode: " + this.getZip());
  }

}
