public class Swap {
    public static void main(String[] args) {
        int a= 50;
        int b=100;
        System.out.println("a is " + a + " and b is" + b);

        //Swap without third Variable

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a is " + a + " and b is" + b);
    }
}
