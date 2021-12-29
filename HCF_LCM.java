import java.util.Scanner;

public class HCF_LCM 
{
	public static void main(String[] args) 
	{
		int n1,n2,gcd = 1, lcm;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the First Number :");
		n1 = sc.nextInt();
		
		System.out.println("Enter the second Number :");
		n2 = sc.nextInt();
		
		for(int i=1 ; i<=n1 && i<=n2 ; i++)
		{
			if(n1 % i == 0 && n2 % i ==0)
				gcd =i;
		}
		lcm =(n1 * n2)/gcd;
		System.out.println("LCM is :"+lcm);
		System.out.println("GCD is :"+gcd);
	}
}
