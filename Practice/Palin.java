import java.util.Scanner;

public class Palin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String input = scan.nextLine();

        String result =checkPalindrome(input);

        System.out.println(result);

        scan.close();




        
    }
    private static String checkPalindrome(String str){
        str= str.replaceAll("\\s","").toLowerCase();
        int left=0;
        int right = str.length() - 1;

        while(left< right){
            if(str.charAt(left) != str.charAt(right)){
                return str + " is not a palindrome";
            }

            left++;
            right--;


        }
        return str + " is a palindrome";

    }
}
