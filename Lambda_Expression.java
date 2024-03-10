interface A
{
    void show();
}

interface B
{
    void display(int i);
}

class Lambda_Expression
{
    public static void main(String args[])
    {
        // Lambda Expression :- ' -> ' 
        /*
        A obj = new A()
        {
            public void show()
            {
                System.out.println("in Show");
            }
        };
        */
        
        // it's compilers job to completee the statement.
        
        A obj = () -> {
            System.out.println("in show");
        };

        B obj1 = i -> {
            System.out.println("in display " + i);
        };


        obj.show();
        obj1.display(5);

    }
}