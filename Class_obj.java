class Calculator
{
    public int add(int num1, int num2)
    {    
        return num1 + num2;
    }

    public int add(int num1, int num2, int num3)    // Method Overloading
    {    
        return num1 + num2 + num3;
    }
    
}

public class Class_obj
{

    public static void main(String args[])
    {
        Calculator calc = new Calculator();

          int n1=5, n2=6, n3=7;

          int result1 = calc.add(n1, n2);
          int result2 = calc.add(n1, n2, n3);   // Method Overloading

          System.out.println(result1);
          System.out.println(result2);
          

    }
}
