package numbers;
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) 
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a number");
	
	int n=s.nextInt();
	
	int rev =0;
	while(n!=0)
	{
		rev=rev*10+n%10;
		n=n/10;
	}
	System.out.println("Reverse Number is: "  +rev);
	}
}
		
	


