/*

printSpaceShip(2)

\
\\\
>>>>>
///
/

printSpaceShip(3)

\
\\\
\\\\\
>>>>>>>
/////
///
/

printSpaceShip(4)

\
\\\
\\\\\
\\\\\\\
>>>>>>>>>
///////
/////
///
/

*/

public class SpaceShip {

	public static void main(String[] args) {

		for(int i = 1; i <= 8; i++) {
			System.out.println("printSpaceShip("+i+")");
			printSpaceShip(i);
			System.out.println();
		}

	}

	public static void printSpaceShip(int num) {
		printBackSlash(num, 1);
		actualPrinter('>', ((num+1)*2)-1, 1);
		System.out.println();
		printFowardSlash(num, 1);
	}

	public static void printBackSlash(int num, int count) {
		if(num < count) {
			//
		}
		else if(count == 1) {
			System.out.println("\\");
			printBackSlash(num, count+1);
		}
		else {
			actualPrinter('\\', ((count-1)*2)+1, 1);
			System.out.println();
			printBackSlash(num, count+1);
		}
	}

	public static void printFowardSlash(int num, int count) {
		if(num < count) {
			//
		}
		else if(count == num) {
			System.out.println("/");
		}
		else {
			actualPrinter('/', (((num-1)*2)+1)-((count-1)*2), 1);
			System.out.println();
			printFowardSlash(num, count+1);
		}
	}

	public static void actualPrinter(char toPrint, int num, int count) {
		if(count > num) {
			//
		}
		else {
			System.out.print(toPrint);
			actualPrinter(toPrint, num, count+1);
		}
	}

}