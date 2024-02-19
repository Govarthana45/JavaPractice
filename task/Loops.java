public class Loops {
    public static void main(String[] args) {

        System.out.println("=============1 to 10==========");
        for (int i =1;i<=10;i++){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("===========Even between 1 to 20===========");
        for(int i=1;i<=20;i++){
            if(i %2==0){
                System.out.print(i+ " ");
            }
        }
        System.out.println();
    

        System.out.println("===========Factorial===========");
        int num = 5;
        long Factorial =calFactorial(num);
        System.out.println(Factorial);

        




    }

    public static long calFactorial(int num){
        if(num ==0 || num == 1){
            return 1;
        }else{
            return num * calFactorial(num -1);
        }
    
}

}
