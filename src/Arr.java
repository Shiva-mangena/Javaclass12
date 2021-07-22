
public class Arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int n, rem, i=100,sum=0;
        System.out.print("Armstrong numbers from 1 to 1000:");
      //  for(int i = 1; i <= 1000; i++)
        	while (i<999)
        {
            n = i;
         //   int sum=0;
            while(n > 0)
            {
                rem = n % 10;
                sum = sum + (rem * rem * rem);
                n = n / 10;
            }
            if(sum == i)
            {
                System.out.print(i+" ");
            }
            
            i++;
        }
    }

		
	}


