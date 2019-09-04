
package shria;

import java.util.Scanner;
import java.util.Random;
interface myinter
{
	void hello(int a);
	void bye(int b);
}

class helloclass implements myinter 
{
	@Override
	public void hello(int wow)
	{	
		System.out.println("the number of things needed: " + wow);
	}

        @Override
	public void bye(int day)
	{
		day =2;
		System.out.println(+day);
		System.out.println("What is your name?");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("Deaths?");
		int deaths = sc.nextInt();
		System.out.println("Goodbye, "+ name);
		System.out.println("You have died "+ deaths +" times.");
	}
}

class goodbyeclass implements myinter
{
	@Override
	public void hello(int newint)
	{
		System.out.println("Enter your number:");
		Scanner sc = new Scanner(System.in);
		int inty = sc.nextInt();
		Random r = new Random();
		int magicnumber = r.nextInt(100);
		int i = inty + newint + magicnumber;

		System.out.println("Your new number is: " +i);
	}
	@Override
	public void bye(int g)
	{	
		System.out.println("the number of things needed: " +g );
	}

}

public class Lab3
{
	public static void main(String[] args)
	{
		helloclass ob = new helloclass();
		ob.hello(7);
		ob.bye(6);
		goodbyeclass ob1 = new goodbyeclass();
		ob1.hello(12);
		ob1.bye(4);


	}
}