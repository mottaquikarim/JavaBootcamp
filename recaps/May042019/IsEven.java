public class IsEven {
	public static boolean isEven(int num) {
		int remainder = num % 2;
		boolean isEven = remainder == 0;

		return isEven;
	}

	public static void main(String[] args) {

		int num = 2;
		int remainder = num % 2;

		boolean isEven = remainder == 0;
		System.out.println(IsEven.isEven(2));
		System.out.println(IsEven.isEven(3));
		System.out.println(IsEven.isEven(4));
		System.out.println(IsEven.isEven(5));

	}
}

