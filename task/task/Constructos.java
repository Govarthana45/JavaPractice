
class Person {
    String name ;
    int age ;
    
    Person(){
        name="Unknown";
        age=0;
    }
   
}
class Student{
    String name;
    int rollNumber;

    Student(String name,int rollNumber){
        this.name=name;
        this.rollNumber=rollNumber;
    }
}
class Rectangle{
    double lenght;
    double width;

    Rectangle(double lenght,double width){
        this.lenght=lenght;
        this.width=width;
    }
    Rectangle(double sideLength){
        this.lenght= sideLength;
        this.width=sideLength;
    }

    public double getLength(){
        return lenght;
    }

    public double getWidth(){
        return width;
    }

    public void setLength(double lenght){
        this.lenght=lenght;
    }

    public void setWidth(double width){
        this.width=width;
    }

    public double calculateArea(){
        return lenght * width;
    }

    public double calculatePerimeter(){
        return 2 * (lenght + width) ;
    }


}





public class Constructos {
    public static void main(String[] args) {

        Rectangle rec = new Rectangle(5 ,3);
        System.out.println("Rectangle - Area :" + rec.calculateArea());
        System.out.println("Rectangle - Perimeter :" + rec.calculatePerimeter());

        Rectangle square = new Rectangle(4);
        System.out.println("Rectangle - Area :" + square.calculateArea());
        System.out.println("Rectangle - Perimeter :" + square.calculatePerimeter());

        
    }
}
