import java.util.Scanner;

public class HexCreate { // class name always starts with Cap
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);  //Scanner 
		System.out.println("Enter Number");
		int decimal = input.nextInt();
	
		if (decimal < 0 ) { //keep bracket formula consistent
			System.out.println("Invalid Input");
		}
		
		decimal = decimal % 16;	
			switch (decimal) {
			case 10: 
				System.out.println("A");
				break;
			case 11: 
				System.out.println("B");
				break;
			case 12: 
				System.out.println("C");
				break;
			case 13: 
				System.out.println("D");
				break;
			case 14: 
				System.out.println("E");
				break;
			case 15: 
				System.out.println("F");
				break;
			default:
				System.out.println("decimal is less than 10");
			}
		
		
		System.out.println("Your input has been shortend to " + decimal);  // Output information
	}
}
