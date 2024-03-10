class Human
{
    private int age;
    private String name;

    public Human() // Default-Constructor
    {

        System.out.println("Hello");

        age = 5;
        name = "Rahul";
    }

    public Human(int age, String n)   // Parameterized-Constructor
    {
        this.age = age; // this
        name = n;
    }

    public Human(String n)   // Parameterized-Constructor
    {
        this.age = 12; // this
        name = n;
    }



    public void setAge(int a)
    {
        age = a;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public String getName()
    {
        return name;
    }

}


public class Constructor_
{
    public static void main(String args[])
    {
        // The Constructor is a special Method.
        // It has a same name as a class name.
        // Constructor never Returns anything.

     
        // ..............As an Idea or it's a Standards which should follow,
        // Whenever you want to perform any operation, always do that in a Method. Don't do it openly.

        // The DataBase connections are also written in the Constructor.

        // If there is no Constructor is mentioned in Class, Default constructor will automatically created at compile time.


        Human obj = new Human();    // Constructor is called automatically when Object is created.
        Human obj2 = new Human(18,"Chirag");   // Constructor is called automatically when Object is created.
        Human obj3 = new Human( "Chirag");   // Constructor is called automatically when Object is created.

        System.out.println(obj.getName()+" : "+obj.getAge());
        System.out.println(obj2.getName()+" : "+obj2.getAge());
        
        obj.setAge(20);
        obj.setName("Kishan");
        
        System.out.println(obj.getName()+" : "+obj.getAge());



    }
}
