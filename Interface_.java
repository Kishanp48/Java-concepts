// Class -> Class   ;extends
// Interface -> Class   ;implements
// Interface -> Interface   ;extends

interface A
{
    int age=10;    // Final & Static
    String area="Ahmedabad";    // Final & Static

    // only Methods are Implemented to the Class not the Variables.

    void show();
    void config();
}

interface X
{
    void run();
}

interface Y extends X
{
    
}

class B implements A, Y
{
    public void show()
    {
        System.out.println("in show");
    }
    public void config()
    {
        System.out.println("in config");
    }

    public void run()
    {
        System.out.println("in run");
    }
}

/* 
    Types of Interfaces:-

    1. Normal Interface - have two or more Methods declared.
    2. Functional Interface / SAM(Single Abstract Method) - have only single Method declared.
    3. Marker Interface - have no Methods.

 */


public class Interface_
{
    public static void main(String[] args)
    {
        // go at top-----------^

        // Interface is not a Class.
        // you can implement multiple Interfaces into single Class.

        // Every Method in Interface are Public & Abstract by default.

        // you can create the Refrence Variable of Interface.
        // you cannot create the Object of Interface.

        // 'implement' keyword is used to Implement the Interface in Class
        // 'extends' keyword is used to extend a Interface to another Interface.

        // if you don't define all the Methods of Interface into Class,
        // by default that Class will become Abstract Class.

        // we can also define Variables in Interface but,
        // all the Variables are Final and Static by default.

        // only Methods are Implemented to the Class not the Variables.


       A obj = new B();

       obj.show();
       obj.config();

       System.out.println(A.age);
       System.out.println(A.area);

       X obj1 = new B();

       obj1.run();


    }
}
