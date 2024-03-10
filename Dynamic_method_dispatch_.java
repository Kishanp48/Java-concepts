class A
{
    public void show()
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
class C extends A
{
    public void show()
    {
        System.out.println("in C show");
    }
}

public class Dynamic_method_dispatch_
{
    public static void main(String args[])    
    {

        // Dynamic Method Dispatch (Runtime Polymorphism) ----- 

        // A Refrence Variable of different class type can have object of another different Class,
        // only when the Object's class Extends that class(Refrence Variable's class).

        // the Object variable of Super Class can access the Methods of Sub classes' object,
        // only when both class have same Methods with same Arguments (Overriding).

        // (Inheritance is required..)
        // Only Child Objects have (are assigned to) the Parent Refrence Variable.
        
        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();


    }
}
