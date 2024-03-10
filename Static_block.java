class Mobile
{

    String brand;
    int price;

    static  //Static block
    {
        System.out.println("static");
    }
    
    public Mobile() //Constructor
    {
        System.out.println("constructor");
    }
}

public class Static_block
{
    public static void main(String[] args) throws ClassNotFoundException
    {
        Class.forName("Mobile");    // to call class without creating object. //Class is a class.
                                                
    
    
    }
}
