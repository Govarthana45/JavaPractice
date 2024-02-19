import java.io.*;
public class Bot {
    public static void main(String[] args) {
    Console con = System.console();
    String username =con.readLine();
    
    int age =Integer.parseInt(con.readLine());
    System.out.println("Username is "+ " " +username);
    System.out.println("Age is" + " " + age);
    }
}
