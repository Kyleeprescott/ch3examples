package kyleeprescottch3examples;
import java.util.Scanner;
/*
 * 
 */


public class Calculatedegrees {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("enter the degrees in farhenhiet");
		double fahrenheit = input.nextDouble();
		double celsius =(5.0/9)*(fahrenheit-32);

		System.out.println( celsius);
		
		
		
		
		
		

	}

}
