class A
{
    public void show()
    {
        System.out.println("in A");
    }

    static class B
    {
        public void display()
        {
            System.out.println("in B");
        }
    }
}
public class Inner_Class
{
    public static void main(String[] args)
    {
        // you cannot create the Class Static if there is an Static InnerClass.

        A obj = new A();
        obj.show();

        // A.B obj1 = obj.new B();  // for Concrete InnerClass

        A.B obj1 = new A.B();   // for Static InnerClass
        obj1.display();



    }    
}
