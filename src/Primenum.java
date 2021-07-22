import java.util.Scanner;

public class Primenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scanner sc = new Scanner(System.in);
		// System.out.println("enter the number");
		// int num =sc.nextInt();
		int num = 1;
		
		while (num <= 100) {
			int count = 2;
			boolean prime = true;
			while (count < num) {

				if (num % count == 0) {
					prime = false;
					break;
				}

				else
					prime = true;
				count++;
			}

			if (prime) {

				System.out.println(num);
			} 
			
			num++;
		}
	}

}
