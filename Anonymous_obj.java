class A
{
    public A()
    {
        System.out.println("object created");
    }

    public void show()
    {
        System.out.println("in show");
    }
}

public class Anonymous_obj
{
    public static void main(String args[])    
    {

        //Anonymous Object ------------

        // Anonymous Object is not assined to any Variable, thats why it is called as Anonymous Object.
        // Anonymous objects are not reusable, because there is no refrence(Variable) for them, to call again.
        // Anonymous objects are only called when required.

        // It is one time use object.
        
        new A();    // anonymous object 1
        new A().show();     // anonymous object 2
        new A().show();     // anonymous object 3

    }
}
