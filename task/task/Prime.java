public class Prime {
    public static int gcd(int a,int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a%b);

    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println("===========GCD========");

        int [][] numberss ={
            {48,18},
            {10,5}
        };
        for (int [] pairs : numberss){
            int numss1 = pairs[0];
            int numss2 = pairs[1];

            int resultt = gcd(numss1,numss2);
            System.out.println("GCD :" + resultt);
        }
    }
}
