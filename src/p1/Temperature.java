package p1;
import java.util.Scanner;
public class Temperature {
	public static void main (String [] args){
		System.out.println("Please enter a temperature in F between -58 and 41, and a wind speed in mph of 2 or above to calculate temp with wind chill");
		
		Scanner input = new Scanner(System.in);
		double temp = input.nextDouble();
		double wind = input.nextDouble();
		
		double NewTemp = 35.74 + (0.6215 * temp) - (35.75 * Math.pow(wind, 0.16)) + (0.4275 * temp * Math.pow(wind, 0.16));
		
		System.out.println("Wind chill temp is " + NewTemp + "F");
		
	}
}
