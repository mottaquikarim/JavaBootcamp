public class MyClass {
	public static void main(String[] args) {
		double pi = 3.14159;
		System.out.println(pi);

		int pi_estimate = (int) pi;
		String output = "ESTIMATED PI... " + pi_estimate;
		String output2 = String.format("More precise PI: %1.3f", pi);
		System.out.println(output);
		System.out.println(output2);
	}
}