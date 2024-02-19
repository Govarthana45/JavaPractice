public class Ternary {
    public static void main(String[] args) {
        int number =5;
        for( int i=1; i<=10; i++){
            //System.out.println(i<number ? "Lesser than "  + number: (i==number ? "Equal to "+ number : "Greater than "+ number));
            String Result =i<number ? "Lesser than "  + number: (i==number ? "Equal to "+ number : "Greater than "+ number);
            System.err.println(Result);

        }
        
    }
}
