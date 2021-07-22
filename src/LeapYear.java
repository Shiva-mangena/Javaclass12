import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
	    System.out.println("Enter the leap Year");
	    int year = sc.nextInt();
	    
	    if ((year!=0)&&(year%4==0)) {
	    	
	    	if (year%100!=0) {
	    		
	    		System.out.println("this is leap year beacuse it is divisieble by 4 and not divisble by 100"+year);
	    		
	    	}
	    		
	    	else   {
	    		
	             if ((year%400==0)) {
	            	 
	            	 System.out.println("this is leap year beacuse it is divisieble by 400 and  divisble by 100"+year);
	    	}
	             else {
	            	 
	            	 System.out.println("given number is not leap year"+year);
	             }
	            	 
	            	 
	    }
	    }
	    	
	    	else {
	    		
	    		System.out.println("this is NOT leap year"+year);
	    	}
	    	
	    		
	    		
	    		
	    		
	    
	    	
	     
	
	
	}

}
