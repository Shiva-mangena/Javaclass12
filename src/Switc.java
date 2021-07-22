
public class Switc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num =1;
		int x =2;
			
			/*while (num<=50) {
				
				if (num%2!=0) {
					System.out.println(num+"is odd number");
					
				}
				num++;
			}*/
			
			while(num<50) {
				while(x<50) {
					if(num%x!=1) {
						System.out.println(num);
					}
					x++;
				}
				
				num++;
				
			}
	
	
	}

}
