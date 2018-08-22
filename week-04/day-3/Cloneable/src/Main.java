public class Main {
  public static void main(String[] args) {
    Student student = new Student("John", 20, "male", "BME");
    student.introduce();
    student.clone(student).introduce();
  }
}