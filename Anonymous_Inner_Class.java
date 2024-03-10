class A
{
    public void show()
    {
        System.out.println("in A show");
    }
}

abstract class B    // Abstract Class
{
    public abstract void display(); // Abstract Method
}

public class Anonymous_Inner_Class
{
    public static void main(String args[])
    {

        A obj = new A()
        {
            
            public void show()
            {
                System.out.println("in new show");
            }

        };

        obj.show();


        B obj1 = new B()    // you can create the Object of Abstract class only when implementing the Anonymous Class.
        {
            public void display()
            {
                System.out.println("in Abstract Anonymous Class");
            }    
        };

        obj1.display();

    }    
}
