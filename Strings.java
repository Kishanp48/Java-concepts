public class Strings {
    public static void main(String[] args) {
        
        // String is a Class Not a Primitive Datatype

        String name1 = new String("Kishan");
        String name2 = "Rahul";
        
        System.out.println(name1);
        System.out.println(name2);

        //concate() - Concatination
        System.out.println(name1.concat(" Panchal"));
        System.out.println("Hello "+name1);

        //CharAt() - fatch spicific character from given Index
        System.out.println(name1.charAt(0));


        System.out.println("\n\n");

    


        /*
        Types of Strings
        1. Immutable String - cannot be changed.
        2. Mutable String - can be changed.
        */



        // 1. Immutable String - cannot be changed.
     
            // By default Strings are Immutable

            // The string is stored in SCP (*String Constant Pool*) in Heap Memory and the address is passed to the variable.
            // And if any another variable is assigned same value than that same address will be passed to new variable.
            // Means if there are many variables having same String value, the first String value will stored at once and the address of that value will passed to all other variables.

            /*
            When the value is assigned to the variable, first it will check if the String Constant Pool have that value or not.
            if available than the address of that value is passed to the Variable otherwise,
            that New String value is added to String Constant Pool and the address of that value is passed to the variable.
            */

            // String values are Case-Sensitive.

        String s1 = "Kishan";
        String s2 = "Kishan";

        System.out.println(s1==s2);


        
        System.out.println("\n\n");


            // If you concinate a String to an Existing String,

            
        String name = "Kishan";

        name = name + " Panchal";   //



            /*
            If you try to concatenate a String to an Existing String, That will not effect the Existing String.
            Because the Value is Constant in the String Constant Pool, It cannot be changed after adding.
            In behalf it will Add the Changed/Updated/Concinated String as a new value in the String Constant Pool,
            And the address of that value will be passed to that variable.

            The Old value will eligible for Garbage Collection. It will be removed after some time to get some Memory back. 
            */







        // 2. Mutable String - can be changed.

            // There are two types of classes are there for Mutable String,
            // A. StringBuffer - is Thread safe
            // B. StringBuilder - is not Thread safe






    }
}
