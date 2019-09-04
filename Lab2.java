
package shria;
//Overloading
public class Lab2 { 
  
    
    private int sum(int x, int y) 
    { 
        return (x + y); 
    } 
  
    public int sum(int x, int y, int z) 
    { 
        return (x + y + z); 
    } 
  
    protected double sum(double x, double y) 
    { 
        return (x + y); 
    } 
  
    public static void main(String args[]) 
    { 
        Lab2 s = new Lab2();
        System.out.print("Sum of first method called sum: ");
        System.out.println(s.sum(10, 20));
        System.out.print("Sum of second method called sum: ");
        System.out.println(s.sum(10, 20, 30)); 
        System.out.print("Sum of third method called sum: ");
        System.out.println(s.sum(10.5, 20.5)); 
    } 
} 