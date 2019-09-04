
package shria;
import java.util.Scanner;
//Encapsulation
class stuff
{
	private String name = "Shria";
	private int age = 20;
	private long phoneNumber = 1122334455;

	void getName()
	{
		System.out.println("Name: " +name);
	}

	void getAge()
	{
		System.out.println("Age: " +age);
	}

	void getPhone()
	{
		System.out.println("Phone Number: " +phoneNumber);
	}



	void setName(String newName)
	{

		name = newName;
	}	

	void setAge(int newAge)
	{
		age = newAge;
	}

	void setPhone(long newPhone)
	{
		phoneNumber = newPhone;
	}
}
public class Lab9
{
	public static void main(String[] args)
	{
		stuff ob = new stuff();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number that corresponds to what you require to know/ what action must be completed: \n 1 = name \n 2 = age \n 3 = Phone number \n 4 = update name \n 5 = update age \n 6 = update phone number \n 7 = entire info\n 8 = Quit");
		int ans = sc.nextInt();
		if (ans == 1)
		{
			ob.getName();

		}

		if (ans == 2)
		{
			ob.getAge();
		}
			if (ans == 3)
		{
			ob.getPhone();
		}

		if (ans == 4)
		{
			System.out.println("===Change name===");
			System.out.print("Old name:::: "); 
			ob.getName();
			sc.nextLine();

			System.out.println("Enter new Name:");
			String newName = sc.nextLine();
			ob.setName(newName);
			ob.getName();
		}

		if (ans ==5)
		{
			System.out.println("===Change age===");
			System.out.print("Old age:::: ");
			ob.getAge(); 
			System.out.println("Enter new age:");
			int newAge = sc.nextInt();
			ob.setAge(newAge);
			ob.getAge();
		}

		if (ans == 6)
		{
			System.out.println("===Change phone number===");
			System.out.print("Old phone number:::: "); 
			ob.getPhone();
			System.out.println("Enter new phone number:");
			long newPhone = sc.nextLong();
			ob.setPhone(newPhone);
			ob.getPhone();
		}

		if (ans == 7)
		{
			System.out.println("===Entire info===");
			ob.getName();
			ob.getAge();
			ob.getPhone();
		}

		if (ans == 8)
		{
			System.out.println("===Goodbye===");
		}
	}
}

