public class SumOfDigit{
	public static void main(String args[]){
		String a="243";
		int sum=0;
		int length=a.length();
		int current=0;
		while(current<length){
			char currentchar=(a.charAt(current));
			sum=sum+(Character.getNumericValue(currentchar));
			current+=1;
		}
		System.out.print(sum);
}}