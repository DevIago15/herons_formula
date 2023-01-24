/* Write a program to read the lengths of the sides of two triangles X and Y (assume valid lengths). 
 * Then show the value of the areas of the two triangles and say which one has the largest area 
 * (use Heron's formula).
*/

package application;

import java.util.Scanner;

import entities.Triangle;

import java.util.Locale;

public class Program {

	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		
		Locale.setDefault(Locale.US);
		
		// data input
		System.out.print("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.print("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		// data output
		
		double p = (x.a + x.b + x.c) / 2.0;
		double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
		
		p = (y.a + y.b + y.c) / 2.0;
		double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));
		
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
