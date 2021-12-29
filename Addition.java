import java.util.Scanner;
public class Addition 
{
	public static void main(String[] args) 
	{
		int n1,n2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first value :");
		n1 = sc.nextInt();
		
		System.out.println("Enter the second value :");
		n2 = sc.nextInt();
		
		System.out.println("Addition : "+ (n1+n2));
		
		sc.close();
	}
}