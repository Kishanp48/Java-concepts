class Human
{
    private int age = 20;
    private String name = "Kishan";

    public void setAge(int a) //Setters
    {
        age = a;
    }

    public void setName(String name)
    {
        this.name = name;   // can use 'this' also, if variable name are same. 'this' refers to the Current Object.
    }

    public int getAge() //Getters
    {
        return age;
    }

    public String getName()
    {
        return name;
    }

}

public class Encapsulation_
{
    public static void main(String args[])
    {

        // Encapsulation_ -------------------
        // We are Binding our Data with the Methods. The only way to access that Data is with Methods.
        // So no one from the outside world can use your Variables directly.


        Human obj = new Human();

        
        System.out.println(obj.getName()+" : "+obj.getAge());
        
        obj.setAge(5);
        obj.setName("Rahul");
        
        System.out.println(obj.getName()+" : "+obj.getAge());
        
    }
}
