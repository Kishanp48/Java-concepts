import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Finally_block
{
    public static void main(String args[]) throws NumberFormatException, IOException
    {
        int num = 0;

        // Finally:- 

        // use Finally to close resources manually
        // some time you have multiple object created so preffered to use Finally block instead of Try with Resources.

        BufferedReader br = null;
        
        try
        {
            br = new BufferedReader(new InputStreamReader(System.in));

            num = Integer.parseInt(br.readLine());
        }
        finally
        {
            br.close();
        }

        //--or--

        // Try with Resources:- (closes resources automatically when Try gets over)



    }   
}
