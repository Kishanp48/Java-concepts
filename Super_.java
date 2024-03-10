class A extends Object  // Every Class in JAVA extends the Object class
{
    public A()
    {
        super();
        System.out.println("In A");
    }
    
    public A(int a)
    {
        super();
        System.out.println("In A Int");
    }
}

class B extends A   // Inheritance
{
    public B()
    {
        super(5);       // call the Parameterized Constructor of the Super class
        System.out.println("In B");
    }

    public B(int b)
    {
        this(); // call the Constructor of the Same Class.
        System.out.println("In B Int");
    }
}

public class Super_
{
    public static void main(String args[])    
    {

        // Every Constructor in JAVA has a super Method by default, even if not mentioned.
        // Super Method must be the first statement inside the Constructor.

        // super();- call the Default Constructor of the Super class.
        // super('parameter');- call the Parameterized Constructor of the Super class.

        B obj = new B(5);

        // this(); - call the another Constructor of the same Class.
        // super(); - call the constructor of the Another Class based on the Arguments.

        // Every Class in JAVA extends the Object class, even if not nentioned.
 
    }
}

