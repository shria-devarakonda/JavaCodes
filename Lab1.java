package shria;
//Overriding and Inheritance
class rect 
{
    int l, b;
    protected void display()
    {
        System.out.println("length =" +l);
        System.out.println("breadth =" +b);
    }
    
}   
   class subrectangle extends rect
    {
     private int area;
     @Override
     protected void display()
     {
     area = l*b;
     System.out.println("Area =" +area);
     }
   }
class Lab1
{
    public static void main(String args[])
    {
        rect sp = new rect();
        subrectangle sb = new subrectangle();
        sb.l = sp.l = 23;
        sb.b = sp.b =  3;
        sp.display();
        sb.display();
    }
}