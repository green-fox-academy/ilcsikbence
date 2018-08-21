public class Sponsor extends Person {

  String company;
  int hiredStudents;

  public Sponsor(String name, int age, String gender, String company) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.company = company;
    hiredStudents = 0;
  }

  public Sponsor() {
    name = "Jane Doe";
    age = 30;
    gender = "female";
    company = "Google";
    hiredStudents = 0;
  }

  public int hire() {
    hiredStudents += 1;
    return hiredStudents;
  }

  public void getGoal() {
    System.out.println("Hire brilliant junior software developers.");
  }

  public void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + this.age + " year old " + this.gender + " who represents " + this.company + " and hired " + hiredStudents + " students so far.");
  }
}