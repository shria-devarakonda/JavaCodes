
package shria;
//Digit Sum
 
import java.util.Scanner;

class things
{
	void sums()
	{
		int num =0;
		int rem =0;
		int sum =0;

		Scanner s = new Scanner(System.in);
		System.out.print("Enter your number: ");
		num = s.nextInt();

		while(num>0)
		{
			rem = num%10;
			num = num/10;
			sum = sum+rem;
		}
		System.out.println("The sum is: " +sum);

	}
}
class Lab15
{
	public static void main(String args[])
	{
		things t = new things();
		t.sums();
	}
}