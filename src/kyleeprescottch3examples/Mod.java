package kyleeprescottch3examples;
import java.util.Scanner;
import static java.lang.System.out;
/*kylee prescott
 * 9/18
 */
public class Mod {

	public static void main(String[] args) {
		int quarters;
		int dimes;
		int nickles;
		int cent;
		int total;
		int whatsLeft;
		boolean greaterThan4;
		
		Scanner input = new Scanner(System.in);
       out.println("how much change is in your pocket");
		total = input.nextInt();
		quarters = total/25;
		whatsLeft = total % 25;
		dimes =  whatsLeft /10;
		whatsLeft = whatsLeft %10;
		nickles =  whatsLeft/5;
		whatsLeft = whatsLeft %5;
		cent = whatsLeft;
		out.println(" from " +total+ " cents you get ");
		out.println(" quarters:"+quarters+" dimes:" +dimes+" nickles:"+nickles+" cent:"+cent+"");
		 greaterThan4 = quarters >=4;
		 out.println(greaterThan4);
		
		
		
		
		
		
		
		
	}

}
