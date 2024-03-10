import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class User_Input
{
    public static void main(String args[]) throws IOException   // useful but not recommended, use Try-Catch.
    {

        /*
        normal to ASCII values:-

        A -> 65
        a -> 97
        0 -> 48
        1 -> 49
        
        */
        
        System.out.print("enter value: ");
        
        // 1. Read Method:-
        int num = System.in.read(); // converts in ASCII value, but it takes only single character(not so useful)
        
        System.out.println("ASCII: "+num);
        System.out.println("Integer: "+(num-48));




        // 2. BufferedReader:-

            // BufferedReader is a resource.
            // BufferedReader can take input from anywhere like keyboard, file, network, etc.

            // Whenever BufferedReader is created it tries to access the InputStreamReader.
            InputStreamReader in = new InputStreamReader(System.in);    // InputStreamReader

            BufferedReader bf = new BufferedReader(in); // Mention the input source in the Constructor Arguments

            int num1 = Integer.parseInt(bf.readLine());

            System.out.println(num1);
            
            bf.close(); // (should) your responsibility to close it.


        // 3. Scanner:-

            // Scanner can take input from anywhere like keyboard, file, network

            Scanner sc = new Scanner(System.in);

            int num2 = sc.nextInt();

    }    
}
