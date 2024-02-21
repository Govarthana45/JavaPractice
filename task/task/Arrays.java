public class Arrays {
    public static void main(String[] args) {
        
        int [] numbers ={1,2,3,4,5};
        System.out.println(numbers[2]);
        System.out.println("Array Length :" +numbers.length);

        int sum = 0;
        numbers[1]=10;
        System.out.println("Modified Array");
        for (int i = 0;i<numbers.length;i++){
            System.out.print(numbers[i]+ " ");
        }
        System.out.println();
        for(int i =0;i<numbers.length;i++){
            sum +=numbers[i];
        }
        System.out.println("Sum of array element: " + sum);
        System.out.println("Average of array element: " + sum/numbers.length);

        int minIndex =0;
        int maxIndex=0;

        for (int i = 1;i<numbers.length;i++){
            if(numbers[i] < numbers[minIndex]){
                minIndex =i;
            }
            if(numbers[i] > numbers[maxIndex]){
                maxIndex =i;
            }
            
        }
        System.out.println("Minumum Value :" + numbers[minIndex]);
        System.out.println("Maxmum Value :" + numbers[maxIndex]);
        
        
        System.out.println("=============== Copy Array=========");
        int [] copynumbers = new int[numbers.length];
        //System.arraycopy(numbers,0,copynumbers,0,numbers.length);

        System.out.print("[");
        for( int i=0;i<numbers.length;i++){
	    copynumbers[i]=numbers[i];
	    System.out.print((i==numbers.length -1) ? copynumbers[i]+"]": copynumbers[i]+",");
}
    System.out.println();

        System.out.println("=============== Reverse Array=========");

        System.out.print("[");
        for (int i = numbers.length -1;i >=0;i--){
            
            System.out.print((i==0) ? numbers[i]+"]": numbers[i]+",");
        }


        
        }
      
        


    
}
