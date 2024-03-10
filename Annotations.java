@FunctionalInterface    // intention of having Functional-Interface(Interface having only single Method).
interface X
{
    void Hello();
}

class A
{
    public void TheOutputDataForScreen()
    {
        System.out.println("in A show");
    }
}
class B extends A
{
    @Override   // intention of Overriding.
    public void TheOutputDataForScreen()
    {
        System.out.println("in B show");
    }
}

@Deprecated // intention of Deprecated.
class C
{
    public void display()
    {
        System.out.println("in C display");
    }
}

public class Annotations
{
    public static void main(String[] args)
    {

        // Annotations are used to make Comunication with Compiler.

        B obj = new B();
        
        obj.TheOutputDataForScreen();

        C obj1 = new C();

        obj1.display();
        
    }    
}
