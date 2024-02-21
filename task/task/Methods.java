import java.util.Random;

public class Methods {

    public static void printMessage(){
        System.out.println("Hello,World!");
    }
    public static int  add(int a,int b){
        return a+ b;   
    }
    public static boolean isEven(int c){
        if(c %2 ==0){
            return true;
        }else{
            return false;
        }    
    }
    public static void printSquare(int d){
         System.out.println(d*d);
    }
    public static void add(int e,double f){
        System.out.println("Int :"+ e + " " + "Double :"+ " "+ f);
    }
    public static int factorial(int g){
        if(g ==0 || g==1){
            return 1;
        }else{
            return g * factorial(g -1);
        }
    }
    public static int findMax(int[] arr){
        if(arr.length ==0){
            throw new IllegalArgumentException("Array must not be empty");
        }
        int max = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;

    }

    public static int[] generateArray(int size){
       int [] array =new int[size];
       Random random =new Random();

       for(int i = 0;i<size;i++){
        array[i] =random.nextInt();
       }
       return array;
    }
    public static int average(int... numbersss){
        if(numbersss.length ==0){
            throw new IllegalArgumentException("At least one integer");
        }
        int sum =0;
        for(int nu : numbersss){
            sum+=nu;
        }
        return (int) sum/numbersss.length;
    }
    static void isPrime(int checkPrime){
        if(checkPrime<=1){
            System.out.println(checkPrime + " is not a Prime Number");
        }
        for (int i =2;i<=Math.sqrt(checkPrime);i++){
            if(checkPrime % i ==0){
                System.out.println(checkPrime + " is not a Prime Number");
            }
        }
        System.out.println(checkPrime + " is a Prime Number");
    }






    public static void main(String[] args) {
        printMessage();   
        System.out.println(add(5, 6));
        System.out.println(isEven(5));
        printSquare(5);
        add(45, 5.0);
        System.out.println(factorial(5));
        int [] num ={2,4,6,8,10};
        int max = findMax(num);
        System.out.println("Maximum NUmber is :"+ max);
        int size=5;
        int[] generateArray1 =generateArray(6) ;

        System.out.println("Generated Array ");
        for(int nums : generateArray1){
            System.out.println(nums);
        }


        System.out.println("Average :" + average(2,3,5,6,8));

        isPrime(2);
    }
}
