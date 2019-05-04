import java.util.Scanner;

public class NumProps {
	public static boolean isEven(int n) {
		return (n % 2) == 0;
	}

	public static boolean isOdd(int n) {
		return (n % 2) == 1;
	}

	public static boolean isDivisibleBy(int n, int base) {
		return (n % base) == 0;
	}

	public static void main(String[] args) {
		// create a scanner so we can read the command-line input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter int: ");
		int num = scanner.nextInt();

		boolean numEven = NumProps.isEven(num);
		boolean numOdd = NumProps.isOdd(num);
		boolean numDiv10 = NumProps.isDivisibleBy(num, 10);

		System.out.println(num + "is even? " + numEven);
		// "5 is even? false"

		String evenOutput = String.format("%d is even? %b", num, numEven);
		System.out.println(evenOutput);

		String oddOutput = String.format("%d is odd? %b", num, numOdd);
		System.out.println(oddOutput);

		String divisbleBy10 = String.format("%d is divisible by 10? %b", num, numDiv10);
		System.out.println(divisbleBy10);

	}
}





