import java.util.Random;
import java.util.Scanner;
import java.math.BigInteger;

public class MD5
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while(true)
		{
			
			System.out.println("Enter a value of 0 to end the program.");
			
			System.out.println("Enter a value for primality test using Lehmann Algorithm : ");
			BigInteger p = in.nextBigInteger();
			
			if(p.equals(BigInteger.ZERO))break;
			
			if((p.mod(BigInteger.valueOf(2))).equals(BigInteger.ZERO))
			{
				System.out.println(p + " is not a prime number.");
				continue;
			}
			
			System.out.println("Enter the number of times the test should be repeated : ");
			int t = in.nextInt();
			
			int p1=0,n1=0,done=0;
			for(int i=0;i<t;i++)
			{
				
				BigInteger a;
				do {
				    a = new BigInteger(p.bitLength(), new Random());
				    
				} while (a.compareTo(p) >= 0);
				
				BigInteger pow = (p.subtract(BigInteger.ONE)).divide(BigInteger.valueOf(2));
				
				BigInteger res = a.modPow(pow, p);
				
				if((res.equals(BigInteger.ONE))||(res.equals(BigInteger.valueOf(-1))))
				{
					if(res.equals(BigInteger.ONE))p1++; 
					if(res.equals(BigInteger.valueOf(-1)))n1++;
				}
		
			}
			if(done==0)
			{
				if(((p1>=1)||(n1>=1))&&(p1<t)) System.out.println(p + " is probably a prime number with an error rate of "+ 100/Math.pow(2,t));
				else if((p1<=0)||(n1<=0)) System.out.println(p + " is definitely not prime number.");
			}
		}
		in.close();
	}
}