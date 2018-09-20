package kyleeprescottch3examples;
import java.util.Scanner;

/*Kylee Prescott
 * 9/18
 * operators examples
 */
public class Operators {

	public static void main(String[] args) {
		/*
		 * 
	
		int i = 1;
		System.out.println(i);
		i = ++i;
		System.out.println(i);
		*/
				
				Scanner input =new Scanner(System.in);
				/*
				System.out.println("enter a value that will fit in a byte -128-127");
			   byte byteValue = input.nextByte();*/
			   
			   System.out.println("eneter a value that will fit in a double");			   
			   double doubleVALue = input.nextDouble();
			   System.out.println("eneter a value that  will fit in a int");
			   int intValue =  input.nextInt();
			   
			 
			   
			   /*
			    * byte addByte = (byte) (byteValue + byteValue)
            System.out.println(addByte);
            */
			  /* byte minusAByte = (byte) (byteValue - byteValue);
			   System.out.println(minusAByte);*/
			  
			  /* int xAByte = (byteValue * byteValue);
			   System.out.println(xAByte);*/
			   int intdev = (doubleVALue) % intValue ;
			   System.out.println(intdev);
			   
	}

}
