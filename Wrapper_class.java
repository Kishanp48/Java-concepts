class Wrapper_class
{
    public static void main(String args[])
    {
        int num = 9;

        Integer num0 = new Integer(num); // boxing
        Integer num1 = num; // auto-boxing  //

        int num2 = num1.intValue(); // unboxing
        int num3 = num1; // auto-unboxing   //

        System.out.println(num2);

        String str = "12";

        int n = Integer.parseInt(str);

        System.out.println(n * 2);

    }
}