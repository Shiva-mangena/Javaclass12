import java.util.Scanner;

public class Mobile {

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
	    
	    
	    int k = z/y;
	    if (x>0) {
	        System.out.println((z>=y)?("No of mobiles he can buy"+ k):"customer dont have enough money to buy mobile");
	       
	        System.out.println((x<=k)?(((k/x)+k)+"Discount can be applicable"):"Discount can not be applicable");
	         
	         /* if (x<=k) {
		    	   int discout = k/x;
		   	       int total = discout+k;
			   System.out.println("Discount can be applicable");
			      
	    		 System.out.println("buy" +x+"get one mobile discount applied he got" +total+"mobiles");
		              }
		   
		           else {
			   
			         System.out.println("Discount can not be applicable");
			       
			   
		               }
	   }*/
	    }
	    
	    else {
	    	System.out.println("invalid discount method x");
	    }
	    
	}

}
