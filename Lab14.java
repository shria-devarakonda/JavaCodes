
package shria;
//Type Conversions
class Lab14
{
	public static void main(String args[])
	{
		double fe = 123l;
		int x = 2/3 + 8/9 + 9/10 + 9/10 + ((int)fe/10);
		System.out.println(x);
		double f = 2/3 + 8/9 + 9/10 + 9/10 + (fe/10)*2;
		System.out.println(f);
		int ff = ((int)2/3) + 4/3 + (int)5.7 * 2;
		System.out.println(ff);
		short a = 234;
		long b= a;
		System.out.println(b);
	}
}