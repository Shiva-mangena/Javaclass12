import java.util.Scanner;

public class Mob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		
	    System.out.println("Welcome to java mobile store");
	    System.out.println("On going Deals are listed below");
	    System.out.println("Buy X Mobiles Get one MObile Free ");
	    System.out.println("Please enter the X value");
	    int x = sc.nextInt();
	    System.out.println(" Enter the cost of each mobile");
	    int y= sc.nextInt();
	    System.out.println("how much money did the customer has");
	    int z = sc.nextInt();
	    
	    
	    
	    
	    if (x>0) {
	    	System.out.println("Today deal is buy"+x+ "get one");
	    	int k = z/y;
	    	int total = (k/x)+k;
	        System.out.println((z>=y)?("No of mobiles he can buy"+ k):"customer dont have enough money to buy mobile");
	       
	        System.out.println((x<=k)? "Discount can be applicable":"Discount can not be applicable");
	        System.out.println("Total number of phones he got is"+total);
	        }
	    else {
	    	System.out.println("invalid discount method x");
	    }
	}
 
}
