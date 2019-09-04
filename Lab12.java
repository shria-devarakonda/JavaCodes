/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shria;
//Practic (Logic)
class Lab12
{
	public static void main(String[] args)
	{
		int num = 10;
		int i =1;
		while (i<=12)
		{
			if(i%2==0)
			{
				num = num+2;
				i = i+5;
			}
			else
			{
				num = num-2;
				i= i-1;
			}
			System.out.println("Values of num and i respectively are: " + num + ", " + i);
		}
	}
}