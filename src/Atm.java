import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the pin number");
		
		int a= sc.nextInt();
		
		
		if (a==1789) {
			
			System.out.println("Welocme to Bank");
			System.out.println("Please press 1 to with draw the money");
			int b= sc.nextInt();
			if (b==1) {
				
				System.out.println("enter the amount to withdraw");
			}
			
			
		}
		
		else 
			System.out.println("please enter the valid pin");
	}

}
