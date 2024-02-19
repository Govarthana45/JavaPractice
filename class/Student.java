 public class Student {

        private int id;
        private String name;
        private int age;
        private char grade;
        private String address;

    void setDetails(int id,String name,int age,char grade,String address){
        this.id=id;
        this.name=name;
        this.age=age;
        this.grade=grade;
        this.address=address;

    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public char getGrade(){
        return grade;
    }
    public String getAddress (){
        return address;
    }     
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setDetails(45, "Kavin", 22, 'A', "Salem Byepass");
        System.out.println(stu.id);
        System.out.println(stu.name);
        System.out.println(stu.age);
        System.out.println(stu.grade);
        System.out.println(stu.address);

    }
}
