public class Average {
    public static void main(String[] args) {
        int array[] = {11,34,45,78,89};
        int a= array.length;
        System.out.println(a);

        int sum =0;
        for (int i=0;i<a;i++){
            sum= sum + array[i];
        }
        System.out.println("Sum of the array :" + sum);
        // int average =  sum/a;
        //float average = (float) sum/a;
        int average = (short) sum/a;
        System.out.println("Average of the array : " + average);

        // int item=5;
        // double d= item;
        // System.out.println(d);

        // int hii= (int) d;
        // System.out.println(hii);

        // int summ= 0, n=5;
        // for (int i=0; i<=n; i++){
        //     summ+=i;
        // }
        // System.out.println("sum is " + summ);


    }
}
