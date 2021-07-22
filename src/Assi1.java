import java.util.Scanner;

public class Assi1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		if ((number % 2 == 0) && (number % 3 == 0)) {
			System.out.println("given number is  divisble by 2 and 3");
		}

		else if ((number % 2 == 0)||(number % 3 == 0)) {
				System.out.println((number%2==0)?("the given nuber is divisble by 2 "):("given number is divisble by 3"));

			} else {

				System.out.println("given number is not divisible 2 or 3");
			}
			
		

	}

}
