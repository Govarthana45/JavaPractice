import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is not a Palindrome");
        }

        scanner.close();
    }

    private static boolean isPalindrome(String str) {
        String cleanedStr = str.replaceAll("\\s", "").toLowerCase();

        int left = 0;
        int right = cleanedStr.length() - 1;

        while (left < right) {
            if (cleanedStr.charAt(left) != cleanedStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
