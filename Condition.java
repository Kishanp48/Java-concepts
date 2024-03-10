public class Condition {
    public static void main(String args[])
    {
        int x=5;

        if(x>0)System.out.println(x); else System.out.println(0);

        if(x%2!=0)
        System.out.println("even");
        else
        System.out.println("odd");System.out.println(888);


        System.out.println(888);
    
        ////// without curly bracket, condition will only work for 1 line (statement) ///////

        ///// to pass multiple statements we must curly brackets /////

        int a=5;

        if(a==5)
        {
            System.out.println("Hello");
            System.out.println("Good Morning");
        }
        else{
            System.out.println("Bye");
            System.out.println("Good Night");
        }

        // ternary Operator:-

        // ?:

        // <condition> ? <run when condition is TRUE> : <run when condition is FALSE>

        int num=10;
        String result;

        result = num%2==0 ? "even" : "odd";

        System.out.println(result);


        // Switch case
        String day = "Sunday";

        switch(day)
        {
            case "Saturday", "Sunday":
                System.out.println("Holiday");
            break;
            default:
                System.out.println("sorry");
        }

        int test = 2, out;

        switch(test)
        {
            case 1 -> out = 1;

            case 2 -> out = 2;

            case 3 -> out = 3;

            default -> out = 0;
        }

        System.out.println(out);

    }
}
