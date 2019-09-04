
package shria;
//Reverse Number
import java.util.Scanner;

class ddd
{
	void rev()
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter your number to be reversed: ");
		int num = s.nextInt();
		int digit ;
		int rev = 0;

		while(num !=0)
		{
			digit = num%10;
			rev = rev*10 + digit;
			num = num/10;
		}
		System.out.println("The reversed number is: " +rev);
	}
}

public class Lab17
{
	public static void main(String args[])
	{
		ddd d = new ddd();
		d.rev();
	}
}