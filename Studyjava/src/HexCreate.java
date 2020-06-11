import java.util.Scanner;

public class HexCreate { // class name always starts with Cap
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);  //Scanner 
		System.out.println("Enter Number");
		int decimal = input.nextInt();
		if (decimal < 0 ) { //keep bracket formula consistent
			System.out.println("Invalid Input");
		}
		String hex = "";
		String hexanswer = "";
		
		for (int i = decimal; i != 0;) {
			int remainder = i % 16;
			
			hex = hex + remainder;
			i = i / 16;
			switch (remainder) {
			case 10: 
				hex = ("A");
				break;
			case 11: 
				hex = ("B");
				break;
			case 12: 
				hex = ("C");
				break;
			case 13: 
				hex = ("D");
				break;
			case 14: 
				hex = ("E");
				break;
			case 15: 
				hex = ("F");
				break;
			default:
		}
		
		}
		for(int j = 0; j < hex.length() ; j++) {
			hexanswer = hex.charAt(j) + hexanswer;
		}
		System.out.println("The hex is " +hexanswer); // Output information
	}
}
