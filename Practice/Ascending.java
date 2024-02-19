import java.util.Arrays;

public class Ascending {
    public static void main(String[] args) {
       int arr[]={2,6,5,9,8,10};;
        for(int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length - i -1 ;j++){
                if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j ] =arr[j+1];
                arr[j+1] = temp;
                }
            }
           
            
        }
         System.out.println("Descending order : " +Arrays.toString(arr));
    


        
        }
    }
}

