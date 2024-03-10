class Human
{
    private int age = 20;
    private String name = "Kishan";

    public void setAge(int age)
    {
        this.age = age;     // can use 'this' also, if variable name are same. 'this' refers to the Current Object.
    }

    public void setName(String name)
    {
        this.name = name;   // can use 'this' also, if variable name are same. 'this' refers to the Current Object.
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

public class This_
{
    public static void main(String args[])
    {

        // if local variable name and Instance variable name are same in Methods.
        // We can use 'this' keyword.
        // 'this' refers to the Current Object.

        Human obj = new Human();

        
        System.out.println(obj.getName()+" : "+obj.getAge());
        
        obj.setAge(5);
        obj.setName("Rahul");
        
        System.out.println(obj.getName()+" : "+obj.getAge());

    }
}
