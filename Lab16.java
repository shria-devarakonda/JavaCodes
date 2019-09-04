package shria;
//File handling

import java.io.*;


class fileww
{
	void filewrite() throws IOException
	{
		FileWriter fw = new FileWriter("Hello.txt");
		String s = "Hello my name is Shria";
		 for (int i =0; i< s.length(); i++)
		 {
		 	fw.write(s.charAt(i));
		 }
		 System.out.println("Done Writing.\n");
		 fw.close();
	}

	void fileread() throws IOException
	{
		FileReader fr = null;
		try
		{
			fr = new FileReader("Hello.txt"); 
		}
		catch(FileNotFoundException e)
		{
			System.out.println("The file named Hello.txt is not available in the directory.");
		}
		int t;
		System.out.println("The file contains:");
		while((t = fr.read())!=-1)
		{
			System.out.print((char)t);
		}
		System.out.println("");
		fr.close();
	}

	void filebufe() throws IOException
	{
		File f = new File("Hello.txt");
		BufferedReader b = new BufferedReader(new FileReader(f));
		String s;
		while((s = b.readLine())!= null)
		{
			System.out.println(s);
		}
		
		b.close();
	}
}


class filerw
{
	public static void main (String[] args) throws IOException
	{
		fileww fww = new fileww();
		fww.filewrite();
		fww.fileread();
		fww.filebufe();

	}
}
