package numbers;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		
		int num=s.nextInt();
		
		int org_num=num;
		int rev=0;
		
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
	}
	if(org_num==rev)
	{
		System.out.println(org_num+" Palindrome Number");
	}
	else
	{
		System.out.println(org_num+" Not Palindrome Number");
	}
	}
}
