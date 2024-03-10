class A{
    public void show() throws ClassNotFoundException
    {
        
        Class.forName("Exception_Handling_Throws"); // critical statement
        
    }
}

public class Exception_Handling_Throws
{
    static
    {
        System.out.println("hello");
    }
    public static void main(String[] args)
    {
        // Ducking Exceptions(uses Throws):-

        A obj = new A();

        try
        {
            obj.show();
        }
        catch (ClassNotFoundException e)
        {
            
            e.printStackTrace();    // track and print entire stack of which method is calling which method
        }

        System.out.println("world");
    }
}
