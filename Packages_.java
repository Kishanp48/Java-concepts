import java.lang.*; // every JAVA file contains this Package by default.
                    // * means All the Files. (not folders)
import Package_demo.Demo_db;    // To Import/Access the file form defined location.

public class Packages_
{
    public static void main(String args[])    
    {
        Demo_db obj = new Demo_db();

        obj.show();

    }
}
