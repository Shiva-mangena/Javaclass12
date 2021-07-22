
public class Fbb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Print all Armstrong numbers between 1 and 1000:\n");
		int number = 100;
		

		while (number <= 900) {
			int sum = 0;
			int rem;
			
			int temp = number;
			while (number > 0) {

				rem = number % 10;
				sum = sum + (rem * rem * rem);
				number = number / 10;

			}
			// digit1 = number - ((number / 10) * 10);
			// digit2 = (number / 10) - ((number / 100) * 10);
			// digit3 = (number / 100) - ((number / 1000) * 10);
			// temp = (digit1 * digit1 * digit1) + (digit2 * digit2 * digit2) + (digit3 *
			// digit3 * digit3);
			if (temp == sum) {
				System.out.println("\n Armstrong no is:d" + temp);
			}
		}
		number++;

	}

}
