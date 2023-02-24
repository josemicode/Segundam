package segundam;

public class noteloesperas {

	public static int numerales(int p1, int p2) {

		int sum = 0;
		for (int i = p1; i <= p2; i++) {
			sum += i;
		}
		return (sum);
	}

	public static void main(String[] args) {

		int num1 = Integer.valueOf(args[0]);
		int num2 = Integer.valueOf(args[1]);

		int sumatorio = numerales(num1, num2);
		System.out.println(sumatorio);

	}

}
