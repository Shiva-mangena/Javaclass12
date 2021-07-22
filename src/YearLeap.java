import java.util.Scanner;

public class YearLeap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the year");
		
		int a= sc.nextInt();
		
	/*	if ((a%400==0)||(a%4==0)&&(a%100!=0)) {
			
			System.out.println("The give value is leap year"+a);
			
		}
		else 
			System.out.println("the give year is not leap year"+a);
			*/
		if (a!=0) {
	System.out.println(((a%400==0)||(a%4==0)&&(a%100!=0))?("This is leap year"+a):("This is not leap year"+a));
		
	}
		else 
			System.out.println("This is not leap yearbeause its equal to zero"+a);

}
}
