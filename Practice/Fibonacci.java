import java.util.Scanner;

public class Fibonacci {

    public static void FibonacciSequence(int count) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number a : ");
        int a =scan.nextInt();
        System.out.print("Enter the number b : ");
        int b =scan.nextInt();
        System.out.print("Enter the number c : ");
        int c =scan.nextInt();

        for (int i=1; i <=count;i++){
            System.out.print(a + " , ");
            // with two integers 
            // int temp = a;
            // a=b;
            // b=temp+a;
            // with three integers
            a=b;
            b=c;
            c=a+b;
        }
        scan.close();
        
        }
        public static void main(String[] args) {
            FibonacciSequence(49);
        }
}