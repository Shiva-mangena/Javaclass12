import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scanner sc=new Scanner(System.in);
		// System.out.println("enter the number");
		// int num=sc.nextInt();

		// int n, count = 0, a, b, c, sum = 0;
		// Program to find the sum of natural numbers from 1 to 1000.
		/* for(int i = 1; i <= 1000; i++)
	        {
	            n = i;
	            while(n > 0)
	            {
	                b = n % 10;
	                sum = sum + (b * b * b);
	                n = n / 10;
	            }
	            if(sum == i)
	            {
	                System.out.print(i+" ");
	            }
	            sum = 0;
*/
		int num = 100;
		int rem;
		int sum = 0;
		int temp;
		while (num < 999)
			
		temp = num;
		while (temp > 0) {

			rem = temp % 10;
			sum = sum + (rem * rem * rem);
			temp = temp / 10;

		}
		if (temp==sum)
		System.out.print(temp+"\t");
		num++;
		
	}
}
