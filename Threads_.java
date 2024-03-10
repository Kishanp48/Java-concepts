class A extends Thread
{
    public void run()
    {
        for(int i=1;i<=100;i++)
        {
            System.out.println("Hii");
            try
            {
                Thread.sleep(10);
            }
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
        }
    }
}


class B extends Thread
{
    public void run()
    {
        for(int i=1;i<=100;i++)
        {
            System.out.println("Hello");
            try
            {
                Thread.sleep(10);
            }
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
        }
    }
}

public class Threads_
{

    public static void main(String args[])
    {

        // Threads:- to execute two things at the same time or two behave(Methods) at the same time.

        // run() -  in every thread there must be a run() Method.
        // start() - used to execute the run() Method.
        // sleep() - use to sleep Thread for given milliSeconds in Arguments.
                    // sleep() Method will always throw an InterruptedException which is a Checked-Exceptions(which must have to handled).

        /* 
        
        priority is measured from 1 to 10:
        1 - Least priority
        .
        .
        5 - normal(default) priority
        .
        .
        10 - Highest priority
        
        by default every Thread have normal priority


        some constants in Thread Class:
            Thread.MAX_PRIORITY - 10
            Thread.MIN_PRIORITY - 1
            Thread.NORM_PRIORITY - 5

        */


        A obj1 = new A();
        B obj2 = new B();

        System.out.println(obj2.getPriority()); // to get priority
        obj2.setPriority(Thread.MAX_PRIORITY-1);
        System.out.println(obj2.getPriority()); // to get priority

        obj1.start();

        // just optimizing the code:
        try 
        {
            Thread.sleep(2);
        }
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }

        obj2.start();


        // Runable----------------------

    }     
}