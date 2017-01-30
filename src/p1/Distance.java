package p1;
import java.util.Scanner;

public class Distance {
	public static void main (String[] args){
		System.out.println("Enter coordinates x1, y1, x2, y2 to find the distance between them");
		
		Scanner input = new Scanner(System.in);
		int x1 = input.nextInt();
		int y1 = input.nextInt();
		int x2 = input.nextInt();
		int y2 = input.nextInt();
		
		double distance = Math.sqrt((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
		
		System.out.println("Distance between points is " + distance);
	}
}
