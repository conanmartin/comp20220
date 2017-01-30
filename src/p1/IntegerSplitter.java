package p1;
import java.util.Scanner;

public class IntegerSplitter {
	public static void main (String[] args) {
		System.out.println ("Enter a number between 0 and 999 to calculate the sum of it's integers");
	
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		int n1 = n % 10;
		n = n / 10;
		int n2 = n % 10;
		n = n / 10;
		int n3 = n;
		int total = n1 + n2 + n3;
		
		System.out.println("Sum is " + total);
		
		
	}
}
