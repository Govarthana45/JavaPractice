import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        System.out.println("=============1 to 10==========");
        for (int i =1;i<=10;i++){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("===========Even between 1 to 20===========");
        for(int i=1;i<=20;i++){
            if(i %2==0){
                System.out.print(i+ " ");
            }
        }
        System.out.println();
    

        System.out.println("===========Factorial===========");
        int num = 5;
        long Factorial =calFactorial(num);
        System.out.println(Factorial);

        System.out.println("===========Fibonacci===========");

        Scanner scan = new Scanner(System.in);
        int limit = scan.nextInt();
        int a = 0;
        int b = 1;
        for (int i =1;i <=limit;i++){
            System.out.print(a + ",");
            int temp =a;
            a=b;
            b = temp + b;
        }
        System.out.println();
        System.out.println("===========Tables========");


        Scanner hii = new Scanner(System.in);
        int table = hii.nextInt();
        

        for (int i = 1;i<=10;i++){
            System.out.println(i + " * " + table + " = "+ (i * table));
        }

        System.out.println();
        System.out.println("===========Sum of Numbers========");

        int sum = 0;
        for (int i=1;i<=100;i++){
            sum +=i;
        }
        System.out.println("Sum :" + sum);

        System.out.println();
        System.out.println("===========Prime Number========");

        Scanner prime = new Scanner(System.in);
        int checkup = prime.nextInt();

        if(checkup <=1){
            System.out.println("Not Prime");
        }
        for (int i = 2;i <=Math.sqrt(checkup);i++){
            if(checkup % i ==0){
                System.out.println("Not a Prime Number");
            }
            else{
                System.out.println(checkup + " is Prime Number");
            }
        }
        
        System.out.println();
        System.out.println("===========Reverse a number========");

        Scanner reverse = new Scanner(System.in);
        System.out.println("enter a number to reverse");
        long revnumber = reverse.nextLong();

        String  revLenght =String.valueOf(revnumber);
        int len =revLenght.length();

        long[] resultStote = new long[len];

        for (int i =len -1;i>=0;i--){
            resultStote[len -1 - i] = revnumber %10;
            revnumber /=10;
            
        }
        System.out.println("Reversed Number ");
        for (long reversedNumber : resultStote){
            System.out.print(reversedNumber);
        }

        System.out.println();
        System.out.println("===========Reverse a String========");

        Scanner strrr = new Scanner(System.in);
        System.out.println("enter a number to String");
        String strs = strrr.next();

        
        
        strs= strs.toLowerCase();

        StringBuilder reverseString = new StringBuilder();
        int length = strs.length();
        int lenght1 = length -1;
        for (int i =lenght1; i >=0;i--){
            char ch =strs.charAt(i);
            reverseString.append(ch);
          
        }
        System.out.println(reverseString);
        






    }

    public static long calFactorial(int num){
        if(num ==0 || num == 1){
            return 1;
        }else{
            return num * calFactorial(num -1);
        }

   

    
}

}
