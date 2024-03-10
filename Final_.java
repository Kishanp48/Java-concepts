/* final */class A
{
    public /* final */ void show()
    {
        System.out.println("in A show");
    }
}

class B extends A
{
    public void show()
    {
        System.out.println("in B show");
    }
}

public class Final_
{
    public static void main(String[] args)
    {
        // final means Constant

        // final - Variable, Method, Class.
        
        // Variable - makes value of variable Constant.
        // Class - prevents Inheriting into another Class.
        // Method - Prevents Overriding.

        final double pie = 3.14;    // Constant value

        B obj = new B();
        obj.show();



    }    
}
