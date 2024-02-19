import java.util.*;

public class scannerr{
public static void main (String args[]){


	ArrayList <String> namess=new ArrayList <>();
	ArrayList <Float> agess=new ArrayList <>();
	ArrayList <Boolean> bools=new ArrayList <>();

	Scanner scan = new Scanner(System.in);

	Boolean input=true;
	while(input){
	System.out.println("Enter name( type 'exit' to finish :)");
	String str= scan.next();
	scan.nextLine();

	if(str.equals("exit")){
	break;
	}
	System.out.println("Enter age:");
	float f = scan.nextFloat();

	System.out.println("Is married (true/false) :");
	boolean b =scan.nextBoolean();

	namess.add(str);
	agess.add(f);
	bools.add(b);
}
	
	System.out.println();
	System.out.println("Entered details:" );
	for(int i = 0; i<namess.size();i++){
		System.out.println("Name :" +namess.get(i)+",Age :" +agess.get(i)+",Is Married :" +bools.get(i));

}
	

	

	








}
}