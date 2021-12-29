import java.util.Scanner;
public class Table 
{
	public static void main(String[] args) 
	{
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to print it's table :");
		n = sc.nextInt();
		
		System.out.println(n+"'s Table :");
		for(int i=1 ; i<=10 ; i++)
		{
			System.out.println(n+"*"+i+"="+(n*i));
		}
		
		sc.close();
	}
}