class Mobile
{
    String brand;
    int price;
    
    static String type;

    public void show()
    {
        System.out.println(brand+" : "+price+" : "+type);
    }

    public static void display(Mobile x)
    {
        System.out.println("This is " + type +" : " + x.brand);
    }
}

public class Static_
{
    public static void main(String[] args)
    {

        // Static Variables are common/same for every Objects.
        // Static Methods are common/same for every Objects. We can't use non-static variables inside Static Method.
        

        Mobile p1 = new Mobile();
        Mobile p2 = new Mobile();

        p1.brand="Samsung";
        p1.price=45000;
        Mobile.type="SmartPhone";

        p2.brand="Apple";
        p2.price=150000;
        Mobile.type="SmartPhone";


        
        Mobile.type="Phone";
        
        
        p1.show();
        p2.show();

        Mobile.display(p1);
        
    }
}
