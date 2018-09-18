package kyleeprescottch3examples;

import java.util.Scanner;

/*Kylee Prescott
 * 9/18
 * compute the area of a circle 
 */
public class ComputeArea {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		//step one:enter the radius of a circle
		 double area; 
		 double radius;
		 
		//constant declinations 
		 final  double PI= 3.1415926535979323846264338327950288419716939;
		 
		  
		  //assign a value to the radius 
		  System.out.println("Eneter the radius of a cirlce and press enter");
		  
		  radius = input.nextDouble();
		 
		  
		//step two:compute the area using the following formula:
		//area=radius*radius* pi 
		area=radius*radius*PI;
		
 		//step three:display result
		
		System.out.println("The area of your circle is:"+ area +"\"");
 	}

}
