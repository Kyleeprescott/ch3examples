import java.util.Scanner;

public class ConverCelciusToFahrenheit {
/*kylee prescott
 * 10/18
 */
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("enter the degrees in ");
		double celcius = input.nextDouble();
		double fahrenheit =(9.0/5)*celcius +32;

		System.out.println( fahrenheit);
		

	}

}
