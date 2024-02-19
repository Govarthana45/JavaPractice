import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);
        

        System.out.print("Enter the table using for loop :");

        int input =scan.nextInt();

        for (int i =1; i<=10; i++){
            System.out.println(input + " x" + " " + i + " =" + " " +(input * i));
        }
      
        Scanner scann = new Scanner(System.in);

        System.out.print("Enter the table using while loop :");

        int number =scann.nextInt();
        int j = 1;

        while (j<=10) { 
            System.out.println(number + " x" + " " + j + " =" +" " +(number * j));
            j++;
        }
        Scanner scannn = new Scanner(System.in);
        System.out.print("Enter the table using do while loop : ");
        int num =scannn.nextInt();

        int k=1;
        do{
            System.out.println(num + " x" + " " + k + " =" + " " + (num * k));
            k++;
        }while(k<=10);

       
        
    

        scan.close();
        scann.close();
        scannn.close();

    }
     
    
}
