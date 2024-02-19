public class copyarray {

public static void main(String args []){

int[] numbers = {1,2,4,3,5};
int [] copynumbers = new int[numbers.length];
//System.arraycopy(numbers,0,copynumbers,0,numbers.length);

System.out.print("[");
for( int i=0;i<numbers.length;i++){
	copynumbers[i]=numbers[i];
	System.out.print((i==numbers.length -1) ? numbers[i]+"]": numbers[i]+",");
}



}

}