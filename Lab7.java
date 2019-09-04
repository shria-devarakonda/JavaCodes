

package shria;
import java.util.Scanner;
//nth prime number 
class Primo
{
  void primes()
  { 
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter n to compute the nth prime number: ");
    int nth = sc.nextInt(); 
    int num, count, i;
    num=1;
    count=0;
 
    while (count < nth){
      num=num+1;
      for (i = 2; i <= num; i++)
      { 
        if (num % i == 0) 
        {
          break;
        }
      }
      if ( i == num)
      {
        count = count+1;
      }
    }
    System.out.println("Value of nth prime: " + num);

    }
}
public class Lab7
{
    public static void main(String args[])
    {
        Primo p = new Primo();
        p.primes();
    }
}