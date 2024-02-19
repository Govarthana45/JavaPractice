
public class CheckVowels {
    public static void main(String[] args) {
        String a = "Kavin";
        System.out.println(matchesTheVowels(a));
    }

    public static boolean matchesTheVowels(String input) {
        return input.toLowerCase().matches(".*[aeiou].*");
    }
}
