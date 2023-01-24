/* Write a program to read the lengths of the sides of two triangles X and Y (assume valid lengths). 
 * Then show the value of the areas of the two triangles and say which one has the largest area 
 * (use Heron's formula).
*/


package exercise_triangle;

import java.util.Scanner;
import java.util.Locale;

public class Program {

	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double xA, xB, xC, yA, yB, yC;
		Locale.setDefault(Locale.US);
		
		// data input
		System.out.print("Enter the measures of triangle X: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		System.out.print("Enter the measures of triangle Y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		// data output
		
		double p = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		
		p = (yA + yB + yC) / 2.0;
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.printf("Triangle with larger area is X: %.4f%n ", areaX);
		}
		else {
			System.out.printf("Triangle with larger area is Y: %.4f%n ", areaY);
		}
		
		sc.close();
	}

}
