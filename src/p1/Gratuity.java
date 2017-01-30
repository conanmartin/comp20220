package p1;
import java.util.Scanner;

public class Gratuity {
	public static void main (String[] args) {
		System.out.println ("Please your bill amount and the gratuity percentage you wish to leave");
	
		Scanner input = new Scanner(System.in);
		double bill = input.nextDouble();
		double tip = input.nextDouble();
	
		double tipDue = (bill * tip) / 100;
		double total = bill + tipDue;
		System.out.println("Gratuity is €" + tipDue);
		System.out.println("Total due is €" + total);
}
}