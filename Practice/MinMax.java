public class MinMax {
    public static void main(String[] args) {
        int length =args.length;
        int total = 0;
        for (int i= 0;i <length;i++){
            total += Integer.parseInt(args[i]);
        }
        System.out.println("Average of the sum : " +  total/length);
        
    }
}
