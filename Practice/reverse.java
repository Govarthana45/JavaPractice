public class reverse {
    public static void main(String[] args) {
        String str ="Kavin Varshini";
        String reversestr= "";
        char ch;


        for (int i=0;i<str.length();i++){
            ch = str.charAt(i);
            //System.out.println(ch);
            reversestr = ch + reversestr;
        }
        System.out.println("Reversed string is " + reversestr);

    }
}
