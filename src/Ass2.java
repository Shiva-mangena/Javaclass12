import java.util.Scanner;

public class Ass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

     Scanner sc = new Scanner(System.in);
		
	    System.out.println("Enter the leap Year");
	    int y = sc.nextInt(); // here y is given year//
	    
		
	    if (y!=0) {
	    	
	   String  x=	(((y%4==0)&&(y%100!=0))||((y%4==0)&&(y%100==0 && y%400==0)))?("given number is leap year"):("given number is not leap year");
	   System.out.println(y+" "+x);
	    }
	    
	    else 
	    	
	    	System.out.println("given number is not leap year");
	    
	}

}
