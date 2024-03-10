class KishanException extends Exception // to make user define Exceptions, you should extends the Exception Class as parent class
{
    public KishanException(String string)   // Perameterized Constructor
    {
        super(string);  // use to call Super class Constructor.
        // if you are passing any message while throwing user defined Exceptions,
        // you must pass that message as String type to the Super class Constructor.
    }
}
public class Exception_Handling
{
    public static void main(String[] args)
    {
        // Errors:-
            // 1. CompleTime Error
            // 2. RunTime Error [Exceptions]
            // 3. Logical Error    

            // Exception Handling:-

            // there are two types of statements are there,
            // normal statement
            // critical statement (which could throws error[exception] and stops program execution)

            // 
            // Try block - put critical statements inside it.
            // Catch block - catches/handles the Exceptions[error] (make error not effect the program execution).
            // Throw - use to throw the Exceptions. (**in Exception_Generating.java file**)
            // Throws - no need of using Try-Catch, just use this syntax [ Method_Name() throws Exception ] and it will throws Exceptions to outer method.
                        // use for checked Exceptions
            
            int a=18, b=20;
            int c=0;

            try{
                c=a/b;
                if(c==0)
                {
                    // throw new ArithmeticException();
                    throw new KishanException("no need of output zero");
                }
            }
            catch (KishanException e)   // user defined Exceptions
            {
                c=a/1;
                System.out.println("default output is: "+e);
            }
            // catch (ArithmeticException e)   // for Arithmatic Excetions
            // {
            //     c=a/1;
            //     System.out.println("default output is: "+e);
            // }
            catch (Exception e) // Catch block will only execute in case of Exception otherwise it will be skipped.
            {
                System.out.println("Something is wrong..");
            }

            System.out.println(c);
            System.out.println("program is running..");
            
            // There are lot of Exceptions are there:-

            // you can put multiple Catch blocks after Try block.
            // Exception is a Super Class and in that we have lots of Sub Classes.
            // you cannot put Parent Class Exception over(before) the Child class Exception,
            // (Exceptions also have the Parent and Child Classes)
            // Its a practice/compoulsary to put Catch block with Parent Class at the end.

            /*
            try{
                
            }
            catch (ArithmeticException e)   // for Arithmatic Excetions
            {
                
            }
            */



            /*
            try{
                
            }
            catch (ArrayIndexOutOfBoundsException e)    // for Array Index out of Bounds Exception
            {
                
            }
            */

            

            /*
            try{
                
            }
            catch (Exception e)    // for all kind of Exceptions
            {
                
            }
            */

    }    
}
