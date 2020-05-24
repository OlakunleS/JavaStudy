public class InputHex {
	public static void main() {
		Scanner input = new Scanner(System.in);  //Scanner 
		System.out.println("Enter Number");
		int decimal = input.nextInput();

		if (decimal < 0)|| (decimal > 15){
			system.out.printIn(Invalid Input);
			}
		char hex;
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
			System.out.println("Couldn't read decimal input.");
		}
		
		System.out.println("The hex is " + decimal);  // Output information
	}
}

