import java.util.Scanner;

public class InOut {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a integer : ");

        int integer = scan.nextInt();
        
        System.out.println(integer);

        System.out.println("Enter a double: ");
        double bobble= scan.nextDouble();
        System.out.println(bobble);

        System.out.println("Enter a Name: ");
        scan.nextLine();
        String str= scan.next();
        scan.nextLine();
        System.out.println(str);

        
        System.out.println("Multiple Input Integer");

        String multy = scan.nextLine();
        
        Scanner inpuScanner = new Scanner(multy);

        int num1=inpuScanner.nextInt();
        int num2=inpuScanner.nextInt();
        int num3=inpuScanner.nextInt();

        int sum = num1 + num2 + num3;

        System.out.println("Sum of the integers :" + sum);
        
        inpuScanner.close();

        System.out.println("Multiple Input Double");

        String dolly = scan.nextLine();

        Scanner doubleScanner = new Scanner(dolly);
        doubleScanner.useDelimiter("\\s*,\\s*");

        double sumDoubles =0.0;
        int count=0;
        while (doubleScanner.hasNextDouble()) {
          sumDoubles += doubleScanner.nextDouble();
          count++;
            
        }
        System.out.println("Average of the Doubles :" + sumDoubles/count);

        doubleScanner.close();

        Scanner ch = new Scanner(System.in);
        System.out.println("Enter a single cahracter");
        char chh = ch.next().charAt(0);

        System.out.println("Character : " + chh);

        System.out.println("Enter a sentence ");
        Scanner st = new Scanner(System.in);

        String stt = st.nextLine();

        Scanner inpuScanner1 = new Scanner(stt);
        int length= stt.length();


        System.out.println("Entered Sentence in UperCase  :" + stt.toUpperCase());

          System.out.println("Enter a  Boolean Value ");

          Scanner bool = new Scanner(System.in);
          boolean bools = bool.nextBoolean();
          System.out.println("Entered Boolean Value :" + bools );

          System.out.println("Enter multiple Integers");

          Scanner inty = new Scanner(System.in);

          String input = inty.nextLine();

          String[] tokens =input.split("\\s+");

          if(tokens.length !=5){
            System.out.println("Enter 5 int separated by spaces");
            return;
          }

          int[] numberss = new int[5];

          for(int i =0 ; i< 5;i++){
            numberss[i] = Integer.parseInt(tokens[i]);
          }
          for(int i = 4; i >=0;i--){
            System.out.print(numberss[i]);

            if(i > 0){
              System.out.print(" ");
            }
          }


        }
}
