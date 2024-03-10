import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Try_with_Resources
{
    public static void main(String[] args) throws NumberFormatException, IOException
    {
        // Finally block

        //--or--
        
        int num;

        // Try with Resources:-

        // closes resources automatically when Try gets over
        // used as a shortcut

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
        {

            num = Integer.parseInt(br.readLine());
        }


    }
}
