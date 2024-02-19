import java.util.Scanner;

public class TableWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the table you want :");

        int number =scan.nextInt();
        int i = 1;

        while (i<=10) { 
            System.out.println(number + " x" + " " + i + " =" +" " +(number * i));
            i++;
        }
        scan.close();
    }
}
