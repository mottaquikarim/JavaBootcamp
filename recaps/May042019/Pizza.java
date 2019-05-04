public class Pizza {
	public static double area(int d) {
		double r = d / 2;
		return 3.14159 * r * r;
	}

	public static void main(String[] args) {
		// do stuff with Pizza here!
		double dominos = Pizza.area(10);
		System.out.println(dominos);

		double napolis = Pizza.area(20);
		System.out.println(napolis);
	}
}