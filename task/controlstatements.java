public class controlstatements {
    public static void main(String[] args) {
        System.out.println("============= Positive Number or Negative Number ============");

        int num = 5;
        if(num ==0){
            System.out.println("Number is Zero");
        }else if(num > 0){
            System.out.println("Number is Positive");
        }else if(num < 0){
            System.out.println("Number is Negative");
        }

        System.out.println("=============Leap Year =============== ");
        int year = 2000;
        if((year % 4==0 && year % 100 !=0) || (year % 400==0)){
            System.out.println(year + " is a leap year");
        }else{
            System.out.println(year + " is not a leap year");
        }

        System.out.println("=============Maximum  or Largest Number=============== ");

        int a = 5;
        int b = 7 ;
        int c = 9 ;
        if(a> b && a > c){
            System.out.println(a + " is the Maximum or Largest Number");
        }if(b> a && b > c){
            System.out.println(b + " is the Maximum or Largest Number");
        }if(c> b && c > b){
            System.out.println(c + " is the Maximum  or Largest Number");
        }

        System.out.println("============Vowel or Consonant ========");

        String character = "ch";

        character = character.toLowerCase();

        StringBuilder vowels = new StringBuilder();
        StringBuilder consonants = new StringBuilder();

        for (int i = 0; i < character.length(); i++) {
            char ch = character.charAt(i);

            if ((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u')) {
                vowels.append(ch);
            } else {
                consonants.append(ch);
            }
        }
        System.out.println("vowels : " + vowels.toString());
        System.out.println("consonants : " + consonants.toString());
        
        System.out.println("==========Even or Odd============");

        int nums = 5;
        if(nums % 2==0){
            System.out.println(nums +" is Even");
        }else if(nums % 2!=0){
            System.out.println(nums +" is Odd");
        }else if(nums ==0){
            System.out.println(nums + " is Zero");
        }

        System.out.println("==========Grade of the Student ============");

        int percentage = 40;
        if (percentage >=80 && percentage <=100){
            System.out.println("Student is A grade");
        }else if (percentage >=60 && percentage <=79){
            System.out.println("Student is B grade");
        }else if (percentage >=45 && percentage <=59){
            System.out.println("Student is C grade");
        }else  {
            System.out.println("Student has Arrear ");
        }

        System.out.println("=========Divisible by 2 and 3============");

        int Divisible = 6;
        if (Divisible%2 ==0 && Divisible % 3 ==0){
            System.out.println("Divisible by 2 and 3");
        }else{
            System.out.println("Not Divisible by 2 and 3");
        }

        System.out.println("========= Palindrome ============");
        
        String strr ="kavin";
        strr= strr.toLowerCase();

        StringBuilder reverse = new StringBuilder();
        int length = strr.length();
        int lenght1 = length -1;
        for (int i =lenght1; i >=0;i--){
            char ch =strr.charAt(i);
            reverse.append(ch);
          
        }
        System.out.println(strr);
        System.out.println("Reverse :" + reverse);
        if(strr.equals(reverse.toString())){
            System.out.println("Palindrome");    
        }else{
            System.out.println("Not a palindrome");
        }

        System.out.println("=============Switch Statement==========");

        int dayNumber= 3;
        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not Matching");
                break;
        }
        






    }
}
