package p1;
import java.util.Scanner;
public class RoadTripCost {
	public static void main (String[] args){
		System.out.println("Enter distance in miles, efficiency in mpg and cost per gallon of fuel to calculate trip cost!");
		
		Scanner input = new Scanner(System.in);
		double distance = input.nextDouble();
		double mpg = input.nextDouble();
		double cost = input.nextDouble();
		
		double totalcost = distance / mpg * cost;
		System.out.println("Total cost is €" + totalcost);
		
	}
}
