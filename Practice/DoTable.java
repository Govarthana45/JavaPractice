import java.util.Scanner;

public class DoTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the table you want : ");
        int number =scan.nextInt();

        int i=1;
        do{
            System.out.println(number + " x" + " " + i + " =" + " " + (number * i));
            i++;
        }while(i<=10);

        scan.close();

    }
}
