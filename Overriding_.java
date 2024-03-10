class A
{
    public int show(int n1, int n2)
    {
        return n1+n2;
    }
}

class B extends A
{
    public int show(int n1, int n2) // Method Overriding
    {
        return n1+n2+1;
    }
}

public class Overriding_
{
    public static void main(String args[])    
    {
        // In Methid Overriding multiple Methods have same Name and Parameters.

        B obj = new B();

        System.out.println(obj.show(4, 5));
    }
}
