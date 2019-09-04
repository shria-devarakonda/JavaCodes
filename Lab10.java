
package shria;
//Exception Handling
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


class exceps
{
	void one()
	{
		
		try
		{
			int i = 1/0;
			System.out.println(i);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic error, Value is infinity.\n");
		}


	}
	
	void two()
	{
		
		try
		{
			int a[] ={2, 3, 4, 5};
			for(int i =1; i<6; i++)
			{
				System.out.println(a[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array is out of bounds.\n");
		}

	}

	void three()
	{
		try
		{
			String s = null;
			
			System.out.println("Length is: " +s.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("Null pointer error.\n");
		}
	}

	void four()
	{
		try
		{
			String S ="Don't mess up my tempo.";
			char c = S.charAt(25);
			System.out.println(c);
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("String is out of bounds.\n");
		}

	}

	void five()
	{
		try
		{
			int num = Integer.parseInt("hello");
			System.out.println(num);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Number format error.\n");
		}
	}

	void six()
	{
		try
		{
			File file = new File("E://file.txt");
			FileReader fr = new FileReader(file);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File does not exist.\n");
		}
		finally
		{
			System.out.println("This will run anyway.\n");
		}
	}
}

public class Lab10
{
	public static void main(String[] args)
	{
		exceps n = new exceps();
		n.one();
		n.two();
		n.three();
		n.four();
		n.five();
		n.six();
	}
}