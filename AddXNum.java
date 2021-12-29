import java.util.Scanner;
public class AddXNum 
{
	public static void main(String[] args) 
	{
		int n,n1,sum=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter how many numbers will you want to Add :");
		n = sc.nextInt();
		
		for(int i=0 ; i<n ;i++)
		{
			System.out.println("Enter "+(i+1)+" Number to add :");
			n1 = sc.nextInt();
			sum = sum+n1;
		}
		System.out.println("Sum : "+sum);
		
		sc.close();
	}
}
