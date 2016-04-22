
import java.util.Scanner;
import java.util.Arrays;

class assignment4 {
	public static void main(String[] args){
		String stringvalue;
		String stringvalueReverse="";
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the string");

		stringvalue= in.next();

		for(int i=0;i<stringvalue.length();i++){
			int index=stringvalue.length()-i-1;
			stringvalueReverse+=stringvalue.charAt(index);
		}
		System.out.println("Reverse OF string is "+stringvalueReverse);
	}
}