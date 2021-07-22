import java.util.Scanner;

public class Discount {

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
	    
	    // if customer dont have enough money he cannot buy a mobile//
	          if (z>=y) {
	        	  
	        // x is the discount label / buy "x" mobile get one free mobile free //
	    	//  k is the total number of phones he can buy//
	    	//  z is total amount of money customer has//
	    	//  y is cost of each mobile//
	        	// (z>=1y)  
	    	int k = z/y;
	    	
	    	 System.out.println("Total number of mobile he can buy is"+k);
	    	 if (x>0) {
	    		 
	    		 int discout = k/x;
	    		 
	    		 int total = discout+k;
	    		 System.out.println("buy" +x+"get one mobile discount applied he got"+total+"mobiles");
	    	 }
	    	 
	    	 else {
	    		  System.out.println("invalid discount label");
	    	 }
	    	 
	    }
	    else {
	    	
	    	System.out.println("customer dont have enough money to buy mobile");
	    }
	    	
	    }
	    
	    
	}


