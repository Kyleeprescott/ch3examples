package kyleeprescottch3examples;

import java.util.Scanner;

/*Kylee Prescott
 * 9/18
 * compute the area of a circle 
 */
public class ComputeArea {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String adjective;
		 String name;
		 String number;
		 String relative;
		 String place; 
		 String place2;
		 String verbing;
		 String pluralNoun;
		 String adjective2;
		 String adjective3;
		 String person; 
		 String adjectively;
		 System.out.println("enter adjective");
		 adjective = input.next();
		 System.out.println("enter name");
		 name = input.next();
		 System.out.println("eneter number");
		 number = input.next();
		 System.out.println("enter relative");
		 relative=input.next();
		 System.out.println("eneter place");
		 place=input.next();
		 System.out.println("enter place2");
		 place2 =input.next();
		 System.out.println("eneter verbing");
		 verbing=input.next();
		 System.out.println("pluarNoun");
		 pluralNoun= input.next();
		 System.out.println("eneter adjective2 ");
		 adjective2 = input.next();
		 System.out.println("enter adjective3");
		 adjective3 = input.next();
		 System.out.println("eneter person");
		 person = input.next();
		 System.out.println("enter adjectively");
		 adjectively = input.next();
		 
	System.out.println("A new "+adjective+ " fairy princess is coming out soon! It will be about Snow "+name+" and the"+number+" "
			+ " dwarfs. Snow "+name+" is a princess whose beauty threatens her"+relative+" the queen.Snow "+name+" is forced to flee from"+place+""
					+ "and hides in nearby "+place2+"There she discovers the dwarfs"+verbing+"in their "+pluralNoun+"But the queen finds her and casts a"
							+ adjective2+"spell on her The dwarfs take care of her until the"+adjective3+""+person+" comes to rescue her "
									+ "and they all live "+adjectively+"ever after ");
		 
		 
	}
}
