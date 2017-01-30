package p1;
import java.util.Scanner;
public class BMI {
	public static void main (String [] args){
		System.out.println("Enter your weights in lbs and height in inches to calculate BMI");
		Scanner input = new Scanner(System.in);
		
		double weight = input.nextDouble() * 0.45359237;
		double height = input.nextDouble() * 0.0254;
		
		double bmi = weight / (height * height);
		
		System.out.println("Your BMI is " + bmi);
		
	}
}
