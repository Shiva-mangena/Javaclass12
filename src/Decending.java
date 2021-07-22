
public class Decending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//int num =100;
		
		
	//	while (num>5) {
			
		//	System.out.print((num*5)+"\t");
			
			//num--;
		//}
		int count=0;
		boolean prime=true;
		for(int num =10; num>1; num--) {
			if (num%2!=0) {
			prime=false;
			break;}
			else 
				prime=true;
			
			if (prime)
				System.out.print(num+"\t");
			count++;

	        System.out.println("total no"+count);
		}
		
			
	}
		


	}
	
	

