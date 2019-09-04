
package shria;
//Scanner class and Factorial

import java.util.Scanner;
class Lab4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to factorialize: ");
		int num = sc.nextInt();
		int i =1;
		long facto = 1;
		while(i<= num)
		{
			facto = facto*i;
			i++;
		}
		System.out.println("Factorial of " +num +" is: " + facto);
	}
}