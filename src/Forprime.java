
public class Forprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int num = 1; num<= 100; num++) {
			boolean prime = true;
			for (int i =2; i<num; i++) {
				 
				if (num%i== 0) {

					prime = false;
					break;
				} 
				else
					prime = true;

			}

			if (prime) {
				System.out.print(num + "\t");
			}
		}
		// .....................
	}
}
