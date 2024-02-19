import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);
        

        System.out.print("Enter the table you want :");

        int input =scan.nextInt();

        for (int i =1; i<=10; i++){
            System.out.println(input + " x" + " " + i + " =" + " " +(input * i));
        }

        scan.close();;

    }
}
