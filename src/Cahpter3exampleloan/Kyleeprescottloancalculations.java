package Cahpter3exampleloan;
import java.util.Scanner; 

/*kylee precsott
 * 9/18
 * loan calculations example 
 */

public class Kyleeprescottloancalculations {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double loanamount;                   
		double monthlyInterestRate;
		double numberOfYears ;
		
		// user input 
		System.out.println("enter the monthly intrest rate");
		monthlyInterestRate =  input.nextDouble();
		System.out.println("enter the amount of years you want to pay loan off in ");
		numberOfYears = input.nextDouble();
		System.out.println("enter loan amount");
		loanamount = input.nextDouble();
		
		//calculations
		monthlyInterestRate = monthlyInterestRate/1200;
		double monthlyPayment = loanamount*monthlyInterestRate/(1-1/Math.pow(1+monthlyInterestRate,numberOfYears*12));
		double total = monthlyPayment*12* numberOfYears;
		
		//display output
		System.out.println("your monthly payment is "+ monthlyPayment+"");
		System.out.println("your total amount of payments are  "+total+"");
		
		
		
		
		
		
		
		
		
		

	}

}
