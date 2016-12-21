/*
	printSquare(3)
	***
	* *
	***

	printSquare(5)
	*****
	*   *
	*   *
	*   *
	*****

	printSquare(6)
	******
	*    *
	*    *
	*    *
	*    *
	******
*/

public class Square {

	public static void main(String[] args) {

		System.out.println("printSquare(3)");
		printSquare(3);

		System.out.println();

		System.out.println("printSquare(5)");
		printSquare(5);

		System.out.println();

		System.out.println("printSquare(6)");
		printSquare(6);

	}

	public static void printSquare(int orig) {
		if(orig <= 1)
			System.out.println("*");
		else
			printSquare(orig, 1);
	}

	public static void printSquare(int orig, int count) {
		if(count > orig) {
			//
		}
		else if(count == orig || count == 1) {
			printFunction('*', orig);
			System.out.println();
			printSquare(orig, (count+1));
		}
		else {
			System.out.print("*");
			printFunction(' ', (orig-2));
			System.out.print("*");
			System.out.println();
			printSquare(orig, (count+1));
		}
	}

	public static void printFunction(char toPrint, int amount) {
		if(amount > 0) {
			System.out.print(toPrint);
			printFunction(toPrint, (amount-1));
		}
	}

}