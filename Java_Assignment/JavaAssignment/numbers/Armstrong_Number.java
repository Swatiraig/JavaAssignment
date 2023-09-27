package numbers;

import java.util.Scanner;

public class Armstrong_Number {

	public static void main(String[] args) 
	{
		int sum=0,a,temp;
		Scanner s= new Scanner(System.in);
		
		System.out.println("enter a number");
		int num=s.nextInt();
		temp=num;
		while(num>0)
		{
			a=num%10;
			sum=sum+(a*a*a);
			num=num/10;
		}
		if(temp==sum)
			System.out.println("The given number is armstrong");
		else
			System.out.println("the given number is not armstrong");

	}

}
