class Person {
        String name;
        int age;
        String gender;

Person (String name, int age , String gender){
            this.name = name;
            this.age = age;
            this.gender = gender;           
}
void displayDetails(){
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Gender: " + gender);
}
}
class Student extends Person{
    int studentId;
    String course;
    char grade;

Student(String name,int age, String gender, int studentId,String course ,char grade){
    super(name ,age ,gender);
    this.studentId=studentId;
    this.course=course;
    this.grade=grade;
}
void displayDetails(){
    super.displayDetails();
    System.out.println("Student ID: " + studentId);
    System.out.println("Course: " + course);
    System.out.println("Grade: " + grade);
}

}
public class Inheritance {

        public static void main(String[] args) {
            Person n = new Person("kavinee", 022, "Male");
            Student m = new Student("Kavin", 22, "male", 45, "Java", 'A');
            System.out.println("Details of Person");
            n.displayDetails();
            System.out.println("Details of Student");
            m.displayDetails();

           
        }
}
