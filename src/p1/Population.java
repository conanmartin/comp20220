package p1;
import java.util.Scanner;

public class Population {
public static void main (String[] args){
	
	System.out.println("Enter the amount of years you'd like to look forward");
	
	Scanner input = new Scanner(System.in);
	int years = input.nextInt();
	int births = (years * 365 * 24 * 60 * 60) / 7;
	int deaths = (years * 365 * 24 * 60 * 60) / 13;
	int imms = (years * 365 * 24 * 60 * 60) / 45;
	
	int pop = 312032486 + births - deaths + imms;
	
	
	
	System.out.println("New population is " + pop);
	
}
}
