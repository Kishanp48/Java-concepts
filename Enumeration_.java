enum Status
{
    // index starts with 0 (Zero).

    Running, Failed, Pending, Success;
}

public class Enumeration_
{
    public static void main(String[] args)
    {
        // Enumeration (enum):----

        // Enums are Constant Names.
        // used to pass status.
        // you cannot Extends Enum class.
        // you can create Constructors and Methods in Enum class.
        // all Enumeration classes Extends 'Enum Class bu default.
        

        Status s = Status.Success;

        System.out.println(s);

        
        System.out.println(s.ordinal());    // print Index according Enumeration Class.

        Status ss[] = Status.values();  // give all the Enums available.

        System.out.println(ss[0]);

        for (Status a : ss)
        {
            System.out.println(a + " : " + a.ordinal());
        }
        
        ////////////////////////


        // Working Enums with Conditional Statement:-

        Status st = Status.Pending;

        if(st == Status.Running) System.out.println("All Good");
        else
        if(st == Status.Failed) System.out.println("Try Again");
        else
        if(st == Status.Pending) System.out.println("Please Wait");
        else System.out.println("Done!");


        switch(st)
        {
            case Running:   System.out.println("All Good"); break;

            case Failed:    System.out.println("Try Again"); break;

            case Pending:   System.out.println("Please Wait"); break;

            default:    System.out.println("Done!");
        }
        

    }    
}
