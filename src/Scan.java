import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the value a");
		int a = sc.nextInt();
		System.out.println("Enter the value b");
		int b = sc.nextInt();
		
		if (a>b) {
			
			System.out.println("a value is greater and its value is"+a);
		}
		else {
			System.out.println("b value is greater and its value is"+b);
		}
	}

	   System.out.println((a>b)?"A is greater"+a:"B is greater"+b);
}


