package p1;
import java.util.Scanner;

public class ShapeArea {
	
		public static void main (String[] args) {
			System.out.println ("Please insert a radius and length to calculate the area and volume of a cylinder");
		
	 
	 Scanner input = new Scanner(System.in);
	 double radius = input.nextDouble();
	 double length = input.nextDouble();
	 double area = radius * radius * Math.PI;
	 double vol = area * length;
	 System.out.println ("Area is " + area);
	 System.out.println("Volume is " + vol);
	 }
}